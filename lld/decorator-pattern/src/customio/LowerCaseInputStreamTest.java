package customio;

import java.io.*;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class LowerCaseInputStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("lld/decorator-pattern/src/customio/input.txt")));
            OutputStream ou = new BufferedOutputStream(new FileOutputStream("lld/decorator-pattern/src/customio/output.txt"));
            OutputStream ou2 = new ZipOutputStream(new FileOutputStream("lld/decorator-pattern/src/customio/output.zip"));
            while ((c = in.read()) >= 0) {
                ou.write((char) c);
                ou2.write((char) c);
                System.out.print((char) c);
            }
            in.close();
            ou.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ZipInputStream zin = new ZipInputStream(new FileInputStream("lld/decorator-pattern/src/customio/output.zip"));
            ZipEntry entry;
            while((entry = zin.getNextEntry())!=null){
                System.out.printf("File: %s Modified on %TD %n",
                        entry.getName(), new Date(entry.getTime()));
                extractFile(entry, zin);
                System.out.printf("Zip file %s extracted successfully.", "lld/decorator-pattern/src/customio/zipoutput.txt");
                zin.closeEntry();
            }
            zin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractFile(final ZipEntry entry, ZipInputStream is)
            throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(entry.getName());
            final byte[] buf = new byte[1024];
            int read = 0;
            int length;
            while ((length = is.read(buf, 0, buf.length)) >= 0) {
                fos.write(buf, 0, length);
            }
        } catch (IOException ioex) {
            fos.close();
        }
    }
}

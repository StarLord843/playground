import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n != m) return false;
        int[] fmap1 = new int[n];
        int[] fmap2 = new int[m];

        for (int i=0; i<n; i++) {
            fmap1[word1.charAt(i) - 'a']++;
        }
        for (int i=0; i<m; i++) {
            fmap2[word2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(fmap1));
        System.out.println(Arrays.toString(fmap2));
        for (int i=0; i<26; i++) {
            if ((fmap1[i] == 0) == (fmap2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(fmap1);
        Arrays.sort(fmap2);
        for (int i=0; i<26; i++) {
            if (fmap1[i] != fmap2[i]) {
                return false;
            }
        }
        return true;
    }
}
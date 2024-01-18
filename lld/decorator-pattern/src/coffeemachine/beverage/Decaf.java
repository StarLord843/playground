package coffeemachine.beverage;

public class Decaf extends Beverage {
    public Decaf() {
        super("Decaf Coffee");
    }

    @Override
    public float cost() {
        return 40;
    }
}

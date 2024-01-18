package coffeemachine.beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso Coffee");
    }

    @Override
    public float cost() {
        return 30;
    }
}

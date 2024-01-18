package coffeemachine.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("DarkRoast Coffee");
    }

    @Override
    public float cost() {
        return 20;
    }
}

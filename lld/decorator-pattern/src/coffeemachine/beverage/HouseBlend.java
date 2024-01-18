package coffeemachine.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super("House Blend Coffee");
    }

    @Override
    public float cost() {
        return 10;
    }
}

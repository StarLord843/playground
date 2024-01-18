package coffeemachine.decorator;

import coffeemachine.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return getBeverage().cost() + 5;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }
}

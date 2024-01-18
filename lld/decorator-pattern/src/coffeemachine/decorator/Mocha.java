package coffeemachine.decorator;

import coffeemachine.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return getBeverage().cost() + 1;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Mocha";
    }
}

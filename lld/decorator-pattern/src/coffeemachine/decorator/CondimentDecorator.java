package coffeemachine.decorator;

import coffeemachine.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    private final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        super("hello");
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return this.beverage;
    }

    public abstract String getDescription();
}

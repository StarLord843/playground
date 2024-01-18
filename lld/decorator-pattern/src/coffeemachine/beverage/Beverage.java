package coffeemachine.beverage;

public abstract class Beverage {
    private String description = "Unknown Beverage";

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}

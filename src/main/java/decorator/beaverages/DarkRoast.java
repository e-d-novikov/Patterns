package decorator.beaverages;

import decorator.sizes.Size;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Espresso";
    }

    public double cost() {
        return 1.29;
    }
}

package factory.pizza;

import factory.factory.ingridients.cheese.Cheese;
import factory.factory.ingridients.clams.Clams;
import factory.factory.ingridients.dough.Dough;
import factory.factory.ingridients.pepperoni.Pepperoni;
import factory.factory.ingridients.sauce.Sauce;
import factory.factory.ingridients.veggies.Veggies;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name;
    }
}

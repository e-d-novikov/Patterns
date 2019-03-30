package factory.factory.factoryes;

import factory.factory.ingridients.cheese.Cheese;
import factory.factory.ingridients.cheese.ReggianoCheese;
import factory.factory.ingridients.clams.Clams;
import factory.factory.ingridients.clams.FreshClams;
import factory.factory.ingridients.dough.Dough;
import factory.factory.ingridients.dough.ThinCrustDough;
import factory.factory.ingridients.pepperoni.Pepperoni;
import factory.factory.ingridients.pepperoni.SlicedPepperoni;
import factory.factory.ingridients.sauce.MarinaraSauce;
import factory.factory.ingridients.sauce.Sauce;
import factory.factory.ingridients.veggies.*;

public class NYPizzaIngridientFactory implements PizzaIngridientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}

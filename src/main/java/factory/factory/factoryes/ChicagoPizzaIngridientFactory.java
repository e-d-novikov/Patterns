package factory.factory.factoryes;

import factory.factory.ingridients.cheese.Cheese;
import factory.factory.ingridients.cheese.Mozarella;
import factory.factory.ingridients.clams.Clams;
import factory.factory.ingridients.clams.FrozenClams;
import factory.factory.ingridients.dough.Dough;
import factory.factory.ingridients.dough.ThickCrustDough;
import factory.factory.ingridients.pepperoni.Pepperoni;
import factory.factory.ingridients.pepperoni.SlicedPepperoni;
import factory.factory.ingridients.sauce.PlumTomatoSauce;
import factory.factory.ingridients.sauce.Sauce;
import factory.factory.ingridients.veggies.*;

public class ChicagoPizzaIngridientFactory implements PizzaIngridientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new Mozarella();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new EggPlant(), new Spinach()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}

package factory.factory.factoryes;

import factory.factory.ingridients.cheese.Cheese;
import factory.factory.ingridients.clams.Clams;
import factory.factory.ingridients.dough.Dough;
import factory.factory.ingridients.pepperoni.Pepperoni;
import factory.factory.ingridients.sauce.Sauce;
import factory.factory.ingridients.veggies.Veggies;

public interface PizzaIngridientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}

package factory.pizza;

import factory.factory.factoryes.PizzaIngridientFactory;

public class ClamPizza extends Pizza {

    PizzaIngridientFactory ingridientFactory;

    public ClamPizza(PizzaIngridientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clams = ingridientFactory.createClam();
    }
}

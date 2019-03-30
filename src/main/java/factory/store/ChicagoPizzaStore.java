package factory.store;

import factory.factory.factoryes.ChicagoPizzaIngridientFactory;
import factory.factory.factoryes.PizzaIngridientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new ChicagoPizzaIngridientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingridientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingridientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        return pizza;
    }
}

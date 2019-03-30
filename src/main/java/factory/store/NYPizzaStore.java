package factory.store;

import factory.factory.factoryes.NYPizzaIngridientFactory;
import factory.factory.factoryes.PizzaIngridientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngridientFactory ingridientFactory = new NYPizzaIngridientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingridientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingridientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}

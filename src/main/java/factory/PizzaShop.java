package factory;

import factory.pizza.Pizza;
import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class PizzaShop {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizzaOne = nyStore.orderPizza("cheese");
        Pizza pizzaTwo = chicagoStore.orderPizza("cheese");
    }
}

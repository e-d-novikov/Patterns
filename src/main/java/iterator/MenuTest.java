package iterator;

public class MenuTest {
    public static void main(String[] args) {

        MenuComponent pancake = new Menu("PANCAKE HOUSE MENU", "Breackfast");
        pancake.add(new MenuItem("K&B's Pancake Breackfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99));

        pancake.add(new MenuItem("Regular Pancake Breackfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99));

        pancake.add(new MenuItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49));

        pancake.add(new MenuItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59));


        MenuComponent diner = new Menu("DINER MENU", "Lunch");
        diner.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99));

        diner.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99));

        diner.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false,
                3.29));

        diner.add(new MenuItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05));


        MenuComponent cafe = new Menu("CAFE MENU", "Dinner");
        cafe.add(new MenuItem("Veggie Burger and Air Fries",
                "Veggie burger on  a whole wheat bun, lettuce, tomato, and fries",
                true,
                3.99));

        cafe.add(new MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69));

        cafe.add(new MenuItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true,
                4.29));


        MenuComponent desert = new Menu("DESSERT MENU", "Desert");
        desert.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        cafe.add(desert);

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancake);
        allMenus.add(diner);
        allMenus.add(cafe);


        Waitress waitress = new Waitress(allMenus);
        //waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}

package template;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public void boilWater() {
        System.out.println("Boiling wather");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }
}

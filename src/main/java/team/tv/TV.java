package team.tv;

public class TV {

    String name;
    boolean on;

    public TV(String name) {
        this.name = name;
        on = false;
    }

    public void on() {
        System.out.println("TV ON");
        on = true;
    }

    public void off() {
        System.out.println(("TV OFF"));
        on = false;
    }
}

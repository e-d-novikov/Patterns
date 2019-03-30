package condition.states;

import condition.GumballMachine;

public class SoldOutState implements State {

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrunk() {
        System.out.println("You turned, but there no gumballs");
    }

    public void dispense() {
        System.out.println("No gumballs dispensed");
    }
}

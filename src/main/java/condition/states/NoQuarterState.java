package condition.states;

import condition.GumballMachine;

import java.rmi.RemoteException;

public class NoQuarterState implements State {

    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() throws RemoteException {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrunk() {
        System.out.println("You tured, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}

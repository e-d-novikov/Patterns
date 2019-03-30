package condition;

import condition.states.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    String location;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() throws RemoteException {
        state.insertQuarter();
    }

    public void ejectQuarter() throws RemoteException {
        state.ejectQuarter();
    }


    public void turnCrank() throws RemoteException {
        state.turnCrunk();
    }

    public void dispense() throws RemoteException {
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() throws RemoteException {
        return soldOutState;
    }

    public State getNoQuarterState() throws RemoteException {
        return noQuarterState;
    }

    public State getHasQuarterState() throws RemoteException {
        return hasQuarterState;
    }

    public State getSoldState() throws RemoteException {
        return soldState;
    }

    public State getWinnerState() throws RemoteException {
        return winnerState;
    }

    public State getState() throws RemoteException {
        return state;
    }

    public int getCount() throws RemoteException {
        return count;
    }

    public String getLocation() throws RemoteException {
        return null;
    }

    public String toString() {
        return String.valueOf(this.count);
    }
}

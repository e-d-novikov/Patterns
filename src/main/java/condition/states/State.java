package condition.states;

import java.io.Serializable;
import java.rmi.RemoteException;

public interface State extends Serializable {
    void insertQuarter() throws RemoteException;
    void ejectQuarter() throws RemoteException;
    void turnCrunk() throws RemoteException;
    void dispense() throws RemoteException;
}

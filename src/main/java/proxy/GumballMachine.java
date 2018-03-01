package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
    private String location;
    private int count;
    private State state;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
    }

    public String getLocation(){
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }
}

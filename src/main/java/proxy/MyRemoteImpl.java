package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    public String sayHello() throws RemoteException {
        return "Sever says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException{};

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

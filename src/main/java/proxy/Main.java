package proxy;

import java.rmi.Naming;

public class Main {
    public static void main(String[] args){
        int count = 4;
        try{
            GumballMachine gumballMachine = new GumballMachine("kang-nam", count);
            Naming.rebind("//", gumballMachine);
            GumballMonitor monitor = new GumballMonitor(gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        monitor.report();
    }
}

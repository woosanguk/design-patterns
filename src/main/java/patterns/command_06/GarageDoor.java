package patterns.command_06;

public class GarageDoor {
    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    void up(){
        System.out.println(this.name + "GarageDoor is UP");
    };
    void down(){
        System.out.println(this.name + "GarageDoor is down");
    };

    void stop(){
        System.out.println(this.name + "GarageDoor is stop");
    };

    void lightOn(){
        System.out.println(this.name + "GarageDoor Light is ON");
    };

    void lightOff(){
        System.out.println(this.name + "GarageDoor Light is OFF");
    };
}

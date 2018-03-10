package patterns.command_06;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;
    private final String location;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    void high(){
        speed = HIGH;
        System.out.println(this.location + " CeilingFan is high");
    }

    void medium(){
        speed = MEDIUM;
        System.out.println(this.location + " CeilingFan is medium");
    }

    void low(){
        speed = LOW;
        System.out.println(this.location + " CeilingFan is low");
    }

    void off() {
        speed = OFF;
        System.out.println(this.location + " CeilingFan is off");
    }

    public int getSpeed(){
        return speed;
    }


}

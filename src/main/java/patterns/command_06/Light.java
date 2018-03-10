package patterns.command_06;

class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    void on() {
        System.out.println(this.name + "Light is ON");
    }

    void off() {
        System.out.println(this.name + "Light is OFF");
    }
}

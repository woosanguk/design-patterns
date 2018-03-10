package patterns.command_06;

class Stereo {
    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(this.name + "Stereo is ON");
    };
    void off(){
        System.out.println(this.name + "Stereo is OFF");
    };
    void setCd(){
        System.out.println(this.name + "Stereo set cd OFF");
    };
    void setDvd(){
        System.out.println(this.name + "Stereo set dvd");
    };
    void setRadio(){
        System.out.println(this.name + "Stereo set radio");
    };
    void setVolume(int volume){
        System.out.println(this.name + "Stereo set volume : " + volume);
    };
}

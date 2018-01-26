package facade;

interface Amplifier {
    void on();

    void setSurroundSound();

    void setVolume(int i);

    void setDvd(DvdPlayer dvd);

    void off();
}

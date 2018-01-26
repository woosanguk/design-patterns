package facade;

interface DvdPlayer {
    void on();

    void play(String movie);

    void stop();

    void eject();

    void off();
}

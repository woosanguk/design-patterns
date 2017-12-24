package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private  Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: ");
    }

    public void update() {
        display();
    }
}

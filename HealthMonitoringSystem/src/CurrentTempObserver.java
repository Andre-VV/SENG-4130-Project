import java.util.Observable;

public class CurrentTempObserver implements Observer, DisplayElement {
    private int temperature;
    private Subject sensor;
    public CurrentTempObserver(Subject sensor){
        this.sensor = sensor;
        sensor.registerObserver(this);
    }
    public void update(int heartRate, int temperature, int airFlow){
        this.temperature = temperature;
    }
    public void display() {
        System.out.println("Current temperature: " + temperature);
    }

}

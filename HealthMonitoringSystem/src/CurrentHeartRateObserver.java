public class CurrentHeartRateObserver implements Observer,DisplayElement{
    private int heartRate;
    private Subject sensor;

    public CurrentHeartRateObserver(Subject sensor){
        this.sensor = sensor;
        sensor.registerObserver(this);
    }
    public void update(int heartRate, int temperature, int airFlow){
        this.heartRate = heartRate;
    }
    public void display(){
        System.out.println("Current heart rate is "+heartRate);
    }

}

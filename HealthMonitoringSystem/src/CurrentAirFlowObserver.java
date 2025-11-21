public class CurrentAirFlowObserver implements Observer, DisplayElement {
    private int airFlow;
    private Subject sensor;
    public CurrentAirFlowObserver(Subject sensor){
        this.sensor = sensor;
        sensor.registerObserver(this);
    }
    public void update(int heartRate, int temperature, int airFlow){
        this.airFlow = airFlow;
    }
    public void display() {
        System.out.println("Current air flow is "+airFlow);
    }
}

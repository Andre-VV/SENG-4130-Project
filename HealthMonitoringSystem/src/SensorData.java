import java.util.ArrayList;

public class SensorData implements Subject{
    private int heartRate;
    private int temperature;
    private int airFlow;
    private ArrayList<Observer> observers;

    public SensorData(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(heartRate,temperature,airFlow);
        }
        System.out.println();
    }
    public void measurmentsChanged(){
        notifyObservers();
    }
    public void setMeasurment(int heartRate, int temperature, int airFlow){
        this.heartRate = heartRate;
        this.temperature = temperature;
        this.airFlow = airFlow;
        measurmentsChanged();
    }
}

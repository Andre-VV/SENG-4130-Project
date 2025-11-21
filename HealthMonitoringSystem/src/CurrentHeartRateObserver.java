public class CurrentHeartRateObserver implements Observer,DisplayElement{
    private int heartRate;
    private Subject sensor;

    public CurrentHeartRateObserver(Subject sensor){
        this.sensor = sensor;
        sensor.registerObserver(this);
    }
    public void update(int heartRate, int temperature, int airFlow){
        this.heartRate = heartRate;
        display();
    }
    public void display() {
        System.out.println("Current heart rate is " + heartRate + test(heartRate));
    }
    public String test(int heartRate){

        //tachycardia is if heart rate is above 100
        if(heartRate > 100){
            return " Alert!!!!! Tachycardia";
        }

        //Bradycardia is if heart rate is below 60
        if(heartRate < 60){
            if(heartRate == 0){
                return " Alert!!!!! no pulse";
            }
            else{
                return " Alert!!!!! Bradycardia";
            }
        }
        return "";


    }


}

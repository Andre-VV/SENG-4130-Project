public class main {
    public static void main(String[] args) {
        SensorData sensorData = new SensorData();

        CurrentHeartRateObserver currentHeartRateObserver = new CurrentHeartRateObserver(sensorData);
        CurrentTempObserver currentTempObserver = new CurrentTempObserver(sensorData);
        CurrentAirFlowObserver currentAirFlowObserver =  new CurrentAirFlowObserver(sensorData);

        for(int i =90; i <105;i++){
            sensorData.setMeasurment(i,37,6);
        }
    }
}

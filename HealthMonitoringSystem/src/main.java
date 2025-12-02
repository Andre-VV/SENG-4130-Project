public class main {
    public static void main(String[] args) {
        /*
        SensorData sensorData = new SensorData();

        CurrentHeartRateObserver currentHeartRateObserver = new CurrentHeartRateObserver(sensorData);
        CurrentTempObserver currentTempObserver = new CurrentTempObserver(sensorData);
        CurrentAirFlowObserver currentAirFlowObserver =  new CurrentAirFlowObserver(sensorData);

        for(int i =90; i <105;i++){
            sensorData.setMeasurment(i,37,6);
        }

         */
        Patient patient1 = new Patient("John","Doe","123");

        patient1.DisplayPatientInfo();
        for(int i =90; i <105;i++){
            patient1.setMeasurments(i,30,1);
        }
    }
}

public class Patient{
    SensorData sensorData;
    /*
    CurrentHeartRateObserver currentHeartRateObserver;
    CurrentTempObserver currentTempObserver;
    CurrentAirFlowObserver currentAirFlowObserver;

     */
    Observer currentHeartRateObserver;
    Observer currentTempObserver;
    Observer currentAirFlowObserver;

    UnifiedObserverFactory factory = new UnifiedObserverFactory();
    String FirstName;
    String LastName;
    String PatientID;

    public Patient(String FirstName, String LastName, String PatientID){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PatientID = PatientID;
        sensorData = new SensorData();
        currentHeartRateObserver = factory.createObserver("heartrate",sensorData);
        currentAirFlowObserver = factory.createObserver("airflow",sensorData);
        currentTempObserver = factory.createObserver("temp",sensorData);
    }

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getPatientID() {
        return PatientID;
    }

    public void setMeasurments(int heartRate, int temperature, int airFlow){
        sensorData.setMeasurment(heartRate, temperature, airFlow);
    }

    public void DisplayPatientInfo(){
        System.out.println(FirstName+" "+LastName+"\n"+PatientID);
    }
    public void DisplayPatientCondition(){
        DisplayPatientInfo();
        sensorData.notifyObservers();
    }
}

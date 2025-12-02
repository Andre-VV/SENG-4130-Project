public class Patient{
    SensorData sensorData;
    CurrentHeartRateObserver currentHeartRateObserver;
    CurrentTempObserver currentTempObserver;
    CurrentAirFlowObserver currentAirFlowObserver;

    String FirstName;
    String LastName;
    String PatientID;

    public Patient(String FirstName, String LastName, String PatientID){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PatientID = PatientID;
        sensorData = new SensorData();
        currentHeartRateObserver = new CurrentHeartRateObserver(sensorData);
        currentTempObserver = new CurrentTempObserver(sensorData);
        currentAirFlowObserver = new CurrentAirFlowObserver(sensorData);
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

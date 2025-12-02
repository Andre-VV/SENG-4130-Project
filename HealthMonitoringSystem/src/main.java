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
        Patient patient1 = new Patient("John","Doe","001");
        Patient patient2 = new Patient("Jane","Doe","002");
        Patient patient3 = new Patient("Bill","Doe","003");
        Hospital hospital1 = new Hospital("001","TRUH");

        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);
        hospital1.addPatient(patient3);

        for(int i =95; i <105;i++){
            patient1.setMeasurments(i,30,1);
            patient2.setMeasurments(i,30,2);
            patient3.setMeasurments(i,30,3);
        }

        hospital1.HospitalDisplayConditions();



        /*
        patient1.DisplayPatientInfo();

        for(int i =95; i <105;i++){
            patient1.setMeasurments(i,30,1);
        }
        patient1.DisplayPatientCondition();

         */
    }
}

import java.util.ArrayList;

public class Hospital {
    private String HospitalID;
    private String HospitalName;
    private ArrayList<Patient> PatientList;

    public Hospital(String HospitalID, String HospitalName) {
        this.HospitalID = HospitalID;
        this.HospitalName = HospitalName;
        PatientList = new ArrayList<Patient>();
    }
    public void addPatient(Patient patient) {
        PatientList.add(patient);
    }
    public void removePatient(Patient patient) {
        int index = PatientList.indexOf(patient);
        if(index>=0){
            PatientList.remove(index);

        }
    }
    public String getHospitalID() {
        return HospitalID;
    }
    public void setHospitalID(String HospitalID) {
        this.HospitalID = HospitalID;
    }
    public String getHospitalName() {
        return HospitalName;
    }
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public void CheckPatientConditions(){
        for(Patient patient:PatientList){
            patient.DisplayPatientCondition();
            System.out.println();
        }
    }
    public void HospitalDisplayConditions(){
        System.out.println(HospitalName);
        System.out.println(HospitalID);
        CheckPatientConditions();
    }



}

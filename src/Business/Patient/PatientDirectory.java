/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author krishnamayavat
 */
import java.util.ArrayList;
import java.util.List;
public class PatientDirectory {
    private List<Patient> patientlist;
    public PatientDirectory(){
        patientlist = new ArrayList<>();
    }

    public List<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(List<Patient> patientlist) {
        this.patientlist = patientlist;
    }

    public Patient addPatient(){
        Patient newPatient = new Patient();
        patientlist.add(newPatient);
        return newPatient;
    }
    
}

package model;

import model.abstractions.Patient;
import controller.dto.AdultPatientDTO;
import controller.dto.PatientDTO;

public class AdultPatient extends Patient {

    private boolean working;
    private boolean smoker;
    private boolean alcoholism;

    public AdultPatient(PatientDTO patientDTO, AdultPatientDTO patient) {
        super(patientDTO);
        this.working = patient.isWorking();
        this.smoker = patient.isSmoker();
        this.alcoholism = patient.isAlcoholism();
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Age: " + age + "\n");
        sb.append("ID: " + ID + "\n");
        sb.append("Work: " + (this.working ? "Yes" : "No") + "\n");
        sb.append("Smoker: " + (this.smoker ? "Yes" : "No") + "\n");
        sb.append("Alcoholism: " + (this.alcoholism ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}

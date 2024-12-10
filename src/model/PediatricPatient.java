package model;

import model.abstractions.Patient;
import controller.dto.PatientDTO;
import controller.dto.PediatricPatientDTO;

public class PediatricPatient extends Patient {

    private int gestationalAge;
    private double birthWeight;
    private boolean immunization;

    public PediatricPatient(PatientDTO patientDTO, PediatricPatientDTO patient) {
        super(patientDTO);
        this.gestationalAge = patient.getGestionalAge();
        this.birthWeight = patient.getBirthWeight();
        this.immunization = patient.isInmunization();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Age: " + age + "\n");
        sb.append("ID: " + ID + "\n");
        sb.append("Gestational Age: " + gestationalAge + "\n");
        sb.append("Birth Weight: " + birthWeight + "\n");
        sb.append("Immunization: " + (immunization ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}
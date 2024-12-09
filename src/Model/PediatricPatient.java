package Model;

import Model.DTO.PediatricPatientDTO;

public class PediatricPatient extends Patient {

    private int gestationalAge;
    private double birthWeight;
    private boolean immunization;

    public PediatricPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }


    @Override
    public void assignPatient(PediatricPatientDTO patient) {
        this.gestationalAge = patient.getGestionalAge();
        this.birthWeight = patient.getBirthWeight();
        this.immunization = patient.isInmunization();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("ID: " + getID() + "\n");
        sb.append("Gestational Age: " + gestationalAge + "\n");
        sb.append("Birth Weight: " + birthWeight + "\n");
        sb.append("Immunization: " + (immunization ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}

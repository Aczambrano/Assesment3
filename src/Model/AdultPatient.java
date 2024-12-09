package Model;

import Model.DTO.AdultPatientDTO;

public class AdultPatient extends Patient {

    private boolean working;
    private boolean smoker;
    private boolean alcoholism;

    public AdultPatient(String name, int age, long ID) {
        setName(name);
        setID(ID);
        setAge(age);
    }

    @Override
    public void assignPatient(AdultPatientDTO patient) {
        this.working = patient.isWorking();
        this.smoker = patient.isSmoker();
        this.alcoholism = patient.isAlcoholism();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + getName() + "\n");
        sb.append("Age: " + getAge() + "\n");
        sb.append("ID: " + getID() + "\n");
        sb.append("Work: " + (this.working ? "Yes" : "No") + "\n");
        sb.append("Smoker: " + (this.smoker ? "Yes" : "No") + "\n");
        sb.append("Alcoholism: " + (this.alcoholism ? "Yes" : "No") + "\n");
        return sb.toString();
    }
}

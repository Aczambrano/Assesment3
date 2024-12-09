package Model;


import Model.DTO.PatientDTO;

public abstract class Patient {
    private String name;
    private int age;
    private long ID;

    public Patient(PatientDTO patientDTO) {
        this.name = patientDTO.getName();
        this.age = patientDTO.getAge();
        this.ID = patientDTO.getId();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getID() {
        return ID;
    }

    public String toString() {
        return null;
    };
}

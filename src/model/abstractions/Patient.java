package model.abstractions;


import controller.dto.PatientDTO;

public abstract class Patient {
    protected String name;
    protected int age;
    protected long ID;

    public Patient(PatientDTO patientDTO) {
        this.name = patientDTO.getName();
        this.age = patientDTO.getAge();
        this.ID = patientDTO.getId();
    }

}

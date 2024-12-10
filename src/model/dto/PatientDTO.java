package model.dto;

public class PatientDTO {
    private String name;
    private int age;
    private long id;

    public PatientDTO(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public long getId() {
        return id;
    }

}

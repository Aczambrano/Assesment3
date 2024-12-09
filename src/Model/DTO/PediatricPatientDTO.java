package Model.DTO;

public class PediatricPatientDTO {
    private int gestionalAge;
    private double birthWeight;
    private boolean inmunization;

    public PediatricPatientDTO(int gestionalAge,double birthWeight,boolean inmunization) {
        this.inmunization = inmunization;
        this.birthWeight = birthWeight;
        this.gestionalAge = gestionalAge;
    }

    public int getGestionalAge() {
        return gestionalAge;
    }

    public double getBirthWeight() {
        return birthWeight;
    }


    public boolean isInmunization() {
        return inmunization;
    }

}

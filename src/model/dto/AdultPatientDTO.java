package model.dto;

public class AdultPatientDTO {
    private boolean working;
    private boolean smoker;
    private boolean alcoholism;

    public AdultPatientDTO(boolean working, boolean smoker, boolean alcoholism) {
        this.working = working;
        this.smoker = smoker;
        this.alcoholism = alcoholism;
    }

    public boolean isWorking() {
        return working;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public boolean isAlcoholism() {
        return alcoholism;
    }
}

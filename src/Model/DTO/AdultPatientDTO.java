package Model.DTO;

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

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public boolean isAlcoholism() {
        return alcoholism;
    }

    public void setAlcoholism(boolean alcoholism) {
        this.alcoholism = alcoholism;
    }
}

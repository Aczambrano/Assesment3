package Controller;

import Model.AdultPatient;
import Model.DTO.PatientDTO;
import Model.Patient;
import Model.PediatricPatient;
import View.PatientView;

public class PatientController {
    private final PatientView patientView;
    private static final int MINIMUMAGE = 18;
    //inyección de dependencias
    public PatientController(PatientView patientView) {
        this.patientView = patientView;
    }
    public void run(){
        PatientDTO patientDTO = patientView.getPatientDetailsFromUser();

        Patient currentPatient;
        if(patientDTO.getAge() < MINIMUMAGE){
            currentPatient = new PediatricPatient( patientDTO.getName(),patientDTO.getAge(),patientDTO.getId());

        }else {
            currentPatient = new AdultPatient(patientDTO.getName(),patientDTO.getAge(),patientDTO.getId());
        }
        String [] specificAttributes =patientView.getAtributesByClass(patientDTO.getAge() < MINIMUMAGE);
        currentPatient.assignPatient(specificAttributes);
        patientView.displayPatientInfo(currentPatient.toString());
    }
}

package Controller;

import Model.AdultPatient;
import Model.DTO.AdultPatientDTO;
import Model.DTO.PatientDTO;
import Model.DTO.PediatricPatientDTO;
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
        PatientDTO patientDTO = patientView.getPatientDetails();

        Patient currentPatient;
        if(patientDTO.getAge() < MINIMUMAGE){
            currentPatient = new PediatricPatient( patientDTO.getName(),patientDTO.getAge(),patientDTO.getId());
            PediatricPatientDTO pediatricPatientDTO = patientView.getPediatricPatient();
            currentPatient.assignPatient(pediatricPatientDTO);
        }else {
            currentPatient = new AdultPatient(patientDTO.getName(),patientDTO.getAge(),patientDTO.getId());
            AdultPatientDTO adultPatientDTO = patientView.getAdultPatient();
            currentPatient.assignPatient(adultPatientDTO);
        }

        patientView.displayPatientInfo(currentPatient.toString());
    }
}

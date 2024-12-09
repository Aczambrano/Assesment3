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
    //Inyección de dependencias
    public PatientController(PatientView patientView) {
        this.patientView = patientView;
    }

    public void run(){
        PatientDTO patientDTO = patientView.getPatientDetails();

        Patient currentPatient;
        if(patientDTO.getAge() < MINIMUMAGE){
            PediatricPatientDTO pediatricPatientDTO = patientView.getPediatricPatient();

            currentPatient = new PediatricPatient( patientDTO, pediatricPatientDTO);

        }else {
            AdultPatientDTO adultPatientDTO = patientView.getAdultPatient();
            currentPatient = new AdultPatient(patientDTO,adultPatientDTO);
        }

        patientView.displayPatientInfo(currentPatient.toString());
    }
}

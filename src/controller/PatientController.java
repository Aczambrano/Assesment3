package controller;

import model.AdultPatient;
import model.dto.AdultPatientDTO;
import model.dto.PatientDTO;
import model.dto.PediatricPatientDTO;
import model.Patient;
import model.PediatricPatient;
import model.logs.interfaces.Logger;
import view.PatientView;

public class PatientController {
    private static final int MINIMUMAGE = 18;

    private final PatientView patientView;
    private final Logger logger;

    //Inyección de dependencias
    public PatientController(PatientView patientView, Logger logger) {
        this.patientView = patientView;
        this.logger = logger;
    }

    public void run(){
        logger.log("PatientController started");
        PatientDTO patientDTO = patientView.getPatientDetails();

        Patient currentPatient;
        if(patientDTO.getAge() < MINIMUMAGE){
            logger.log("Patient is a pediatric patient");
            PediatricPatientDTO pediatricPatientDTO = patientView.getPediatricPatient();

            currentPatient = new PediatricPatient( patientDTO, pediatricPatientDTO);

        }else {
            logger.log("Patient is an adult patient");
            AdultPatientDTO adultPatientDTO = patientView.getAdultPatient();
            currentPatient = new AdultPatient(patientDTO,adultPatientDTO);
        }
        logger.log("Displaying patient details");
        patientView.displayPatientInfo(currentPatient.toString());
    }
}

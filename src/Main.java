import Controller.PatientController;
import Model.AdultPatient;
import Model.PediatricPatient;
import Model.Patient;
import View.PatientView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientView patientView = new PatientView(scanner);
        PatientController patientController = new PatientController(patientView);
        patientController.run();
    }
}
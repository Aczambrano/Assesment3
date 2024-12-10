import controller.PatientController;
import logs.ConsoleLogger;
import logs.interfaces.Logger;
import view.PatientView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PatientView patientView = new PatientView(scanner);
        Logger logger = new ConsoleLogger();
        PatientController patientController = new PatientController(patientView,logger);
        patientController.run();
    }
}
package view;

import model.dto.AdultPatientDTO;
import model.dto.PatientDTO;
import model.dto.PediatricPatientDTO;

import java.util.Scanner;

public class PatientView {

    private final Scanner scanner;
    //Inyección de dependencias
    public PatientView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayPatientInfo(String patientInfo){
        System.out.println(patientInfo);
    }

    public PatientDTO getPatientDetails(){

        System.out.println("Enter the patient's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the patient's age: ");
        int age = scanner.nextInt();
        System.out.printf("Enter the patient's ID: ");
        long id = scanner.nextLong();
        return new PatientDTO(name,age,id);
    }

    public PediatricPatientDTO getPediatricPatient(){
        System.out.println("Enter the patient's gestational age: ");
        int gestationalAge = scanner.nextInt();
        System.out.println("Enter the patient's birth weight: ");
        double birthWeight = scanner.nextDouble();
        System.out.println("Enter the patient's immunization status (true/false): ");
        boolean immunization = scanner.nextBoolean();

        return new PediatricPatientDTO(gestationalAge,birthWeight,immunization);
    }

    public AdultPatientDTO getAdultPatient(){
        System.out.println("Enter the patient's employment status (true/false): ");
        boolean working = scanner.nextBoolean();
        System.out.println("Enter the patient's smoking habit (true/false): ");
        boolean smoker = scanner.nextBoolean();
        System.out.println("Enter the patient's alcohol use status (true/false): ");
        boolean alcoholism = scanner.nextBoolean();

        return new AdultPatientDTO(working,smoker,alcoholism);
    }
}

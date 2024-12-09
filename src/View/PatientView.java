package View;

import Model.DTO.AdultPatientDTO;
import Model.DTO.PatientDTO;
import Model.DTO.PediatricPatientDTO;

import java.util.Scanner;

public class PatientView {

    public void displayPatientInfo(String patientInfo){
        System.out.println(patientInfo);
    }

    public PatientDTO getPatientDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the patient's name: ");
        String name = in.nextLine();
        System.out.println("Enter the patient's age: ");
        int age = in.nextInt();
        System.out.printf("Enter the patient's ID: ");
        long id = in.nextLong();
        return new PatientDTO(name,age,id);
    }

    public PediatricPatientDTO getPediatricPatient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the patient's gestational age: ");
        int gestationalAge = in.nextInt();
        System.out.println("Enter the patient's birth weight: ");
        double birthWeight = in.nextDouble();
        System.out.println("Enter the patient's immunization status (true/false): ");
        boolean immunization = in.nextBoolean();

        return new PediatricPatientDTO(gestationalAge,birthWeight,immunization);
    }

    public AdultPatientDTO getAdultPatient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the patient's employment status (true/false): ");
        boolean working = in.nextBoolean();
        System.out.println("Enter the patient's smoking habit (true/false): ");
        boolean smoker = in.nextBoolean();
        System.out.println("Enter the patient's alcohol use status (true/false): ");
        boolean alcoholism = in.nextBoolean();

        return new AdultPatientDTO(working,smoker,alcoholism);
    }
}

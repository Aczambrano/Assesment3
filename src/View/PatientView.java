package View;

import Model.DTO.PatientDTO;
import Model.Patient;

import java.util.Scanner;

public class PatientView {
    public void displayPatientInfo(String patientInfo){
        System.out.println(patientInfo);
    }

    public PatientDTO getPatientDetailsFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the patient's name: ");
        String name = in.nextLine();
        System.out.println("Enter the patient's age: ");
        int age = in.nextInt();
        System.out.printf("Enter the patient's ID");
        long id = in.nextLong();
        return new PatientDTO(name,age,id);
    }
    public String[] getAtributesByClass(boolean isPediatric){
        Scanner in = new Scanner(System.in);
        String[] attributes = new String[3];
        if(isPediatric){
            System.out.println("Enter the patient's gestional age: ");
            attributes[0] = in.nextLine();
            System.out.println("Enter the patient's gestional weight: ");
            attributes[1] = in.nextLine();
            System.out.printf("Enter the patient's inmunization status: ");
            attributes[2]=in.nextLine();
        }else {
            System.out.println("Enter the patient's employment status");
            attributes[0] = in.nextLine();
            System.out.println("Enter the patient's smoking habit");
            attributes[1] = in.nextLine();
            System.out.println("Enter the patient's alcohol use status");
            attributes[2] = in.nextLine();
        }
        return attributes;
    }
}

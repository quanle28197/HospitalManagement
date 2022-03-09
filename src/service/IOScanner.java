package service;

import model.*;

import java.util.Scanner;

public class IOScanner {
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();
    Doctor doctor = new Doctor();
    PreventiveDoctor preventiveDoctor = new PreventiveDoctor();
    Nurse nurse = new Nurse();
    Patient patient = new Patient();

    public IOScanner() {
    }

    public void updatePerson(Person personUpdate) {
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        if (newName != null) {
            personUpdate.setName(newName);
        }

        System.out.println("Enter new age: ");
       int newAge = scanner.nextLine();
        scanner.nextLine();
        if (newAge != 0) {
            personUpdate.setAge(newAge);
        }

        System.out.println("Enter new address: ");
        String newAddress = scanner.nextLine();
        if (newAddress != null) {
            personUpdate.setAddress(newAddress);
        }

        System.out.println("Enter new gender: ");
        String newGender = scanner.nextLine();
        if (newGender != null) {
            personUpdate.setGender(newGender);
        }

        System.out.println("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        if (newPhone != null) {
            personUpdate.setPhone(newPhone);
        }
    }

    public void updateDoctor(Doctor updateDoctor) {
        updatePerson(updateDoctor);
        System.out.println("Enter new id: ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updateDoctor.setIdDoctor(newId);
        }

        System.out.println("Enter new position: ");
        String newPosition = scanner.nextLine();
        if (newPosition != null) {
            updateDoctor.setPositionDoctor(newPosition);
        }

        System.out.println("Enter new level salary: ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updateDoctor.setSalaryDoctor(newLevel);
        }
    }

    public void updatePreventiveDoctor(PreventiveDoctor updatePreventiveDoctor) {
        updatePerson(updatePreventiveDoctor);
        System.out.println("Enter new id: ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updatePreventiveDoctor.setIdPreventiveDoctor(newId);
        }

        System.out.println("Enter new position: ");
        String newPosition = scanner.nextLine();
        if (newPosition != null) {
            updatePreventiveDoctor.setPositionPreventiveDoctor(newPosition);
        }

        System.out.println("Enter new level salary: ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updatePreventiveDoctor.setLevelSalaryPreventiveDoctor(newLevel);
        }
    }

    public void updateNurse(Nurse updatenurse) {
        updatePerson(updateNurse);
        System.out.println("Enter new id: ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updateNurse.setIdNurse(newId);
        }

        System.out.println("Enter new level salary: ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updatenurse.setLevelNurse(newLevel);
        }
    }

    public void updatePatient(Patient updatePatient) {
        updatePerson(updatePatient);
        System.out.println("Enter new id: ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updatePatient.setIdPatient(newId);
        }

        System.out.println("Enter new diseases: ");
        String newDisease = scanner.nextLine();
        if (newDisease != null) {
            updatePatient.setDiseases(newDisease);
        }
    }
}

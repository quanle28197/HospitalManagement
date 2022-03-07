package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagementDoctor implements Serializable {
    public List<Doctor> doctorList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();
    IOFile ioFile = new IOFile();

    public ManagementDoctor() {
        this.doctorList = new ArrayList<>();
    }

    public void showDoctor() {
        for (Doctor doctor : doctorList) {
            System.out.println(doctor.toString());
        }
    }

    public void findByIdDoctor() {
        System.out.println("Enter the code of the doctor you are looking for ");
        String id = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList) {

        }
    }
}

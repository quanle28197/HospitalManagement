package controller;

import model.PreventiveDoctor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementPreventiveDoctor implements Serializable {
    public List<PreventiveDoctor> preventiveDoctorList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementPreventiveDoctor() {
        this.preventiveDoctorList = new ArrayList<>();
    }

    public void showpreventiveDoctor() {
        for (PreventiveDoctor preventiveDoctors : preventiveDoctorList) {
            System.out.println(preventiveDoctors.toString());
        }
    }

    public void addpreventiveDoctor(PreventiveDoctor preventiveDoctor) {
        this.preventiveDoctorList.add(preventiveDoctor);
    }

    public void findByIdPreventiveDoctor() {
        System.out.println("Enter preventive doctor code to find: ");
        String id  = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(id)) {
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByNamePreventiveDoctor() {
        System.out.println("Enter name to find: ");
    }

}

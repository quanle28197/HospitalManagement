package controller;

import model.PreventiveDoctor;

import java.io.Serializable;
import java.util.*;

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

    public void addPreventiveDoctor(PreventiveDoctor preventiveDoctor) {
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
        String name = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(name)) {
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByAgePreventiveDoctor() {
        System.out.println("Enter age to find :");
        int age = scanner.nextInt();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getAge() == age) {
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByPhonePreventiveDoctor() {
        System.out.println("Enter phone number to find :");
        String phone = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getPhone().equals(phone)) {
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByAddressPreventiveDoctor() {
        System.out.println("Enter address to find: ");
        String address = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getAddress().equals(address)) {
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void sortByIdPreventiveDoctor() {
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                return o1.getIdPreventiveDoctor().compareTo(o2.getIdPreventiveDoctor());
            }
        });
        showpreventiveDoctor();
    }

    public void sortbyNamePreventivceDoctor() {
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showpreventiveDoctor();
    }

    public void sortByLevelSalaryPreventiveDoctor() {
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                if (o1.getLevelSalaryPreventiveDoctor() > o2.getLevelSalaryPreventiveDoctor()) {
                    return 1;
                } else if (o1.getLevelSalaryPreventiveDoctor() < o2.getSalaryPreventiveDoctor()) {
                    return -1;
                } else {
                    return o1.getIdPreventiveDoctor().compareTo(o2.getIdPreventiveDoctor());
                }
            }
        });
        showpreventiveDoctor();
    }

    public void sortByAgePreventiveDoctor() {
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return o1.getIdPreventiveDoctor().compareTo(o2.getIdPreventiveDoctor());
                }
            }
        });
        showpreventiveDoctor();
    }

    public PreventiveDoctor updatePreventiveDoctorById() {
        System.out.println("Enter search by preventive id : ");
        String idPreventiveDoctor = scanner.nextLine();
        System.out.println("--------------------------");
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(equals(idPreventiveDoctor))) {
                ioScanner.updatePreventiveDoctor(preventiveDoctor);
            }
        }
        System.out.println("Can't find preventive doctor id to edit!!!");
        return null;
    }

    public void deleteByIdPreventiveDoctor(){
        System.out.print("Enter to find id: ");
        String id = scanner.nextLine();
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(id)) {
                preventiveDoctorList.remove(preventiveDoctor);
            }
        }
    }

}

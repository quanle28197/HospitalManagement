package controller;

import model.Doctor;
import model.Patient;
import service.IOScanner;

import java.io.Serializable;
import java.util.*;

public class ManagementPatient implements Serializable {
    public List<Patient> patientList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementPatient() {
        this.patientList = new ArrayList<>();
    }

    public void showPatient() {
        for (Patient patient : patientList) {
            System.out.println(patientList.toString());
        }
    }

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }

    public void findByIdPatient() {
        System.out.println("Enter patient code to find");
        String id = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getIdPatient().equals(id)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByNamePatient() {
        System.out.println("Enter name to find: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getName().equals(name)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByAgePatient() {
        System.out.println("Enter age to find : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getAge() == age) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByPhonePatient() {
        System.out.println("Enter phone number to find: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getPhone().equals(phone)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void findByAddressPatient() {
        System.out.println("Enter address to find: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Patient patient : patientList) {
            if (patient.getAddress().equals(address)) {
                System.out.println(patient);
                count++;
            }
        }
    }

    public void sortByNamePatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showPatient();
    }

    public void sortByIdPatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getIdPatient().compareTo(o2.getIdPatient());
            }
        });
        showPatient();
    }

    public void sortByDiseasesPatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getDiseases().compareTo(o2.getDiseases());
            }
        });
        showPatient();
    }

    public void sortByTypeRoomPatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getTypeRoom().compareTo(o2.getTypeRoom());
            }
        });
        showPatient();
    }

    public void sortByDaysInHospital() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getDayInHospital() > o2.getDayInHospital()) {
                    return 1;
                } else if (o1.getDayInHospital() < o2.getDayInHospital()) {
                    return -1;
                } else {
                    return o1.getIdPatient().compareTo(o2.getIdPatient());
                }
            }
        });
        showPatient();
    }

    public void sortByIdRoom() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getIdRoom() > o2.getIdRoom()) {
                    return 1;
                } else if (o1.getIdRoom() < o2.getIdRoom()) {
                    return -1;
                } else {
                    return o1.getIdPatient().compareTo(o2.getIdPatient());
                }
            }
        });
        showPatient();
    }

    public void sortByAgePatient() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        showPatient();
    }

    public Doctor updatePatientById() {
        System.out.println("Search by patient code:  ");
        String idPatient = scanner.nextLine();
        System.out.println("-------------------------------");
        for (Patient patient : patientList) {
            if (patient.getIdPatient().equals(idPatient)) {
                ioScanner.updatePatient(patient);
            }
        }
        System.out.println("Can't find code to edit!!!");
        return null;
    }

    public void deleteByIdPatient(){
        System.out.print("Enter to find by code: ");
        String id = scanner.nextLine();
        for (Patient patient : patientList) {
            if (patient.getIdPatient().equals(id)) {
                patientList.remove(patient);
            }
        }
    }
}

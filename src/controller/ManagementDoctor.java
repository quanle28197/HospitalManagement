package controller;

import model.Doctor;
import service.IOFile;
import service.IOScanner;

import java.io.Serializable;
import java.util.*;

public class ManagementDoctor implements Serializable {
    public List<Doctor> doctorList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();
    IOFile ioFile = new IOFile();

    public void addDoctor(Doctor doctor) {
        this.doctorList.add(doctor);
    }

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
            if(doctor.getIdDoctor().equals(id)) {
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByNameDoctor() {
        System.out.println("Enter name to find: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList) {
            if (doctor.getName().equals(name)) {
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByAgeDoctor() {
        System.out.println("Enter age to find: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList) {
            if (doctor.getAge() == age) {
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByPhoneDoctor() {
        System.out.println("Enter phone number to find: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList) {
            if (doctor.getPhone().equals(phone)) {
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void findByAddressDoctor() {
        System.out.println("Enter address to find: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Doctor doctor : doctorList) {
            if (doctor.getAddress().equals(address)) {
                System.out.println(doctor);
                count++;
            }
        }
    }

    public void sortByIdDoctor() {
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return o1.getIdDoctor().compareTo(o2.getIdDoctor());
            }
        });
        showDoctor();
    }

    public void sortByNameDoctor() {
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showDoctor();
    }

    public void sortByLevelSalaryDoctor() {
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if (o1.getLevelSalaryDoctor() > o2.getLevelSalaryDoctor()) {
                    return 1;
                } else if (o1.getLevelSalaryDoctor() < o2.getLevelSalaryDoctor()) {
                    return -1;
                } else {
                    return o1.getIdDoctor().compareTo(o2.getIdDoctor());
                }
            }
        });
        showDoctor();
    }

    public void sortByAgeDoctor() {
        Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1, Doctor o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else  {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        showDoctor();
    }

    public Doctor updateDoctorById() {
        System.out.println("Enter search by doctor code: ");
        String idDoctor = scanner.nextLine();
        System.out.println("-------------------------------");
        for (Doctor doctor : doctorList) {
            if (doctor.getIdDoctor().equals(idDoctor)) {
                ioScanner.updateDoctor(doctor);
                System.out.println("Edit success");
            }
        }
        System.out.println("Can't find doctor code to edit!!!");
        return null;
    }

    public void deleteByIdDoctor() {
        System.out.println("Enter find code");
        String id = scanner.nextLine();
        for (Doctor doctor : doctorList) {
            if (doctor.getIdDoctor().equals(id)) {
                doctorList.remove(doctor);
            }
        }
    }
}

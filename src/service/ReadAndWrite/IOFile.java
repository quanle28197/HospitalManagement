package service;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class IOFile {
    List<Person> personList;
    List<Doctor> doctorList;
    List<PreventiveDoctor> preventiveDoctorList;
    List<Nurse> nurseList;
    List<Patient> patientList;


    public IOFile() {
        personList = new ArrayList<>();
        doctorList = new ArrayList<>();
        preventiveDoctorList = new ArrayList<>();
        nurseList = new ArrayList<>();
        patientList = new ArrayList<>();
    }

    public void writeFilePerson(String path, List<Person> personList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(personList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Can't write the file!!!");
        }
    }

    public List<Person> readFilePerson(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            personList = (List<Person>) objectInputStream.readObject();
            System.out.println(personList);
        } catch (Exception exception) {
            System.out.println("Read failed!!!");
        }
        return personList;
    }

    public void writeFileDoctor(String path, List<Doctor> doctorList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(doctorList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Write failed!!!");
        }
    }

    public List<Doctor> readFileDoctor(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            doctorList = (List<Doctor>) objectInputStream.readObject();
            System.out.println(doctorList);
        } catch (Exception exception) {
            System.out.println("Read failed!!!");
        }
        return doctorList;
    }

    public void writeFilePreventiveDoctor(String path, List<PreventiveDoctor> preventiveDoctorList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(preventiveDoctorList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Write failed!!!");
        }
    }

    public List<PreventiveDoctor> readFilePreventiveDoctor(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            preventiveDoctorList = (List<PreventiveDoctor>) objectInputStream.readObject();
            System.out.println(preventiveDoctorList);
        } catch (Exception exception) {
            System.out.println("Read failed!!!");
        }
        return preventiveDoctorList;
    }

    public void writeFileNurse(String path, List<Nurse> nurseList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(nurseList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Write failed!!!");
        }
    }

    public List<Nurse> readFileNurse(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            nurseList = (List<Nurse>) objectInputStream.readObject();
            System.out.println(nurseList);
        } catch (Exception exception) {
            System.out.println("Read failed!!!");
        }
        return nurseList;
    }


    public void writeFilePatient(String path, List<Patient> patientList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(patientList);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException ioException) {
            System.out.println("Write failed!!!");
        }
    }

    public List<Patient> readFilePatient(String path) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            patientList = (List<Patient>) objectInputStream.readObject();
            System.out.println(patientList);
        } catch (Exception exception) {
            System.out.println("Read failed!!!");
        }
        return patientList;
    }
}
package model;

import java.io.Serializable;
import java.nio.file.Path;

public class Patient extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idPatient;
    private String diseases;
    private String status;
    private double height;
    private double weight;
    private int dayInHospital;
    private String typeRoom;
    private int idRoom;

    public Patient() {
    }

    public Patient(Person person, String idPatient, String diseases, String status, double height, double weight, int dayInHospital, String typeRoom, int idRoom) {
        
        this.idPatient = idPatient;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.dayInHospital = dayInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public Patient(String name, int age, String address, String gender, String phone, String idPatient, String diseases, String status, double height, double weight, int dayInHospital, String typeRoom, int idRoom) {
        super(name, age, address, gender, phone);
        this.idPatient = idPatient;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.dayInHospital = dayInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }
}

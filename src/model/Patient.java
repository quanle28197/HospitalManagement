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

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDayInHospital() {
        return dayInHospital;
    }

    public void setDayInHospital(int dayInHospital) {
        this.dayInHospital = dayInHospital;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

//    @Override
//    public String toString() {
//        return "Patient {" +
//                "idPatient ='" + diseases + '\'' +
//                ", Name ='" + super.getName() + '\'' +
//                ", Age =" + super.getAge() +
//                ", Address ='" + super.getAddress() + '\'' +
//                ", Gender =" + super.getGender() +
//                ", Phone number ='" + super.getPhone() + '\'' + "\n" +
//                " Diseases ='" + diseases + '\'' +
//                ", Status ='" + status + '\'' +
//                ", Height ='" + height + '\'' +
//                ", Weight ='" + weight + '\'' + "\n" +
//                " Day in hospital ='" + dayInHospital + '\'' +
//                ", Type of room ='" + typeRoom + '\'' +
//                ", Id Room='" + idRoom + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Patient{" +
                "idPatient='" + idPatient + '\'' +
                ", diseases='" + diseases + '\'' +
                ", status='" + status + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", dayInHospital=" + dayInHospital +
                ", typeRoom='" + typeRoom + '\'' +
                ", idRoom=" + idRoom +
                '}';
    }
}

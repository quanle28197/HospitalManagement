package account.user;

import java.io.Serializable;

public class AccountUser implements Serializable {
    private String userId;
    private String userPassword;
    private String name;
    private int age;
    private String diseases;
    private String status;
    private double height;
    private double weight;
    private int dayInHospital;
    private String typeRoom;
    private int idRoom;

    public AccountUser(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public AccountUser(String name, int age, String diseases, String status, double height, double weight, int dayInHospital, String typeRoom, int idRoom) {
        this.name = name;
        this.age = age;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.dayInHospital = dayInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}

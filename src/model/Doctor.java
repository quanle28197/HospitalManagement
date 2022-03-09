package model;

import java.io.Serializable;

public class Doctor extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idDoctor;
    private String positionDoctor;
    private int levelSalaryDoctor;
    private int salaryDoctor;

    public Doctor() {
    }

    public Doctor(String idDoctor, String positionDoctor, int levelSalaryDoctor, int salaryDoctor) {
        this.idDoctor = idDoctor;
        this.positionDoctor = positionDoctor;
        this.levelSalaryDoctor = levelSalaryDoctor;
        this.salaryDoctor = salaryDoctor;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getPositionDoctor() {
        return positionDoctor;
    }

    public void setPositionDoctor(String positionDoctor) {
        this.positionDoctor = positionDoctor;
    }

    public int getLevelSalaryDoctor() {
        return levelSalaryDoctor;
    }

    public void setLevelSalaryDoctor(int levelSalaryDoctor) {
        this.levelSalaryDoctor = levelSalaryDoctor;
    }

    public int getSalaryDoctor() {
        return salaryDoctor;
    }

    public void setSalaryDoctor(int salaryDoctor) {
        this.salaryDoctor = salaryDoctor;
    }

    @Override
    public String toString() {
        return "Doctor {" +
                "idDoctor='" + idDoctor + '\'' +
                ", Name ='" + super.getName() + '\'' +
                ", Age =" + super.getAge() +
                ", Address ='" + super.getAddress() + '\'' +
                ", Gender =" + super.getGender() +
                ", Phone number ='" + super.getPhone() + '\'' +
                ", Position='" + positionDoctor + '\'' +
                ", Level Salary='" + levelSalaryDoctor + '\'' +
                ", Salary Doctor='" + getSalaryDoctor() + '\'' +
                '}';
    }

}

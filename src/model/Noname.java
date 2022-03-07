public class Patient extends Person implements Serializable {
    private static final long serialVersionUID = -6500665823330706018L;
    private String idPatitent;
    private String diseases;
    private String status;
    private double height;
    private double weight;
    private int daysInHospital;
    private String typeRoom;
    private int idRoom;

    public Patient() {
    }


    public Patient(String idPatitent, String name, int age, String address, String gender, String phone, String diseases, String status, double height, double weight, int daysInHospital, String typeRoom, int idRoom) {
        super(name, age, address, gender, phone);
        this.idPatitent = idPatitent;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.daysInHospital = daysInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public Patient(Person person, String idPatitent, String diseases, String status, double height, double weight, int daysInHospital, String typeRoom, int idRoom) {
        super(person.getName(), person.getAge(), person.getAddress(), person.getGender(), person.getPhone());
        this.idPatitent = idPatitent;
        this.diseases = diseases;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.daysInHospital = daysInHospital;
        this.typeRoom = typeRoom;
        this.idRoom = idRoom;
    }

    public String getIdPatitent() {
        return idPatitent;
    }

    public void setIdPatitent(String idPatitent) {
        this.idPatitent = idPatitent;
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

    public int getDaysInHospital() {
        return daysInHospital;
    }

    public void setDaysInHospital(int daysInHospital) {
        this.daysInHospital = daysInHospital;
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

    @Override
    public String toString() {
        return "Bệnh nhân {" +
                "Mã bệnh nhân='" + diseases + '\'' +
                ", Tên='" + super.getName() + '\'' +
                ", Tuổi=" + super.getAge() +
                ", Địa chỉ='" + super.getAddress() + '\'' +
                ", Giới tính=" + super.getGender() +
                ", Số điện thoại='" + super.getPhone() + '\'' + "\n" +
                " Bệnh tật='" + diseases + '\'' +
                ", Trạng thái='" + status + '\'' +
                ", Chiều cao='" + height + '\'' +
                ", Cân nặng='" + weight + '\'' + "\n" +
                " Số ngày nhập viện='" + daysInHospital + '\'' +
                ", Loại phòng='" + typeRoom + '\'' +
                ", Số phòng='" + idRoom + '\'' +
                '}';
    }
}
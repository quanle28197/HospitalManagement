public class IOScanner {
    Scanner scanner = new Scanner(System.in);
    Person person = new Person();
    Doctor doctor = new Doctor();
    PreventiveDoctor preventiveDoctor = new PreventiveDoctor();
    Nurse nurse = new Nurse();
    Patient patient = new Patient();

    public IOScanner() {
    }


    public void updatePerson(Person personUpdate) {
        System.out.println("nhập tên (mới): ");
        String newName = scanner.nextLine();
        if (newName != null) {
            personUpdate.setName(newName);
        }

        System.out.println("nhập tuổi (mới): ");
        int newAge = scanner.nextInt();
        scanner.nextLine();
        if (newAge != 0) {
            personUpdate.setAge(newAge);
        }

        System.out.println("nhập địa chỉ (mới): ");
        String newAdress = scanner.nextLine();
        if (newAdress != null) {
            personUpdate.setAddress(newAdress);
        }

        System.out.println("nhập giới tính (mới): ");
        String newGender = scanner.nextLine();
        if (newGender != null) {
            personUpdate.setGender(newGender);
        }

        System.out.println("nhập số điện thoại (mới): ");
        String newPhone = scanner.nextLine();
        if (newPhone != null) {
            personUpdate.setPhone(newPhone);
        }
    }

    public void updateDoctor(Doctor updateDoctor) {
        updatePerson(updateDoctor);
        System.out.println("nhập mã (mới): ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updateDoctor.setIdDoctor(newId);
        }

        System.out.println("nhập vị trí (mới): ");
        String newPosition = scanner.nextLine();
        if (newPosition != null) {
            updateDoctor.setPositionDoctor(newPosition);
        }

        System.out.println("nhập bậc lương (mới): ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updateDoctor.setLevelSalaryDoctor(newLevel);
        }
    }

    public void updatePreventiveDoctor(PreventiveDoctor updatePreventiveDoctor) {
        updatePerson(updatePreventiveDoctor);
        System.out.println("nhập mã (mới): ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updatePreventiveDoctor.setIdPreventiveDoctor(newId);
        }

        System.out.println("nhập vị trí (mới): ");
        String newPosition = scanner.nextLine();
        if (newPosition != null) {
            updatePreventiveDoctor.setPositionPreventiveDoctor(newPosition);
        }

        System.out.println("nhập bậc lương (mới): ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updatePreventiveDoctor.setLevelSalaryPreventiveDoctor(newLevel);
        }
    }

    public void updateNurse(Nurse updateNurse) {
        updatePerson(updateNurse);
        System.out.println("nhập mã (mới): ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updateNurse.setIdNurse(newId);
        }

        System.out.println("nhập bậc lương (mới): ");
        int newLevel = scanner.nextInt();
        scanner.nextLine();
        if (newLevel != 0) {
            updateNurse.setLevelNurse(newLevel);
        }
    }

    public void updatePatient(Patient updatePatient) {
        updatePerson(updatePatient);
        System.out.println("nhập mã (mới): ");
        String newId = scanner.nextLine();
        if (newId != null) {
            updatePatient.setIdPatitent(newId);
        }

        System.out.println("nhập bệnh (mới): ");
        String newDiseases = scanner.nextLine();
        if (newDiseases != null) {
            updatePatient.setDiseases(newDiseases);
        }

        System.out.println("nhập tình trạng (mới): ");
        String newStatus = scanner.nextLine();
        if (newStatus != null) {
            updatePatient.setStatus(newStatus);
        }

        System.out.println("nhập chiều cao (mới): ");
        double newHeight = scanner.nextDouble();
        scanner.nextLine();
        if (newHeight != 0.0) {
            updatePatient.setHeight(newHeight);
        }

        System.out.println("nhập cân nặng (mới): ");
        double newWeight = scanner.nextDouble();
        scanner.nextLine();
        if (newWeight != 0.0) {
            updatePatient.setWeight(newWeight);
        }

        System.out.println("nhập số ngày nhập viện (mới): ");
        int newDaysInHospital = scanner.nextInt();
        scanner.nextLine();
        if (newDaysInHospital != 0) {
            updatePatient.setDaysInHospital(newDaysInHospital);
        }

        System.out.println("nhập loại phòng (mới): ");
        String newTypeRoom = scanner.nextLine();
        if (newTypeRoom != null) {
            updatePatient.setTypeRoom(newTypeRoom);
        }

        System.out.println("nhập số phòng (mới): ");
        int newIdRoom = scanner.nextInt();
        scanner.nextLine();
        if (newIdRoom != 0) {
            updatePatient.setIdRoom(newIdRoom);
        }

    }


}
package view;


    public class Main {
        public static Scanner scanner = new Scanner(System.in);
        public static ManagementPerson managementPerson = new ManagementPerson();
        public static ManagementDoctor managementDoctor = new ManagementDoctor();
        public static MangamentPreventiveDoctor mangamentPreventiveDoctor = new MangamentPreventiveDoctor();
        public static ManagementNurse managementNurse = new ManagementNurse();
        public static ManagementPatient managementPatient = new ManagementPatient();
        public static IOFile ioFile = new IOFile();
        private static Validate validate = new Validate();

        public static void main(String[] args) {
            String choice;
            do {
                menu();
                choice = scanner.nextLine();
                switch (choice) {
                    case "1": {
                        System.out.println("Chọn loại nhân sự bạn muốn thêm ");
                        System.out.println("Nhấn a: để thêm thông tin bác sĩ");
                        System.out.println("Nhấn b: để thêm thông tin bác sĩ dự phòng");
                        System.out.println("Nhấn c: để thêm thông tin y tá");
                        System.out.println("Nhấn d: để thêm thông tin bệnh nhân");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                addDoctor();
                            }
                            break;
                            case "b": {
                                addPreventiveDoctor();
                            }
                            break;
                            case "c": {
                                addNurse();
                            }
                            break;
                            case "d": {
                                addPatient();
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    case "2": {
                        System.out.println("Chọn loại danh sách bạn muốn hiển thị");
                        System.out.println("Nhấn a: Hiển thị danh sách bác sĩ");
                        System.out.println("Nhấn b: Hiển thị danh sách bác sĩ dự phòng");
                        System.out.println("Nhấn c: Hiển thị danh sách y tá");
                        System.out.println("Nhấn d: Hiển thị danh sách bệnh nhân");
                        System.out.println("Nhấn e: Hiển thị danh sách tất cả nhân sự trong bệnh viện");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.println("hiển thị danh sách bác sĩ");
                                managementDoctor.showDoctor();
                            }
                            break;
                            case "b": {
                                System.out.println("Hiển thị danh sách bác sĩ dự phòng");
                                mangamentPreventiveDoctor.showpreventiveDoctor();
                            }
                            break;
                            case "c": {
                                System.out.println("Hiển thị danh sách y tá");
                                managementNurse.showNurse();
                            }
                            break;
                            case "d": {
                                System.out.println("Hiển thị danh sách bệnh nhân");
                                managementPatient.showPatient();
                            }
                            break;
                            case "e": {
                                System.out.println("hiển thị danh sách");
                                Person person = new Person();
                                managementPerson.showListPerson(person);
                            }
                            break;
                            default: {
                                System.out.println("Yêu cầu nhập lại");
                            }
                        }
                    }
                    break;
                    case "3": {
                        System.out.println("Chọn loại danh sách muốn tìm kiếm");
                        System.out.println("Nhấn a: Tìm kiếm danh sách bác sĩ");
                        System.out.println("Nhấn b: Tìm kiếm danh sách bác sĩ dự phòng");
                        System.out.println("Nhấn c: Tìm kiếm danh sách y tá");
                        System.out.println("Nhấn d: Tìm kiếm danh sách bệnh nhân");
                        System.out.println("Nhấn e: Tìm kiếm danh sách tất cả nhân sự trong bệnh viện");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                templateFind();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementDoctor.findByIdDoctor();
                                    }
                                    break;
                                    case "2": {
                                        managementDoctor.findByNameDoctor();
                                    }
                                    break;
                                    case "3": {
                                        managementDoctor.findByAgeDoctor();
                                    }
                                    break;
                                    case "4": {
                                        managementDoctor.findByAddressDoctor();
                                    }
                                    break;
                                    case "5": {
                                        managementDoctor.findByPhoneDoctor();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "b": {
                                templateFind();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        mangamentPreventiveDoctor.findByIdPreventiveDoctor();
                                    }
                                    break;
                                    case "2": {
                                        mangamentPreventiveDoctor.findByNamePreventiveDoctor();
                                    }
                                    break;
                                    case "3": {
                                        mangamentPreventiveDoctor.findByAgePreventiveDoctor();
                                    }
                                    break;
                                    case "4": {
                                        mangamentPreventiveDoctor.findByAddressPreventiveDoctor();
                                    }
                                    break;
                                    case "5": {
                                        mangamentPreventiveDoctor.findByPhonePreventiveDoctor();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "c": {
                                templateFind();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementNurse.findByIdNurse();
                                    }
                                    break;
                                    case "2": {
                                        managementNurse.findByNameNurse();
                                    }
                                    break;
                                    case "3": {
                                        managementNurse.findByAgeNurse();
                                    }
                                    break;
                                    case "4": {
                                        managementNurse.findByAddressNurse();
                                    }
                                    break;
                                    case "5": {
                                        managementNurse.findByPhoneNurse();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "d": {
                                templateFind();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementPatient.findByIdPatient();
                                    }
                                    break;
                                    case "2": {
                                        managementPatient.findByNamePatient();
                                    }
                                    break;
                                    case "3": {
                                        managementPatient.findByAgePatient();
                                    }
                                    break;
                                    case "4": {
                                        managementPatient.findByAddressPatient();
                                    }
                                    break;
                                    case "5": {
                                        managementPatient.findByPhonePatient();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }

                            }
                            break;
                            case "e": {
                                templateFindPerson();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementPerson.findByNamePerson();
                                    }
                                    break;
                                    case "2": {
                                        managementPerson.findByAgePerson();
                                    }
                                    break;
                                    case "3": {
                                        managementPerson.findByAddressPerson();
                                    }
                                    break;
                                    case "4": {
                                        managementPerson.findByPhonePerson();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                    case "4": {
                        System.out.println("Chọn loại nhân sự bạn muốn sắp xếp ");
                        System.out.println("Nhấn a: để sắp xếp thông tin bác sĩ");
                        System.out.println("Nhấn b: để sắp xếp thông tin bác sĩ dự phòng");
                        System.out.println("Nhấn c: để sắp xếp thông tin y tá");
                        System.out.println("Nhấn d: để sắp xếp thông tin bệnh nhân");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                templateSort();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementDoctor.sortByIdDoctor();
                                    }
                                    break;
                                    case "2": {
                                        managementDoctor.sortByNameDoctor();
                                    }
                                    break;
                                    case "3": {
                                        managementDoctor.sortByAgeDoctor();
                                    }
                                    break;
                                    case "4": {
                                        managementDoctor.sortByLevelSalaryDoctor();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "b": {
                                templateSort();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        mangamentPreventiveDoctor.sortByIdPreventiveDoctor();
                                    }
                                    break;
                                    case "2": {
                                        mangamentPreventiveDoctor.sortByNamePreventiveDoctor();
                                    }
                                    break;
                                    case "3": {
                                        mangamentPreventiveDoctor.sortByAgePreventiveDoctor();
                                    }
                                    break;
                                    case "4": {
                                        mangamentPreventiveDoctor.sortByLevelSalaryPreventiveDoctor();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "c": {
                                templateSort();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementNurse.sortByIdNurse();
                                    }
                                    break;
                                    case "2": {
                                        managementNurse.sortByNameNurse();
                                    }
                                    break;
                                    case "3": {
                                        managementNurse.sortByAgeNurse();
                                    }
                                    break;
                                    case "4": {
                                        managementNurse.sortByLevelSalaryNurse();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            case "d": {
                                templateSortPatient();
                                String pick = scanner.nextLine();
                                switch (pick) {
                                    case "1": {
                                        managementPatient.sortByIdPatitent();
                                    }
                                    break;
                                    case "2": {
                                        managementPatient.sortByNamePatitent();
                                    }
                                    break;
                                    case "3": {
                                        managementPatient.sortByAgePatient();
                                    }
                                    break;
                                    case "4": {
                                        managementPatient.sortByDiseasesPatitent();
                                    }
                                    break;
                                    case "5": {
                                        managementPatient.sortByIdRoom();
                                    }
                                    break;
                                    case "6": {
                                        managementPatient.sortByTypeRoomPatitent();
                                    }
                                    break;
                                    case "7": {
                                        managementPatient.sortByDaysInHospital();
                                    }
                                    break;
                                    default: {
                                        System.out.println("bạn nhập sai rồi!");
                                    }
                                    break;
                                }
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    case "5": {
                        System.out.println("Chọn loại nhân sự bạn muốn sửa ");
                        System.out.println("Nhấn a: để sửa thông tin bác sĩ");
                        System.out.println("Nhấn b: để sửa thông tin bác sĩ dự phòng");
                        System.out.println("Nhấn c: để sửa thông tin y tá");
                        System.out.println("Nhấn d: để sửa thông tin bệnh nhân");
                        System.out.println("Nhấn e: để sửa thông tin nhân sự");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                managementDoctor.updateDoctorById();
                            }
                            break;
                            case "b": {
                                mangamentPreventiveDoctor.updatePreventiveDoctorById();
                            }
                            break;
                            case "c": {
                                managementNurse.updateNurseById();
                            }
                            break;
                            case "d": {
                                managementPatient.updatePatientById();
                            }
                            break;
                            case "e": {
                                managementPerson.updatePersonByNameAndPhone();
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    case "6": {
                        System.out.println("Chọn loại nhân sự bạn muốn xóa ");
                        System.out.println("Nhấn a: để xóa thông tin bác sĩ");
                        System.out.println("Nhấn b: để xóa thông tin bác sĩ dự phòng");
                        System.out.println("Nhấn c: để xóa thông tin y tá");
                        System.out.println("Nhấn d: để xóa thông tin bệnh nhân");
                        System.out.println("Nhấn e: để xóa thông tin nhân sự");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                managementDoctor.deleteByIdDoctor();
                            }
                            break;
                            case "b": {
                                mangamentPreventiveDoctor.deleteByIdPreventiveDoctor();
                            }
                            break;
                            case "c": {
                                managementNurse.deleteByIdNurse();
                            }
                            break;
                            case "d": {
                                managementPatient.deleteByIdPatient();
                            }
                            break;
                            case "e": {
                                managementPerson.deleteByNameAndPhone();
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    case "7": {
                        templateWriteFile();
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                ioFile.writeFileDoctor("File\\doctor.csv", managementDoctor.doctorList);
                            }
                            break;
                            case "b": {
                                ioFile.writeFilePreventiveDoctor("File\\preventiveDoctor.csv", mangamentPreventiveDoctor.preventiveDoctorList);
                            }
                            break;
                            case "c": {
                                ioFile.writeFileNurse("File\\Nurse.csv", managementNurse.nurseList);
                            }
                            break;
                            case "d": {
                                ioFile.writeFilePatient("File\\Patient.csv", managementPatient.patientList);
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    case "8": {
                        templateReadFile();
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                ioFile.readFileDoctor("File\\doctor.csv");
                            }
                            break;
                            case "b": {
                                ioFile.readFilePreventiveDoctor("File\\preventiveDoctor.csv");
                            }
                            break;
                            case "c": {
                                ioFile.readFileNurse("File\\nurse.csv");
                            }
                            break;
                            case "d": {
                                ioFile.readFilePatient("File\\patient.csv");
                            }
                            break;
                            default: {
                                System.out.println("Nhập sai! Yêu cầu nhập lại!");
                            }
                            break;
                        }
                    }
                    break;
                    default: {
                        System.out.println("Yêu cầu nhập lại");
                    }
                    break;
                }
            } while (!choice.equals("9"));
        }

        //thêm thông tin chung để không cần viết lại nhiều lần
        public static Person inputInfomation() {
            System.out.println("nhập tên: ");
            System.out.println("Ví dụ: abc");
            String name = scanner.nextLine();
            System.out.println("nhập tuổi");
            System.out.println("Ví dụ: 12");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhập địa chỉ: ");
            System.out.println("Ví dụ: Ha noi");
            String address = scanner.nextLine();
            System.out.println("nhập giới tính: ");
            System.out.println("Ví dụ: nam");
            String gender = scanner.nextLine();
            System.out.println("nhập số điện thoại: ");
            System.out.println("Ví dụ: 0974610370");
            String phoneNumber = scanner.nextLine();
            Person inputPerson = new Person(name, age, address, gender, phoneNumber);
            return inputPerson;
        }

        //thêm bác sĩ
        public static void addDoctor() {
            System.out.println("Nhập thông tin bác sĩ");
            Person person = inputInfomation();
            System.out.println("nhập mã bác sĩ");
            String idDoctor = scanner.nextLine();
            System.out.println("nhập vị trí: ");
            String positionDoctor = scanner.nextLine();
            System.out.println("nhập cấp bậc lương: ");
            int levelSalaryDoctor = scanner.nextInt();
            Doctor doctor = new Doctor(person, idDoctor, positionDoctor, levelSalaryDoctor);
            managementPerson.addPerson(doctor);
            managementDoctor.addDoctor(doctor);
        }

        //thêm bác sĩ dự phòng
        public static void addPreventiveDoctor() {
            System.out.println("Nhập thông tin bác sĩ dự phòng");
            Person person = inputInfomation();
            System.out.println("nhập mã bác sĩ dự phòng");
            String idPreventiveDoctor = scanner.nextLine();
            System.out.println("nhập vị trí: ");
            String positionPreventiveDoctor = scanner.nextLine();
            System.out.println("nhập cấp bậc lương: ");
            int levelSalaryPreventiveDoctor = scanner.nextInt();
            PreventiveDoctor preventiveDoctor = new PreventiveDoctor(person, idPreventiveDoctor, positionPreventiveDoctor, levelSalaryPreventiveDoctor);
            managementPerson.addPerson(preventiveDoctor);
            mangamentPreventiveDoctor.addpreventiveDoctor(preventiveDoctor);
        }

        //thêm y tá
        public static void addNurse() {
            System.out.println("Nhập thông tin y tá");
            Person person = inputInfomation();
            System.out.println("nhập mã y tá");
            String idNurse = scanner.nextLine();
            System.out.println("nhập cấp bậc lương: ");
            int levelNurse = scanner.nextInt();
            Nurse nurse = new Nurse(person, idNurse, levelNurse);
            managementPerson.addPerson(nurse);
            managementNurse.addNurse(nurse);
        }

        //thêm bệnh nhân
        public static void addPatient() {
            System.out.println("Nhập thông tin bệnh nhân");
            Person person = inputInfomation();
            System.out.println("nhập mã bệnh nhân");
            String idPatitent = scanner.nextLine();
            System.out.println("nhập tên bệnh mắc phải");
            String diseases = scanner.nextLine();
            System.out.println("nhập trạng thái bệnh nhân");
            String status = scanner.nextLine();
            System.out.println("nhập chiều cao");
            double height = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("nhập cân nặng");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("nhập số ngày nhập viện");
            int daysInHospital = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhập loại phòng bệnh");
            String typeRoom = scanner.nextLine();
            System.out.println("nhập số phòng");
            int idRoom = scanner.nextInt();
            Patient patient = new Patient(person, idPatitent, diseases, status, height, weight, daysInHospital, typeRoom, idRoom);
            managementPerson.addPerson(patient);
            managementPatient.addPatient(patient);
        }

        private static void templateFind() {
            System.out.println("Chọn loại kiểu tìm kiếm");
            System.out.println("1. Tìm kiếm theo mã");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Tìm kiếm theo tuổi");
            System.out.println("4. Tìm kiếm theo địa chỉ");
            System.out.println("5. Tìm kiếm theo số điện thoại");
        }

        private static void templateFindPerson() {
            System.out.println("Chọn loại kiểu tìm kiếm");
            System.out.println("1. Tìm kiếm theo tên");
            System.out.println("2. Tìm kiếm theo tuổi");
            System.out.println("3. Tìm kiếm theo địa chỉ");
            System.out.println("4. Tìm kiếm theo số điện thoại");
        }

        private static void templateSort() {
            System.out.println("Chọn loại kiểu sắp xếp");
            System.out.println("1. Sắp xếp theo mã");
            System.out.println("2. Sắp xếp theo tên");
            System.out.println("3. Sắp xếp theo tuổi");
            System.out.println("4. Sắp xếp theo cấp bậc lương");
        }

        private static void templateSortPatient() {
            System.out.println("Chọn loại kiểu sắp xếp");
            System.out.println("1. Sắp xếp theo mã bệnh nhân");
            System.out.println("2. Sắp xếp theo tên bệnh nhân");
            System.out.println("3. Sắp xếp theo tuổi bệnh nhân");
            System.out.println("4. Sắp xếp theo bệnh tật");
            System.out.println("5. Sắp xếp theo số phòng");
            System.out.println("6. Sắp xếp theo loại phòng");
            System.out.println("7. Sắp xếp theo số ngày nhập viện");
        }

        private static void templateWriteFile() {
            System.out.println("Chọn danh sách cần lưu");
            System.out.println("a. Lưu danh sách bác sĩ");
            System.out.println("b. Lưu danh sách bác sĩ dự phòng");
            System.out.println("c. Lưu danh sách y tá");
            System.out.println("d. Lưu danh sách bệnh nhân");
        }

        private static void templateReadFile() {
            System.out.println("Chọn danh sách cần đọc");
            System.out.println("a. Đọc danh sách bác sĩ");
            System.out.println("b. Đọc danh sách bác sĩ dự phòng");
            System.out.println("c. Đọc danh sách y tá");
            System.out.println("d. Đọc danh sách bệnh nhân");
        }

        private static void menu() {
            System.out.println("");
            System.out.println("--Menu--");
            System.out.println("------------------------------------------");
            System.out.println("1. Thêm nhân sự");
            System.out.println("2. Hiển thị danh sách nhân sự");
            System.out.println("3. Tìm kiếm nhân sự");
            System.out.println("4. Sắp xếp nhân sự");
            System.out.println("5. Sửa thông tin nhân sự");
            System.out.println("6. Xóa thông tin nhân sự");
            System.out.println("7. Lưu vào file CSV");
            System.out.println("8. Đọc file nhân sự");
            System.out.println("9. Thoát");
            System.out.println("------------------------------------------");
            System.out.println("nhập lựa chọn của bạn: ");
        }

    }


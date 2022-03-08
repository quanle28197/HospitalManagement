public class MangamentPreventiveDoctor implements Serializable {
    public List<PreventiveDoctor> preventiveDoctorList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public MangamentPreventiveDoctor() {
        this.preventiveDoctorList = new ArrayList<>();
    }


    public void showpreventiveDoctor() {
        for (PreventiveDoctor preventiveDoctors : preventiveDoctorList) {
            System.out.println(preventiveDoctors.toString());
        }
    }

    public void addpreventiveDoctor(PreventiveDoctor preventiveDoctor) {
        this.preventiveDoctorList.add(preventiveDoctor);
    }

    public void findByIdPreventiveDoctor(){
        System.out.print("nhập mã bác sĩ dự bị cần tìm: ");
        String id = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList){
            if(preventiveDoctor.getIdPreventiveDoctor().equals(id)){
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByNamePreventiveDoctor(){
        System.out.print("nhập tên cần tìm: ");
        String name = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList){
            if(preventiveDoctor.getName().equals(name)){
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByAgePreventiveDoctor(){
        System.out.print("nhập số tuổi cần tìm: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList){
            if(preventiveDoctor.getAge() == age){
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByPhonePreventiveDoctor(){
        System.out.print("nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList){
            if(preventiveDoctor.getPhone().equals(phone)){
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void findByAddressPreventiveDoctor(){
        System.out.print("nhập địa chỉ cần tìm: ");
        String address = scanner.nextLine();
        int count = 0;
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList){
            if(preventiveDoctor.getAddress().equals(address)){
                System.out.println(preventiveDoctor);
                count++;
            }
        }
    }

    public void sortByIdPreventiveDoctor(){
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                return o1.getIdPreventiveDoctor().compareTo(o2.getIdPreventiveDoctor());
            }
        });
        showpreventiveDoctor();
    }

    public void sortByNamePreventiveDoctor(){
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        showpreventiveDoctor();
    }

    public void sortByAgePreventiveDoctor(){
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                if(o1.getAge()> o2.getAge()){
                    return 1;
                }
                else if(o1.getAge()< o2.getAge()){
                    return -1;
                }
                else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        showpreventiveDoctor();
    }

    public void sortByLevelSalaryPreventiveDoctor(){
        Collections.sort(preventiveDoctorList, new Comparator<PreventiveDoctor>() {
            @Override
            public int compare(PreventiveDoctor o1, PreventiveDoctor o2) {
                if(o1.getLevelSalaryPreventiveDoctor()> o2.getLevelSalaryPreventiveDoctor()){
                    return 1;
                }
                else if(o1.getLevelSalaryPreventiveDoctor()< o2.getLevelSalaryPreventiveDoctor()){
                    return -1;
                }
                else {
                    return o1.getIdPreventiveDoctor().compareTo(o2.getIdPreventiveDoctor());
                }
            }
        });
        showpreventiveDoctor();
    }

    public PreventiveDoctor updatePreventiveDoctorById() {
        System.out.print("nhập tìm theo mã bác sĩ dự phòng: ");
        String idPreventiveDoctor = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(idPreventiveDoctor)) {
                ioScanner.updatePreventiveDoctor(preventiveDoctor);
            }
        }
        System.out.println("không tìm thấy mã bác sĩ cần sửa!!!");
        return null;
    }

    public void deleteByIdPreventiveDoctor(){
        System.out.print("nhập tìm mã: ");
        String id = scanner.nextLine();
        for (PreventiveDoctor preventiveDoctor : preventiveDoctorList) {
            if (preventiveDoctor.getIdPreventiveDoctor().equals(id)) {
                preventiveDoctorList.remove(preventiveDoctor);
            }
        }
    }
}
public class ManagementPerson implements Serializable {
    private List<Person> personList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementPerson() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.personList.add(person);
    }

    public void showListPerson(Person person){
        this.personList.forEach(o -> System.out.println(o.toString()));
    }


    public void findByNamePerson(){
        System.out.print("nhập tên cần tìm: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Person person : personList){
            if(person.getName().equals(name)){
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByAgePerson(){
        System.out.print("nhập số tuổi cần tìm: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Person person : personList){
            if(person.getAge() == age){
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByPhonePerson(){
        System.out.print("nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Person person : personList){
            if(person.getPhone().equals(phone)){
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByAddressPerson(){
        System.out.print("nhập địa chỉ cần tìm: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Person person : personList){
            if(person.getAddress().equals(address)){
                System.out.println(person);
                count++;
            }
        }
    }

    public Person updatePersonByNameAndPhone() {
        System.out.print("nhập tìm tên: ");
        String namePerson = scanner.nextLine();
        System.out.print("nhập tìm số điện thoại: ");
        String phonePerson = scanner.nextLine();
        System.out.println("----------------------------------------");
        for (Person person : personList) {
            if (person.getName().equals(namePerson) && person.getPhone().equals(phonePerson)) {
                ioScanner.updatePerson(person);
            }
        }
        System.out.println("không tìm thấy tên cần sửa!!!");
        return null;
    }

    public void deleteByNameAndPhone(){
        System.out.print("nhập tìm tên: ");
        String name = scanner.nextLine();
        System.out.print("nhập tìm số điện thoại: ");
        String phone = scanner.nextLine();
        for (Person person : personList) {
            if (person.getName().equals(name) && person.getPhone().equals(phone)) {
                personList.remove(person);
            }
        }
    }

}
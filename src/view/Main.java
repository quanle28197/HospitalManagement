package view;

import java.util.Scanner;

import static view.Main.menu;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagementPerson managementPerson = new ManagementPerson();
    public static ManagementDoctor managementDoctor = new ManagementDoctor();
    public static ManagamentPreventiveDoctor managamentPreventiveDoctor = new ManagamentPreventiveDoctor();
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
                    System.out.println("Select the type of personnel you want to add");
                    System.out.println("Enter a: To add doctor information");
                    System.out.println("Enter b: To add preventive doctor information");
                    System.out.println("Enter c: To add nurse infomation");
                    System.out.println("Enter d: To add patient information ");
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
                            System.out.println("Wrong input! Re-enter again");
                        }
                        break;
                    }
                }
                break;
                case "2": {
                    System.out.println("Select the type of list you want to display");
                    System.out.println("Enter a: Show list of doctors");
                    System.out.println("Enter b: Show list of preventive doctor");
                    System.out.println("Enter c: Show list of nurse");
                    System.out.println("Enter d: Show list of patient");
                    System.out.println("Enter e: Show a list of all personnel in the hospital");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Show list of doctors");
                            managementDoctor.showDoctor();
                        }
                        break;
                        case "b": {
                            System.out.println("Show list of preventive doctors");
                            mangamentPreventiveDoctor.showpreventiveDoctor();
                        }
                        break;
                        case "c": {
                            System.out.println("Show list of nurse");
                            managementNurse.showNurse();
                        }
                        break;
                        case "d": {
                            System.out.println("Show list of patient");
                            managementPatient.showPatient();
                        }
                        break;
                        case "e": {
                            System.out.println("Show the list");
                            Person person = new Person();
                            managementPerson.showListPerson(person);
                        }
                        break;
                        default: {
                            System.out.println("Re-enter again");
                        }
                    }
                }
                break;
                case "3": {
                    System.out.println("Select the type of list you want to search");
                    System.out.println("Enter a: Search the list of doctors");
                    System.out.println("Enter b: Search the list of preventive doctors");
                    System.out.println("Enter c: Search the list of nurse");
                    System.out.println("Enter d: Search the list of patient");
                    System.out.println("Enter e: Search for a list of all hospital personnel ");
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
                                    System.out.println("Wrong input! Re-enter again");
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
                                    managementNurse.findbyAddressNurse();
                                }
                                break;
                                case "5": {
                                    managementNurse.findByPhoneNurse();
                                }
                                break;
                                default: {
                                    System.out.println("Wrong input! Re-enter again");
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
                                    System.out.printf("Wrong input! Re-enter again: ");
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
                                    managementPerson.findByNameperson();
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
                                    System.out.println("Wrong input");
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
                case "4": {
                    System.out.println("Select the type of personnel you want to arrange");
                    System.out.println("Enter a: To sort doctor information");
                    System.out.println("Enter b: To sort preventive doctor information");
                    System.out.println("Enter c: To sort nurse information");
                    System.out.println("Enter d: To sort patient information");
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
                                    System.out.println("Wrong input");
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
                                    managamentPreventiveDoctor.sortByIdPreventiveDoctor();
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
                                default: {
                                    System.out.println("Wrong input");
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
                                    System.out.println("Wrong input");
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
                                    System.out.println("Wrong input");
                                }
                                break;
                            }
                        }
                        break;
                        default: {
                            System.out.println("Wrong input!Re-enter again");
                        }
                        break;
                    }
                }
                break;
                case "5": {
                    System.out.println("Select the type of personnel you want to edit");
                    System.out.println("Enter a: To edit doctor information");
                    System.out.println("Enter b: To edit preventive doctor information");
                    System.out.println("Enter c: To edit nurse information");
                    System.out.println("Enter d: To edit patient information");
                    System.out.println("Enter e: To edit personnel information ");
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
                            System.out.println("Wrong input!Re-enter again");
                        }
                        break;
                    }
                }
                break;
                case "6": {
                    System.out.println("Select the type of personnel you want to remove");
                    System.out.println("Enter a: To remove doctor information");
                    System.out.println("Enter b: To remove preventive doctor information");
                    System.out.println("Enter c: To remove nurse information");
                    System.out.println("Enter d: To remove patient information");
                    System.out.println("Enter e: To remove personnel information");
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
                            System.out.println("Wrong input!Re-enter again");
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
                            System.out.println("Wrong input!Re-enter again");
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
                                    System.out.println("Wrong input! Re-enter again");
                                }
                                break;
                            }
                        }
                        break;
                        default: {
                            System.out.println("Please enter again");
                        }
                        break;
                    }
                }
                while (!choice.equals("9")) ;
            }
        }
            public static Person inputinformation() {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter address: ");
                String address = scanner.nextLine();
                System.out.println("Enter gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter phone number: ");
                String phoneNumber = scanner.nextLine();
                Person inputPerson = new Person(name, age, address, gender, phoneNumber);
                return inputPerson;
            }

            public static void addDoctor() {
                System.out.println("Enter doctor information: ");
                Person person = inputinformation();
                System.out.println("Enter id doctor:  ");
                String idDoctor = scanner.nextLine();
                System.out.println("Enter position: ");
                String positionDoctor = scanner.nextLine();
                System.out.println("Enter level salary: ");
                int levelSalaryDoctor = scanner.nextInt();
                Doctor doctor = new Doctor(person, idDoctor, positionDoctor, levelSalaryDoctor);
                managementPerson.addPerson(doctor);
                managementDoctor.addDoctor(doctor);
            }


            public static void addPreventiveDoctor() {
                System.out.println("Enter preventive doctor information");
                Person person = inputinformation();
                System.out.println("Enter id preventive doctor:");
                String idPreventiveDoctor = scanner.nextLine();
                System.out.println("Enter position: ");
                String positionPreventiveDoctor = scanner.nextLine();
                System.out.println("Enter level salary: ");
                int levelSalaryPreventiveDoctor = scanner.nextInt();
                PreventiveDoctor preventiveDoctor = new PreventiveDoctor(person, idPreventiveDoctor, positionPreventiveDoctor, levelSalaryPreventiveDoctor);
                managementPerson.addPerson(preventiveDoctor);
                managamentPreventiveDoctor.addpreventiveDoctor(preventiveDoctor);
            }

            public static void addNurse() {
                System.out.println("Enter nurse information: ");
                Person person = inputinformation();
                System.out.println("Enter id nurse");
                String idNurse = scanner.nextLine();
                System.out.println("Enter salary level: ");
                int levelNurse = scanner.nextInt();
                Nurse nurse = new Nurse(person, idNurse, levelNurse);
                managementPerson.addPerson(nurse);
                managementNurse.addNurse(nurse);
            }


            public static void addPatient() {
                System.out.println("Enter patient information");
                Person person = inputinformation();
                System.out.println("Enter id patient: ");
                String idPatient = scanner.nextLine();
                System.out.println("Enter the name of the acquired disease");
                String diseases = scanner.nextLine();
                System.out.println("enter patient status");
                String status = scanner.nextLine();
                System.out.println("Enter height: ");
                double height = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter weight: ");
                double weight = scanner.nextDouble();break;
                scanner.nextLine();
                System.out.println("Enter the number of days of hospitalization");
                int dayInHospital = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter the type of prevention");
                String typeRoom = scanner.nextLine();
                System.out.println("Enter id room: ");
                int idRoom = scanner.nextInt();
                Patient patient = new Patient(person, idPatient, diseases, status, height, weight, dayInHospital, typeRoom, idRoom);
                managementPerson.addPerson(patient);
                managementPatient.addPatient(patient);
            }

            private static void templateFind() {
                System.out.println("Select search type");
                System.out.println("1. Search by code");
                System.out.println("2. Search by name");
                System.out.println("3. Search by age");
                System.out.println("4. Search by address");
                System.out.println("5. Search by phone number");
            }

            private static void templateFindPerson() {
                System.out.println("Select search type: ");
                System.out.println("1. Search by name");
                System.out.println("2. Search by age");
                System.out.println("3. Search by address");
                System.out.println("4. Search by phone number");
            }

            private static void templateSort() {
                System.out.println("Select sort type: ");
                System.out.println("1. Sort by code");
                System.out.println("2. Sort by name");
                System.out.println("3. Sort by age");
                System.out.println("4. Sort by salary level");
            }

            private static void templateSortPatient() {
                System.out.println("Select sort type: ");
                System.out.println("1. Sort by patient code");
                System.out.println("2. Sort by patient name");
                System.out.println("3. Sort by patient age");
                System.out.println("4. Sort by illness ");
                System.out.println("5. Sort by room number");
                System.out.println("6. Sort by type room");
                System.out.println("7. Sort by day in hospital");
            }

            private static void templateWriteFile() {
                System.out.println("Select the list to save");
                System.out.println("a. Save doctor list");
                System.out.println("b. Save preventive doctor list");
                System.out.println("c. Save nurse list");
                System.out.println("d. Save patient list");
            }

            private static void templateReadFile() {
                System.out.println("Select the list to read");
                System.out.println("a. Read doctor list");
                System.out.println("b. Read preventive doctor list");
                System.out.println("c. Read nurse list");
                System.out.println("d. Read patient list");
            }

            private static void menu() {
                System.out.println("");
                System.out.println("--Menu");
                System.out.println("------------------------------------------");
                System.out.println("1. Add personnel ");
                System.out.println("2. Show list personnel");
                System.out.println("3. Search personnel");
                System.out.println("4. Sort personnel");
                System.out.println("5. Edit personnel information");
                System.out.println("6. Remove personnel information");
                System.out.println("7. Save to CSV");
                System.out.println("8. Read file personnel");
                System.out.println("9. Exit");
                System.out.println("------------------------------------------");
                System.out.println("Enter your select: ");
            }
    }
}

package view;

import java.util.Scanner;

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
                    switch (choice) {
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
                case "2" {
                    System.out.println("Select the type of list you want to display");
                    System.out.println("Enter a: Show list of doctors");
                    System.out.println("Enter b: Show list of preventive doctor");
                    System.out.println("Enter c: Show list of nurse");
                    System.out.println("Enter d: Show list of patient");
                    System.out.println("Enter e: Show a list of all personnel in the hospital");
                    String type = scanner.nextLine();
                    switch (choice) {
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
                            System.out.println( "Show list of patient");
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
                    switch (choice) {
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
                                case "1" : {
                                    managementDoctor.sortByIdDoctor();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

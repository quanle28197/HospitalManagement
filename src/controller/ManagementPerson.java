package controller;

import model.Person;
import service.IOScanner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementPerson implements Serializable {
    private List<Person> personList;
    Scanner scanner = new Scanner(System.in);
    IOScanner ioScanner = new IOScanner();

    public ManagementPerson() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void showListPerson(Person person) {
        this.personList.forEach(o -> System.out.println(o.toString()));
    }

    public void findByNamePerson() {
        System.out.println("Enter name to find: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByAgePerson() {
        System.out.println("Enter age to find: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for (Person person : personList) {
            if (person.getAge() == age) {
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByPhonePerson() {
        System.out.println("Enter phone number to find: ");
        String phone = scanner.nextLine();
        int count = 0;
        for (Person person : personList) {
            if (person.getPhone().equals(phone)) {
                System.out.println(person);
                count++;
            }
        }
    }

    public void findByAddressPerson() {
        System.out.println("Enter address to find: ");
        String address = scanner.nextLine();
        int count = 0;
        for (Person person : personList) {
            if (person.getAddress().equals(address)) {
                System.out.println(person);
                count++;
            }
        }
    }

    public Person updatePersonByNameAndPhone() {
        System.out.println("Enter to find by name: ");
        String name = scanner.nextLine();
        System.out.println("Enter to find by phone number");
        String phone = scanner.nextLine();
        System.out.println("-------------------------------");
        for (Person person : personList) {
            if (person.getName().equals(name) && person.getPhone().equals(phone)) {
                ioScanner.updatePerson(person);
            }
        }
        System.out.println("Can't find the name to edit!!");
        return null;
    }

    public void deleteByNameAndPhone() {
        System.out.println("Enter to find by name: ");
        String name = scanner.nextLine();
        System.out.println("Enter to find by phone number: ");
        String phone = scanner.nextLine();
        System.out.println("-------------------------------");
        for (Person person : personList) {
            if (person.getName().equals(name) && person.getPhone().equals(phone)) {
                personList.remove(person);
            }
        }
    }
}

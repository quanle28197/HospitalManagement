package view;

import account.createAccount.UserPersonalInformation;
import account.user.AccountUser;
import controller.ManagementPatient;
import service.IOFile;
import service.ReadAndWrite.Validate;

import java.util.Scanner;

import static view.Menu_Admin.addPatient;

public class Menu_User {
    AccountUser user;
    Scanner scanner = new Scanner(System.in);
    UserPersonalInformation userPersonalInformation = new UserPersonalInformation();
    public static ManagementPatient managementPatient = new ManagementPatient();
    public static IOFile ioFile = new IOFile();
    private static Validate validate = new Validate();
    boolean isValidNumber;

    public Menu_User(AccountUser user) {
        this.user = user;
        do {
            isValidNumber = true;
            System.out.println("-----------------------------------------------------------");
            System.out.println("   ---USER ARE LOGGING IN TO THE SYSTEM :" + user.getName() + "---");
            System.out.println("-----------------------------------------------------------");
            System.out.println("|1. Add personnel ");
            System.out.println("|2. Edit personnel information");
            System.out.println("|0. Back to Main Menu                                     |");
            System.out.println("\\_________________________________________________________//");
            System.out.print("Make your choice: ");
            try{
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        userPersonalInformation.userDetail(user);
                        break;
                    case 2:
                        managementPatient.updatePatientById();
                        break;
                    case 0:
                        new MainMenu();
                        break;
                    default:
                        System.out.println("Input number incorrect");
                        new Menu_User(user);
                }
            }catch (NumberFormatException e) {
                System.out.println("Input number incorrect");
                isValidNumber = false;
            }
        }while (!isValidNumber);
    }
}

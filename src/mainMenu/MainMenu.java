package mainMenu;

import account.createAccount.CreateAccount;
import account.login.Login;
import controller.*;
import model.*;
import service.IOFile;
import service.Validate;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public class MainMenu {
        Login login = new Login();
        CreateAccount createAccount = new CreateAccount();

        public MainMenu() {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("--------------------------------------------------");
                System.out.println("|-----------WELCOME TO ANGLE HOSPITAL------------|");
                System.out.println("|                                                |");
                System.out.println("|        Already have account? Type -yes!        |");
                System.out.println("|           Not have yet? Type -create!          |");
                System.out.println("\\________________________________________________/");
                System.out.print("Make your choice: ");

                try {
                    String choice = scanner.nextLine();
                    System.out.println(".......");
                    switch (choice) {
                        case "yes":
                            login.loginSystem();
                            break;
                        case "create":
                            createAccount.createAcc();
                            break;
                        default:
                            System.err.println("Wrong input");
                    }
                } catch (InputMismatchException | IOException e) {
                    System.err.println("Input number incorrect");
                }
            } while (true);
        }

    }
}


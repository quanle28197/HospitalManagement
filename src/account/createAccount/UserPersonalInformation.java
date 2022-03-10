package account.createAccount;

import account.user.AccountUser;
import account.user.AccountUserManagement;

import java.util.Scanner;

public class UserPersonalInformation {
    public static Scanner scanner = new Scanner(System.in);
    public static AccountUserManagement accountUserManagement = new AccountUserManagement();
    boolean isValidNumber;

    public int checkValidInteger() {
        int value = -1;
        do {
            isValidNumber = true;
            try{
                value = Interger.parseInt(scanner.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Wrong input, must be number!!");
                System.out.println("Enter again");
                isValidNumber = false;
            }
        }while (!isValidNumber);
        return value;
    }

    public void userDetail(AccountUser user) {
        do {
            isValidNumber = true;
            System.out.println("----------------------------------------------------");
            System.out.println("----|           PERSONAL INFORMATION           |----");
            System.out.println("----------------------------------------------------");
            System.out.println("|                    {  [*]  }                     |");
            System.out.println("-----{User's name : " + user.getName() + "                 }-----");
            System.out.println("-----{User's country : " + user.getCountry() + "                 }-----");
            System.out.println("-----{User's age : " + user.getAge() + "                 }-----");
            System.out.println("-----{Balance available : "+ user.getAccountSummary() + "                 }-----");
            System.out.println("\\---------------------------------------------------/");
            System.out.println("| Choose 1 to edit your profile.                       ");
            System.out.println("| Choose 2 to back to Menu.                         ");
            System.out.println("----------------------------------------------------");
            System.out.print("Make your choice: ");
        }
    }
}

package GroupProject;

import java.util.Scanner;

public class TestUserAccount {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        UserAccount userAccount1 = new UserAccount();

        System.out.println("Please enter your name: ");
        userAccount1.setName(keyboard.nextLine());

        System.out.println("Please enter your local branch: ");
        userAccount1.setLocalBranch(keyboard.next());

        System.out.println("Please enter your current bank balance: ");
        userAccount1.setBalance(keyboard.nextDouble());

        userAccount1.generateUserId();

        System.out.println("***Getting User details***");
        System.out.println("Name: " + userAccount1.getName());
        System.out.println("Account Number: " + userAccount1.getUserId());
        System.out.println("Local branch: " + userAccount1.getLocalBranch());
        System.out.println("Balance: £" + userAccount1.getBalance());
    }//main
}//class
package GroupProject;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestSavings {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        int savingsMenu;
        boolean exitSavingsMenu = false;
        int savingsSwitch;
        boolean exitSavingsSwitch;

        Savings user1 = new Savings();

        System.out.print("\n");
        System.out.print(user1.getSeparator());
        System.out.println(user1.getGreeting());
        System.out.print(user1.getSeparator());
        System.out.println("What type of Savings Account would you like to set up?");
        System.out.print(user1.getSeparator());

        System.out.println(user1.getSavingsMenu());
//        System.out.println(user1.getSavingsSwitch());
//        System.out.println(user1.getBalanceCheck());
        System.out.print(user1.getSeparator());
        System.out.print("\tYou will now be returned to the main menu");
        System.out.println(user1.getDotDotDot());
        System.out.println("\n\t\t\t\t\tMAIN MENU");
        System.out.println("\n\t\tTEST - balance should now be: £" + df.format(user1.getBalance()));
    }//main
}//class
package GroupProject;

import java.util.Scanner;

public class TestMenu {

    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        int mainMenu;
        boolean exitMainMenu = false;

        int accountMenu;
        boolean exitAccountMenu = false;

        int profileMenu;
        boolean exitProfileMenu = false;

        int detailsMenu;
        boolean exitDetailsMenu = false;

        UserAccount userAccount1 = new UserAccount();

        System.out.println("=============================");
        System.out.println("\t  New User Screen");
        System.out.println("=============================");
        System.out.println("Welcome User! Please Press: ");
        do {
            System.out.println("1. Register a Profile");
            System.out.println("2. Exit Program");
            mainMenu = keyboard.nextInt();
            switch (mainMenu) {
                case 1:
                    System.out.println("***Creating your Profile***");

                    System.out.print("Please enter your name: ");
                    keyboard.nextLine();//Needs to be here to consume the line
                    userAccount1.setName(keyboard.nextLine());
                    System.out.print("Please enter your local branch: ");
                    userAccount1.setLocalBranch(keyboard.nextLine());
                    System.out.print("Please enter your email address: ");
//                    userAccount1.setEmail(keyboard.nextLine());
//                    userAccount1.generateUserId();
//                    System.out.println(userAccount1.toString());

                    System.out.println("=============================");
                    System.out.println("\tBank Account Options");
                    System.out.println("=============================");
                    System.out.println("Would you like to see if you meet the criteria for our: ");

                    do {
                        System.out.println("1. Mortgage Accounts");
                        System.out.println("2. Savings Accounts");
                        System.out.println("3. Insurance Accounts");
                        System.out.println("4. Loan Accounts");
                        System.out.println("5. Exit");
                        accountMenu = keyboard.nextInt();
                        switch (accountMenu) {
                            case 1:
                                System.out.println("***Running Mortgage Accounts Class***");
                                //code here
                                break;

                            case 2:
                                System.out.println("***Running Savings Accounts Class***");
                                //code here
                                break;

                            case 3:
                                System.out.println("***Running Insurance Accounts Class***");
                                //code here
                                break;

                            case 4:
                                System.out.println("***Running Loan Accounts Class***");
                                //code here
                                break;

                            case 5:
                                System.out.println("***Exiting Bank Account Options***");
                                exitAccountMenu = true;
                                exitMainMenu = true;
                                break;

                            default:
                                System.out.println("******************************");
                                System.out.println("Invalid Option. Please Press: ");
                                break;
                        }//switch accountMenu
                    } while (exitAccountMenu == false);
                    break;

                case 2:
                    System.out.println("***Exiting Program***");
                    exitMainMenu = true;
                    break;
                default:
                    System.out.println("******************************");
                    System.out.println("Invalid Option. Please Press: ");
                    break;
            }//switch mainMenu
        }while (exitMainMenu == false);

        if (exitAccountMenu == true) {
            System.out.println("=============================");
            System.out.println("\t  Profile Screen");
            System.out.println("=============================");
            System.out.println("Would you like to Update your Profile before Exiting the Program?");
            do {
                System.out.println("Please press: ");
                System.out.println("1. Update Profile");
                System.out.println("2. Exit program");
                mainMenu = keyboard.nextInt();
                switch (mainMenu) {
                    case 1:
                        do {
                            System.out.println("Would you like to update your: ");
                            System.out.println("1. Name");
                            System.out.println("2. Local Branch");
                            System.out.println("3. Email Address");
                            System.out.println("4. Exit Account Profile");
                            profileMenu = keyboard.nextInt();
                            switch (profileMenu) {
                                case 1:
                                    System.out.print("Please enter your Name: ");
                                    keyboard.nextLine();
                                    userAccount1.setName(keyboard.nextLine());

                                    break;

                                case 2:
                                    System.out.print("Please enter your Local Branch Location: ");
                                    keyboard.nextLine();
                                    userAccount1.setLocalBranch(keyboard.nextLine());
                                    break;

                                case 3:
                                    System.out.print("Please enter your Email Address: ");
//                                    keyboard.nextLine();
//                                    userAccount1.setEmail(keyboard.nextLine());
                                    break;

                                case 4:
                                    exitDetailsMenu = true;
                                    exitProfileMenu = true;
                                    System.out.println(userAccount1.toString());
                                    System.out.println("***Exiting Program***");
                                    break;


                                default:
                                    System.out.println("******************************");
                                    System.out.println("Invalid Option. Please Press: ");
                                    break;
                            }//switch accountMenu
                        }while (exitDetailsMenu == false);
                        break;
                    case 2:
                        System.out.println("***Exiting Program***");
                        exitProfileMenu = true;
                        break;

                    default:
                        System.out.println("******************************");
                        System.out.println("Invalid Option ");
                        break;
                }//switch mainMenu
            } while (exitProfileMenu == false);
        }//if
    }//main
}//class
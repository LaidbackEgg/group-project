package GroupProject;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Savings extends UserAccount {
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    String name = "George"; //super.getName();
    String greeting = "";
    String dot = "";
    String separator = "";
    String case1SavingsMenu, case2SavingsMenu;
    int savingsMenu, savingsSwitch;
    boolean exitSavingsMenu;
    double balance = 1000.00; //super.getBalance();
    double savingsAmount, savingsAmount1,interestValue;
    final int TERMINATOR = 0;
    final double HIGHRATE = 0.50, LOWRATE = 0.10;
    final double HIGHMIN = 250.00, LOWMIN = 100.00;

    GregorianCalendar time = new GregorianCalendar();
    int day = time.get(Calendar.DAY_OF_MONTH);

    public Savings() {
    } //default constructor

    protected void setInterestValue(double pInterestValue) {
        interestValue = pInterestValue;
    }//setInterestValue

    protected double getInterestValue() {
        return interestValue;
    }//getInterestValue

    protected void setSavingsAmount(double pSavingsAmount) {
        savingsAmount = pSavingsAmount;
    }//setSavingsAmount

    protected double getSavingsAmount() {
        return savingsAmount;
    }//getSavingValue

    protected void setBalance(double pBalance) {
        balance = pBalance;
    }//setBalance

    protected double getBalance() {
        return balance;
    }

    protected String getName() {
        return name;
    }//getName

    protected double calculationLow() {
        double calculation = ((savingsAmount * 12) * LOWRATE);
        return calculation;
    }

    protected double calculationHigh() {
        double calculation = ((savingsAmount * HIGHRATE) * 12);
        return calculation;
    }


    protected String getSeparator() {
        System.out.println("======================================================");
        return separator;
    }//getSeparator


    protected String getGreeting() {
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        if (hour > 5 && hour < 12) {
            System.out.print("\t\t\t  Good Morning " + getName());
        } else if (hour >= 12 && hour < 17)
            System.out.print("\t\t\t  Good Afternoon " + getName());
        else
            System.out.print("\t\t\t  Hello " + getName());
        return greeting;
    }//getGreeting > this method figures out whether to say Good Morning or Afternoon depending on the hour of the day


    protected String getDotDotDot() {
        int loopcount = 5;
        for (int i = 0; i < loopcount; i++) {
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }//for
        return dot;
    }//getDotDotDot > this method creates a delayed sequence of dots that represent loading


    protected int getSavingsMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\tPress '1' for a High Interest Savings Account " +
                "\n\tbased on 0.50% interest earned over 12 months.\n\t\t(minimum pay-in of £250 p/m applies)");
        System.out.print(getSeparator());
        System.out.println("\tPress '2' for a Low Interest Savings Account " +
                "\n\tbased on 0.10% interest earned over 12 months.\n\t\t(minimum pay-in of £100 p/m applies)");
        System.out.print(getSeparator());
        System.out.println("\t   or Press '0' to return to the main menu.    ");
        System.out.print(getSeparator());
        savingsMenu = keyboard.nextInt();
        do {
            switch (savingsMenu) {
                case 1:
                    System.out.print(getCase1SavingsMenu());
                    break;
                case 2:
                    System.out.print(getCase2SavingsMenu());
                    break;
                case 0:
                    System.out.print("\tThanks, returning you to the main menu");
                    System.out.println(getDotDotDot());
                    System.out.println("\n\t\t\t\t\tMAIN MENU");
                    exitSavingsMenu = false;
                    break;
                default:
                    System.out.print(getSeparator());
                    System.out.print("\t\t Invalid Option. Please try again.\n\n\n");
                    System.out.print(getSeparator());
                    break;
            }//switch savingsMenu
        }while (exitSavingsMenu == true);

        return savingsSwitch;

    }//getSavingsMenu


//    protected int getSavingsSwitch() {
//      i originally had the switch here but moved due to errors
//    }//getSavingsSwitch


    protected Double getCase1SavingsMenu() {

        System.out.print(getSeparator());
        System.out.print("  University Banking Group is proud to introduce the " +
                "\n\t\t\tHigh Interest Savings Account.\n");
        System.out.print(getSeparator());
        System.out.println("We make saving really easy by allowing you to select " +
                "\n an amount that will automatically be collected from " +
                "\nyour Current Account and added to your Savings Account\n   each month. " +
                "The more you save, the more you earn!" +
                "\n\n\t   NOTE: PAY IN A MIN OF £250 P/M TO AVAIL.");
        System.out.print(getSeparator());
        System.out.println("\t\t  Your current balance is: £" + df.format(balance));
        System.out.print("\t\tHow much will you save per month: £");
        setSavingsAmount(keyboard.nextDouble());
        //return getSavingsAmount();
        //System.out.println(getBalanceCheck1());
        return getSavingsAmount();
    }//getCase1

    protected Double getCase2SavingsMenu() {

        System.out.print(getSeparator());
        System.out.print("  University Banking Group is proud to introduce the " +
                "\n\t\t\tLow Interest Savings Account.\n");
        System.out.print(getSeparator());
        System.out.println("We make saving really easy by allowing you to select " +
                "\n an amount that will automatically be collected from " +
                "\nyour Current Account and added to your Savings Account\n   each month. " +
                "The more you save, the more you earn!" +
                "\n\n\t   NOTE: PAY IN A MIN OF £100 P/M TO AVAIL.");
        System.out.print(getSeparator());
        System.out.println("\t\t  Your current balance is: £" + df.format(balance));
        System.out.print("\t\tHow much will you save per month: £");
        setSavingsAmount(keyboard.nextDouble());
        //return getSavingsAmount();
        System.out.println(getBalanceCheck2());
        return getSavingsAmount();
    }

    protected double getBalanceCheck1() {
        GregorianCalendar time = new GregorianCalendar();
        int day = time.get(Calendar.DAY_OF_MONTH);
//            try {
                //while (savingsAmount!= TERMINATOR){
                    if ((savingsAmount > balance) || (savingsAmount < HIGHMIN)) {
                        System.out.println("\t\t\t  You have entered £" + df.format(savingsAmount));
                        System.out.println("\n\t\tSorry, you cannot transfer this amount." +
                                "\n\t\t\t   Please reenter an amount,\n\t\t  or enter '0' to exit to main menu: ");

                        System.out.print(getSeparator());
                        System.out.println("\t\t  Your current balance is: £" + df.format(balance));
                        System.out.print("\t\tHow much will you save per month: £");
                        setSavingsAmount(keyboard.nextDouble());
                        System.out.println(getBalanceCheck1());
                    }//if

                    else {
                        System.out.print(getSeparator());
                        System.out.println("   If you continue to save £" + df.format(savingsAmount)  + " each month for" +
                                "\n   12 months, you will earn £"+ df.format(calculationHigh()) + " in interest.");
                        System.out.println(getSeparator());
                        System.out.println("\t  Your Savings Account has now been set up.\n");
                        System.out.print(getSeparator());
                        System.out.println(" £" + df.format(savingsAmount) + " will be collected on the " + day + "th of each month. " +
                                "\n\tYour Current Account balance is now: £" + df.format(balance - savingsAmount));

                    }//else
        balance = balance - savingsAmount;


                //}//while > awaits the TERMINATOR
        return balance;
//            }//try
//        catch (StackOverflowError e) {
//            //return savingsAmount;
//            }//catch

    }//balanceCheck

    protected double getBalanceCheck2() {
        GregorianCalendar time = new GregorianCalendar();
        int day = time.get(Calendar.DAY_OF_MONTH);
//            try {
        //while (savingsAmount!= TERMINATOR){
            if ((savingsAmount > balance) || (savingsAmount < LOWMIN)) {
                System.out.println("\t\t\t  You have entered £" + df.format(savingsAmount));
                System.out.println("\n\t\tSorry, you cannot transfer this amount." +
                        "\n\t\t\t   Please reenter an amount,\n\t\t  or enter '0' to exit to main menu: ");

                System.out.print(getSeparator());
                System.out.println("\t\t  Your current balance is: £" + df.format(balance));
                System.out.print("\t\tHow much will you save per month: £");
                setSavingsAmount(keyboard.nextDouble());
                System.out.println(getBalanceCheck2());
            }//if

            else {
                System.out.print(getSeparator());
                System.out.println("   If you continue to save £" + df.format(savingsAmount)  + " each month for" +
                        "\n   12 months, you will earn £"+ df.format(calculationHigh()) + " in interest.");
                System.out.println(getSeparator());
                System.out.println("\t  Your Savings Account has now been set up.\n");
                System.out.print(getSeparator());
                System.out.println(" £" + df.format(savingsAmount) + " will be collected on the " + day + "th of each month. " +
                        "\n\tYour Current Account balance is now: £" + df.format(balance - savingsAmount));

            }//else
            balance = balance - savingsAmount;


        //}//while > awaits the TERMINATOR
        return balance;
//            }//try
//        catch (StackOverflowError e) {
//            //return savingsAmount;
//            }//catch

    }//balanceCheck
}//class
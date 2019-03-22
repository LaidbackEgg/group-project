package GroupProject;

import java.text.DecimalFormat;

public class UserAccount {
    static DecimalFormat df = new DecimalFormat(".00");

    private String name = "George Keddy";
    private String userId;
    private String localBranch;
    private double balance;

    public UserAccount(){
    }//Default Constructor

    protected void setName(String nameIn){
        name = nameIn;
    }//setName

    protected void setUserId(String userIdIn){
        userId = userIdIn;
    }//setUserId

    protected void setLocalBranch(String locationIn){
        localBranch = locationIn;
    }//setLocalBranch

    protected void setBalance(double balanceIn){
        balance = balanceIn;
    }//setBalance

    protected String getName(){
        return name;
}//getName

    protected String getLocalBranch(){
        return localBranch;
    }//getLocalBranch

    protected void generateUserId(){
        String char1 = name.substring(0, 1);
        String char2 = localBranch.substring(0, 1);
        int valueOne = (int) (Math.random() * 10);
        int valueTwo = (int) (Math.random() * 10);
        int valueThree = (int) (Math.random() * 10);
        String value1 = Integer.toString(valueOne);
        String value2 = Integer.toString(valueTwo);
        String value3 = Integer.toString(valueThree);
        userId = char1.concat(char2.concat(value1.concat(value2.concat(value3))));
    }//generateUserId

    protected String getUserId(){
        return userId;
    }//getUserId

    protected  double getBalance(){
        return balance;
    }//getBalance


    public String toString(){
        return ("==========================\n" +
                "  Displaying User Profile\n" +
                "==========================\n" +
                "Name: " + name + "\n" +
                "Account Number: " + userId + "\n" +
                "Local branch: " + localBranch + "\n" +
                "Balance: £" + df.format(balance) + "\n");
    }//toString

}//class
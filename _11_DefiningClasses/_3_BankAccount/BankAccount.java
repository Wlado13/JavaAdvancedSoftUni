package _11_DefiningClasses._3_BankAccount;

public class BankAccount {

    private static double interestRate = 0.02;
    private  static int idProvider = 1;
    private int id;
    private double balance;

    public BankAccount(){
        this.id = idProvider++;
    }

    public int getId() {
        return id;
    }

    public double getInterest(int years){
        return balance*years*interestRate;
    }

    public void deposit (double amount){
        balance +=amount;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }
}

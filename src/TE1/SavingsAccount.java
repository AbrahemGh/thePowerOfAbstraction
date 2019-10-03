package TE1;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    private double monthlyInterest;
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest() {
        this.monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        System.out.println("Monthly interest: " + this.monthlyInterest);
    }
    public static void modifyInterestRate(double interestRate) {
        SavingsAccount.annualInterestRate = interestRate;
    }
    private void calc() {
        savingsBalance += this.monthlyInterest;
    }
    @Override
    public String toString() {
        calc();
        return  savingsBalance+"";
    }
}

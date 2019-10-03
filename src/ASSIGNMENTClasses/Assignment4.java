package ASSIGNMENTClasses;

import TE1.Printer;
import TE1.SavingsAccount;

public class Assignment4 extends abstractAssignment {
    public Assignment4(String assignmentName) {
        super.setAssignmentName(assignmentName);

    }
    @Override
    public boolean RunASSIGNMENT() {
        super.PrintAssignmentName();
        super.PrintAssignmentAsText();
        doASSIGNMENT();
        super.Exit();
        return false;
    }

    private void doASSIGNMENT() {
        SavingsAccount saver1=new SavingsAccount(200000);
        SavingsAccount saver2=new SavingsAccount(300000);
        Printer.BLUE_BRIGHT("Create saver1 and saver2 Object with balances of $2000.00 and $3000.00:");
        Printer.YELLOW_BRIGHT("Balance:"+saver1.toString());
        Printer.YELLOW_BRIGHT("Balance:"+saver2.toString());
        Printer.BLUE_BRIGHT("Set annualInterestRate to 4%, then calculate the monthly interest:");
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        Printer.BLUE_BRIGHT("Print the new balances for both savers:");
        Printer.YELLOW_BRIGHT("Balance:"+saver1.toString());
        Printer.YELLOW_BRIGHT("Balance:"+saver2.toString());
        Printer.BLUE_BRIGHT("Set annualInterestRate to 5%, then calculate the monthly interest:");
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        Printer.BLUE_BRIGHT("Print the new balances for both savers:");
        Printer.YELLOW_BRIGHT("Balance:"+saver1.toString());
        Printer.YELLOW_BRIGHT("Balance:"+saver2.toString());

    }
}

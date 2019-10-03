package ASSIGNMENTClasses;

import TE1.Printer;
import com.company.ConsoleColors;




public class Assignment7 extends abstractAssignment {
    public Assignment7(String assignmentName) {
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
        Printer.BLUE_BRIGHT("Invoke print(int number) method, Passing 54 as an argument in the method call:");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        Printer.print(54);
        Printer.BLUE_BRIGHT("Invoke print(String string) method,Passing Abrahem as an argument in the method call:");
        Printer.print(ConsoleColors.YELLOW_BRIGHT+"My name is Abrahem");
        Printer.BLUE_BRIGHT("Invoke print(int number,int repeatInLine):,Passing 5,5 as an argument in the method call:");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        Printer.print(5,5);
        Printer.BLUE_BRIGHT("\nInvoke print(int number,int repeatInLine,int repeatLine):,Passing 1,2,3 as an argument in the method call:");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        Printer.print(1,2,3);

    }

}

package ASSIGNMENTClasses;

import TE1.Employee;
import TE1.Printer;

public class Assignment2 extends abstractAssignment {
    public Assignment2(String assignmentName) {
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
    private void doASSIGNMENT(){
        Employee employee =new Employee("Abrahem","Gh",700);
        Employee employee2 =new Employee("No","Body",1000);
        Printer.BLUE_BRIGHT("Print employee info:");
        Printer.YELLOW_BRIGHT(employee.toString());
        Printer.YELLOW_BRIGHT(employee2.toString());
        employee.raise(.10);
        employee2.raise(.10);
        Printer.BLUE_BRIGHT("After raise 10% ");
        Printer.YELLOW_BRIGHT(employee.toString());
        Printer.YELLOW_BRIGHT(employee2.toString());

    }
}

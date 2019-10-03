package ASSIGNMENTClasses;

import TE1.Person;
import TE1.Printer;
public class Assignment1 extends abstractAssignment {
    public Assignment1(String assignmentName) {
        super.setAssignmentName(assignmentName);

    }

    @Override
    public boolean RunASSIGNMENT() {
        super.PrintAssignmentName();
        super.PrintAssignmentAsText();
        Person person =new Person();
        Printer.BLUE_BRIGHT("Person object has been created with.");
        person.setName("Abrahem");

        person.writeName();
        Printer.BLUE_BRIGHT("Change the name to \"Gh\" using setter");
        person.setName("Gh");
        Printer.BLUE_BRIGHT("Print the name using getter:");
        Printer.YELLOW_BRIGHT(person.getName());
        super.Exit();
        return false;
    }

}

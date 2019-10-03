package ASSIGNMENTClasses;

import TE1.Date;
import TE1.Printer;

import java.time.LocalDateTime;

public class Assignment3 extends abstractAssignment {
    public Assignment3(String assignmentName) {
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
        Printer.BLUE_BRIGHT("Create Date Object and Set Date ");
        LocalDateTime dateTime = LocalDateTime.now();
        Date date= new Date(dateTime.getMonthValue(),dateTime.getDayOfMonth(),dateTime.getYear());
        Printer.BLUE_BRIGHT("Print Date:");
        Printer.YELLOW_BRIGHT(date.toString());
    }
}

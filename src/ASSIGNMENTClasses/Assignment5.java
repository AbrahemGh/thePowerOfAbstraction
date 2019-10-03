package ASSIGNMENTClasses;

import TE1.Printer;
import com.company.ConsoleColors;

public class Assignment5 extends abstractAssignment {
    public Assignment5(String assignmentName) {
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
        Printer.BLUE_BRIGHT("Print the shape using loops :");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        shapeUsingFor(false);
        Printer.BLUE_BRIGHT("Print the shape using while :");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        shapeUsingWhile(false);
        Printer.BLUE_BRIGHT("\nAfter Modify" );
        Printer.BLUE_BRIGHT("Print the shape using loops :");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        shapeUsingFor(true);
        Printer.BLUE_BRIGHT("Print the shape using while :");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        shapeUsingWhile(true);
        System.out.print(ConsoleColors.ANSI_RESET);
    }

    private static void shapeUsingFor(boolean b){
        for (int j = 1; j< 12; j++)  {
            for (int i=0;i<j;i++)
                if(b){
                    if(j%2!=0)
                        System.out.print("8");
                }
                else
                    System.out.print("8");
            System.out.println();
        }
    }
    private static void shapeUsingWhile(boolean b){
        int j=1;
        while (j<12){
            int i=0;
            while (i<j){
                if(b){
                    if(j%2!=0)
                        System.out.print("8");
                }
                else
                    System.out.print("8");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}

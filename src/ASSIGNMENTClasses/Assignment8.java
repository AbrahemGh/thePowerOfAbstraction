package ASSIGNMENTClasses;

import TE1.Printer;
import com.company.ConsoleColors;

import java.util.Scanner;

public class Assignment8 extends abstractAssignment {
    public Assignment8(String assignmentName) {
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
    private  void doASSIGNMENT() {
        Printer.GREEN_UNDERLINED("Note: if input contain one character the application will consider input as String ");
       boolean flag=true;
       while (flag){
        Printer.BLUE_BRIGHT("Enter to test function overloading:\t\t Z to exit Assignment");
        String input= new Scanner(System.in).nextLine();
        try{
            Integer.parseInt(input.replace(" ",""));
            String []x=input.split(" ");
            int []temp = new int[x.length];
            for (int i=0;i<x.length;i++)
                temp[i]=Integer.parseInt(x[i]);

            switch (temp.length){
                case 1:Printer.BLUE_BRIGHT("print(int Number) Invoked.");
                    System.out.print(ConsoleColors.YELLOW_BRIGHT);
                    Printer.print(temp[0]);
                    break;
                case 2:Printer.BLUE_BRIGHT("print(int number,int repeatInLine) Invoked.");
                        System.out.print(ConsoleColors.YELLOW_BRIGHT);
                        Printer.print(temp[0],temp[1]);
                    System.out.println(ConsoleColors.ANSI_RESET);
                break;
                case 3:Printer.BLUE_BRIGHT("print (int number,int repeatInLine,int repeatLine) Invoked.");
                        System.out.print(ConsoleColors.YELLOW_BRIGHT);
                        Printer.print(temp[0],temp[1],temp[2]);
                break;
                default:Printer.ANSI_RED("Input is Wrong.");
                break;
            }
        }catch (NumberFormatException e){
            if(input.compareTo("Z")==0)
                flag=false;
            else {
                System.out.print(ConsoleColors.YELLOW_BRIGHT);
                Printer.BLUE_BRIGHT("print(String stringToPrint) Invoked.");
                Printer.print(input);
            }
        }

       }
    }
}

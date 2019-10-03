package ASSIGNMENTClasses;

import TE1.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Assignment10 extends abstractAssignment {
    private static final String Hello="Hello";
    public Assignment10(String assignmentName) {
        super.setAssignmentName(assignmentName);
    }

    @Override
    public boolean RunASSIGNMENT() {
        super.PrintAssignmentName();
        super.PrintAssignmentAsText();
        doASSIGNMENT(new Scanner(System.in).nextLine());
        super.Exit();
        return false;
    }


    // this function should be divide to 2 separate procedure.
   private static void doASSIGNMENT(String s)throws IllegalArgumentException{
       if(s.length()!=0 && Assignment10.Hello.length()!=0) {
           System.out.println("Enter A text:");
           Printer.BLUE_BRIGHT("String before replace:");
           Printer.YELLOW_BRIGHT(s);
           int index = 0;
           List listOfLocation = new ArrayList();
           while (s.indexOf(Assignment10.Hello,index)!=-1) {
               index=s.indexOf(Assignment10.Hello, index);
               listOfLocation.add(index);
               index++;
           }
           Printer.BLUE_BRIGHT("Locations of each occurrence of “Hello”:");
           Printer.YELLOW_BRIGHT(Arrays.toString(listOfLocation.toArray()));
           Printer.BLUE_BRIGHT("The number of occurrences of word “Hello”:");
           Printer.YELLOW_BRIGHT(listOfLocation.size()+"");
           Printer.BLUE_BRIGHT("String after replace all ‘h’ letters in the String with ‘*’:");
           Printer.YELLOW_BRIGHT(s.replaceAll("h","*"));

       }else
           throw new IllegalArgumentException();
   }

}

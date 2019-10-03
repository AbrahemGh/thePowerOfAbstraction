package ASSIGNMENTClasses;

import java.util.Scanner;

import TE1.Printer;

public class Assignment6 extends abstractAssignment {
    public Assignment6(String assignmentName) {
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
        boolean flag=true;
        int firstNumber,secondNumber;
        String x="";
        char op;
        Scanner scanner;
        do {
            try{
                Printer.YELLOW_BRIGHT("Enter First Number\t   Z to exit");
                scanner= new Scanner(System.in);
                x=scanner.nextLine();
                firstNumber=Integer.parseInt(x);
                Printer.YELLOW_BRIGHT("Enter Second Number\t   Z to exit");
                x=scanner.nextLine();
                secondNumber=Integer.parseInt(x);
                Printer.YELLOW_BRIGHT("Enter Operation To Preform. /Z to exit.");
                op=scanner.next().charAt(0);
                switch (op){
                    case '+':Printer.YELLOW_BRIGHT(firstNumber+" + "+secondNumber+"="+(firstNumber+secondNumber)+"");break;
                    case '-':Printer.YELLOW_BRIGHT(firstNumber+" - "+secondNumber+"="+(firstNumber-secondNumber)+"");break;
                    case '*':Printer.YELLOW_BRIGHT(firstNumber+" * "+secondNumber+"="+(firstNumber*secondNumber)+"");break;
                    case '/':Printer.YELLOW_BRIGHT(firstNumber+" / "+secondNumber+"="+(firstNumber/secondNumber)+"");break;
                    case 'Z': flag=false;break;
                    default:Printer.ANSI_RED("Entered Operator Is Incorrect." );break;
                }
            }catch (NumberFormatException ex){
                if("Z".equals(x)) {
                    break;
                }else
                    Printer.ANSI_RED( "Entered Operator Is Incorrect." );
            }catch (ArithmeticException e){
                Printer.ANSI_RED( "Can't divide  by 0"  );
            }catch (Exception e){
                Printer.ANSI_RED( "Oops!\nsomething went wrong. try again." );
            }
        }while (flag);

    }
}

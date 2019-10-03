package com.company;

import ASSIGNMENTClasses.*;
import TE1.Printer;

import java.util.Scanner;

public class Main {
    private final static String ASSIGNMENT="Assignment";
    public static void main(String[] args){
        // write your code here
        abstractAssignment [] abstractAssignments  = new abstractAssignment[9];
        abstractAssignments[0]= new Assignment1(ASSIGNMENT+"1");
        abstractAssignments[1]= new Assignment2(ASSIGNMENT+"2");
        abstractAssignments[2]= new Assignment3(ASSIGNMENT+"3");
        abstractAssignments[3]= new Assignment4(ASSIGNMENT+"4");
        abstractAssignments[4]= new Assignment5(ASSIGNMENT+"5");
        abstractAssignments[5]= new Assignment6(ASSIGNMENT+"6");
        abstractAssignments[6]= new Assignment7(ASSIGNMENT+"7");
        abstractAssignments[7]= new Assignment8(ASSIGNMENT+"8");
        abstractAssignments[8]= new Assignment10(ASSIGNMENT+"10");
        Scanner scanner = new Scanner(System.in);
        String choose;
        while (true){
            try {
                printOptions();
                choose= scanner.nextLine();
                if ("Q".equals(choose)) {
                    System.exit(0);
                } else {
                    abstractAssignments[Integer.parseInt(choose)].RunASSIGNMENT();
                }
            }catch (Exception e){
                System.out.println("UNKNOWN COMMAND :/");
                System.out.println(e.getMessage());
            }
        }
    }
    private static void printOptions(){
        System.out.println("\n\n");
        Printer.CYAN_BOLD_BRIGHT("**************************************************************");
        Printer.CYAN_BOLD_BRIGHT("Choose Assignment Number to run:");
        Printer.CYAN_BOLD_BRIGHT("1 Assignment1\t2 Assignment2\t3 Assignment3\t4 Assignment4 ");
        Printer.CYAN_BOLD_BRIGHT("5 Assignment5\t6 Assignment6\t7 Assignment7\t8 Assignment8 ");
        Printer.CYAN_BOLD_BRIGHT("10 Assignment10\nQ Quit");
    }




}
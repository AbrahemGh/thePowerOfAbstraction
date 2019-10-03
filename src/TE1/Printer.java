package TE1;

import com.company.ConsoleColors;

public class Printer{
    public static void print (int number){
        System.out.println("this is integer "+number);
    }
    public static void print (int number,int repeatInLine){
        for (int i = 0; i < repeatInLine; i++) {
            System.out.print(number);
        }
    }
    public static void print (int number,int repeatInLine,int repeatLine){
        for (int i = 0; i < repeatLine; i++){
            print(number,repeatInLine);
            System.out.println();
        }
    }
    public static void print(String stringToPrint){
        System.out.println("this is String "+stringToPrint);
    }
    public static void ANSI_RED(String message){
        System.out.println(ConsoleColors.ANSI_RED+message+ConsoleColors.ANSI_RESET);
    }
    public static void GREEN_UNDERLINED(String message){
        System.out.println(ConsoleColors.GREEN_UNDERLINED+message+ConsoleColors.ANSI_RESET);
    }
    public static void YELLOW_BRIGHT(String message){
        System.out.println(ConsoleColors.YELLOW_BRIGHT+message+ConsoleColors.ANSI_RESET);
    }
    public static void BLUE_BRIGHT(String message){
        System.out.println(ConsoleColors.BLUE_BRIGHT+message+ConsoleColors.ANSI_RESET);
    }
    public static void ANSI_PURPLE(String message){
        System.out.println(ConsoleColors.ANSI_PURPLE+message+ConsoleColors.ANSI_RESET);
    }
    public static void RED_BRIGHT(String message){
        System.out.println(ConsoleColors.RED_BRIGHT+message+ConsoleColors.ANSI_RESET);
    }
    public static void CYAN_BOLD_BRIGHT(String message){
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+message+ConsoleColors.ANSI_RESET);
    }
}

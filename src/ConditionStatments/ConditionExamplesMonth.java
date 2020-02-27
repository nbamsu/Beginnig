package ConditionStatments;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ConditionExamplesMonth {
    public static void main(String [] args) {

        /*
        Write a code that will accept month number
        and it will print message with month name
        and number of days in that month
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of month");
        byte monthNumber = input.nextByte();


        if (monthNumber == 1) {
            System.out.println("January has 31 days");
        } else if (monthNumber == 2) {
            System.out.println("February has 29 days");
        } else if (monthNumber == 3) {
            System.out.println("March has 31 days");
        } else if (monthNumber == 4) {
            System.out.println("April has 30 days");
        } else if (monthNumber == 5) {
            System.out.println("May has 31 days");
        } else if(monthNumber== 6){
            System.out.println("June has 30 days");
         }else if(monthNumber==7){
System.out.println("July has 31 days");
        }else if (monthNumber==8){
System.out.println("August has 31 days");
        }else if (monthNumber==9) {
            System.out.println("september has 31 days");
        }
        }


                }
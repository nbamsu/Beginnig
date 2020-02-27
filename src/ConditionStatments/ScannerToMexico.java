package ConditionStatments;

import java.util.Scanner;

public class ScannerToMexico {
    public static void main(String [] args){


        Scanner input2=new Scanner(System.in);
        System.out.println("Do you have a ticket ?");
        String ticket=input2.next();

        Scanner input3=new Scanner(System.in);
        System.out.println("Do you have passport");
        String passport=input3.next();

        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a money: ");
        int money=input.nextInt();

        if(ticket.equalsIgnoreCase("yes") &&passport.equalsIgnoreCase("yes") && money>=200 ) {

            System.out.println("If all conditions are tru, you can go ");
        }else if (money>=200 && passport.equalsIgnoreCase("yes") && ticket.equalsIgnoreCase("no")) {
            System.out.println("You need to buy ticket");
        }else if(money>=200 && ticket.equalsIgnoreCase("yes") && passport.equalsIgnoreCase("no")) {
            System.out.println("You need to get passport");

        }else if(ticket.equalsIgnoreCase("yes") && passport.equalsIgnoreCase("yes") && money<=200) {
            int additionalMoney = 200 - money;
            System.out.println("You need more money. The amount is " + additionalMoney);
        }else{
            System.out.println("You can not go to the Mexico");




        }


    }
}

package ConditionStatments;

import java.util.Scanner;

public class VoteEligibility {
    public static void main( String [] Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age=input.nextInt();
        //    "="
        if(age>=18) {
            System.out.println("You are eligible to vote.");
        }else if(age<18){
            System.out.println("Yoa are not eligible to vote");
        }

    }
}

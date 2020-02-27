package ConditionStatments;

import java.util.Scanner;

public class Football {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your jersey number?");
        int jerseyNumber = input.nextInt();
        if (jerseyNumber<=0){
            System.out.println("Your jarsey number is wrong or invalid");
         }else if(jerseyNumber % 2 ==0) {
            System.out.println("Your jersey number is Even");
        }else if (jerseyNumber % 2 ==1) {
            System.out.println("Your jersey number Odd");
        }else{
           System.out.println("Your message is invalid");



            // if the jersey number is 0 or negative number then print
            //a message telling your number is invalid
        }

    }
}

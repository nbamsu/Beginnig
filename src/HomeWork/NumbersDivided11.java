package HomeWork;

import java.util.Scanner;

public class NumbersDivided11 {
    public static void main(String[] args) {
                /*
        Write a program to find the number and sum of all integer between 100 and 200 which are divisible by 11.
        Expected Output; Numbers between 100 and 200, divisible by 11 : 110 121 132 143 154 165 176 187 198 The sum : 1386 PRACTI
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first number:" );
        int number1=input.nextInt();
        System.out.println("Please enter the second number:");
        int number2=input.nextInt();
        int sum=0;
        for (number1=number1; number1<=number2;number1++){
            if (number1%11==0){
                System.out.println(number1);
                sum+=number1;
            }
        }
        System.out.println("Sum of the numbers above :"+  sum);
    }
}

package HomeWork;

import java.util.Random;
import java.util.Scanner;


public class DoWhilePrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter numbers 1-100");
        int number1 = input.nextInt();
        System.out.println("please enter numbers 1-100");
        int number2 = input.nextInt();
        int count = 0;

        do{
            int div=2;
            int sum=0;
            do{
                if(number1%div==0){
                    sum+=div;
                }
                div++;
            }while (div<number1);
            if(sum==0){
                System.out.println(number1+" is prime number");
            }
            number1++;
        }while (number1<number2);



    }
}

package HomeWork;

import java.util.Scanner;

public class homw2 {
    public static void main(String[] args) {

           

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter three numbers");

       int number1=input.nextInt();

       int number2=input.nextInt();
       int number3=input.nextInt();

        boolean result1= number1 >number2&&number1>number3;
        boolean result2= number2>number3&&number2>number1;
        boolean result3=  number3>number2&&number3>number1;
        System.out.println("is largest "+ result1);
        System.out.println("is largest "+ result2);
        System.out.println("is largest "+result3);

    }


}


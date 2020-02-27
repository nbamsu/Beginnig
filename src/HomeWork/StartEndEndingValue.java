package HomeWork;

import java.util.Scanner;

public class StartEndEndingValue {
    public static void main (String [] args){


        Scanner input=new Scanner(System.in);
        System.out.println("ENTER STARTING VALUE: ");
        String value=input.nextLine();

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int value2=input.nextInt();

        System.out.println("Enter ending number: ");
        int value3=input.nextInt();

        System.out.println("The output is "+ value.substring(value2-1,value3));


















    }
}

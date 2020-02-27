package ArithmeticOperators;

import java.util.Scanner;

public class Example2 {
    //Enter a number that is even and less than 100
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number which is even and less than 100");
        //int number = 25;
        int number = input.nextInt();
        System.out.println("Entered number is "+number );
        boolean result = number % 2 ==0;
        boolean result2= number<100;
        System.out.println("Enter number is "+(result || result2));
    }


}
        /*public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number which is even and les than 100");
        int number = input.nextInt();
        System.out.println("Enter number is "+number);
        boolean result = number % 2 == 0;
        boolean result2= number<100;
        System.out.println("Enter number is "+(result2));





    }
   }*/
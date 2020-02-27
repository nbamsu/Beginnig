package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        Random random=new Random();
        int randomNumber=random.nextInt(101);
        int guess;
        int count=0;
        do {
            System.out.println("enter the number between 1-100");
            guess=input.nextInt();

            if (randomNumber > guess)
                System.out.println("Number is too small");
            else if (randomNumber < guess)
                System.out.println("Number is too big");


            count++;
        }while (guess!=randomNumber);
        System.out.println("Your guess is correct. Thank you for playing. \n"+"Random number is "+randomNumber);
        System.out.println("Your total guess is "+count);
    }

}

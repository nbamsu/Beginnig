package HomeWork;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digit number");
        int number = input.nextInt();
        System.out.println("this needs to be reversed " + number);
        int five, four, three, two;
        int fifthValue, fourthValue, thirdValue, secondValue, firstValue;
        five = number % 10;
        fourthValue = number / 10;
        four = fourthValue % 10;
        thirdValue = fourthValue / 10;
        three = thirdValue % 10;
        secondValue = thirdValue / 10;
        two = secondValue % 10;
        firstValue = secondValue / 10;
        System.out.println(five);
        System.out.println(four);
        System.out.println(three);
        System.out.println(two);
        System.out.println(firstValue);
        System.out.println("result " + (five + four + three + two + firstValue));
        System.out.println("" + five + four + three + two + firstValue);
    }
}
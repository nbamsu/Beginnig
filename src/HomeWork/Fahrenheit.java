package HomeWork;

import java.util.Scanner;

public class Fahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter tempreture in Fahrenheit even or less than 17");
        int Fahreinheit = input.nextInt();
        int today=20, tomorrow=20;
       //System.out.println("Entered Fahrenheit " + Fahreinheit);
        // boolean r1= Fahreinheit % 2 == 1;
        // boolean r2= Fahreinheit>17;


        int Celciuse = (Fahreinheit - 32) * 5 / 9;
        System.out.println("Your tempreture is: " + Celciuse);


    }
}
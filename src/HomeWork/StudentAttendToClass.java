package HomeWork;

import java.util.Scanner;

public class StudentAttendToClass {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Age? ");
        int age = input.nextInt();
        System.out.println("Does your family live in Schaumburg?");
        String city = input.next();
        System.out.println("Whats ypur average score? ");
        int score = input.nextInt();
        System.out.println("Are you citizen? ");
        String citizen = input.next();
        if (age >= 14 && city.equalsIgnoreCase("yes") && score >= 75 && citizen.equalsIgnoreCase("yes")) {
            System.out.println(" You are able to attened the classes");
        } else if (age >= 14 && city.equalsIgnoreCase("yes") && score >= 75 && citizen.equalsIgnoreCase("no")) {
            System.out.println("You need citizenship ");
        } else if (citizen.equalsIgnoreCase("yes") && age >= 14 && city.equalsIgnoreCase("yes") && score < 75) {
            System.out.println("Your score should be more than 75 ");
        } else if (score >= 75 && age >= 14 && citizen.equalsIgnoreCase("yes") && city.equalsIgnoreCase("no")) {
            System.out.println("You have to be resident ");
        } else if (city.equalsIgnoreCase("yes") && citizen.equalsIgnoreCase("yes") && score >= 75 && age < 14){
            System.out.println("You cannot attened ");

        }
        }
    }
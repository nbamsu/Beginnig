package HomeWork;

import java.util.Scanner;

public class ApplicationTickets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Class name :");
        String className=input.next();
        className=className.toUpperCase();
        switch (className) {
            case "C":
                System.out.println("Enter price $");
                int price = input.nextInt();
                if (price >= 50 && price <= 70) {
                    System.out.println("Column D, Row 19 ");
                }
                break;


            case "B":
                System.out.println("Enter the price $ ");
                int price2 = input.nextInt();
                if (price2 >= 70 && price2 <= 90) {
                    System.out.println("Column K, Row 10");
                    break;


                }
            case "A":
                System.out.println("Enter the price $");
                int price3 = input.nextInt();
                if (price3 < 90) {
                    System.out.println("PLease enter rest of the amount ");

                } else if (price3 <= 90) {
                    System.out.println("Your session is complete, please return to begining");
                } else{
                 //   (price3 >= 90 && price3 >= 110) {

            }}}}




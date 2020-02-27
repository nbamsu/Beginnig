package Project1;

import java.util.Scanner;

public class Car {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please select the car type");
        System.out.println("Passenger1");
        System.out.println("Bas");
        System.out.println("Truck");
        int carType= input.nextInt();
        if (carType==1) {
            System.out.println("Car fee=2.5$");
        }else if (carType==2) {
            System.out.println("Bus fee=5$");
        }else if (carType==3){
            System.out.println("Truck fee=6.5");


        }
    }
}

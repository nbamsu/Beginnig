package WhileLOOP;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter payment amount $");
        int totalPrice=800;
        int paying=input.nextInt();
        while(paying<totalPrice){
            int differens=totalPrice-paying;
            System.out.println("Please add more $"+differens);
            int restAmount= input.nextInt();
            paying+=restAmount;
        }
        System.out.println("You can buy the Phone ");

    }
}

package HomeWork;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class shoppingApplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of Tomatoes ");
        int tomato=input.nextInt();

        System.out.println("Enter number of Cucumber ");
        int cucumber=input.nextInt();

        System.out.println("Enter number of Carrot");
        int carrot=input.nextInt();

        System.out.println("Enter number of Eggplant");
        int eggs=input.nextInt();

        double price=tomato*1;
        System.out.println("Tomato price $"+price);
        double price2=cucumber*0.50;
        System.out.println("Cucumber price $"+price2);
        double price3=carrot*0.25;
        System.out.println("Carrot price $"+price3 );
        double price4=eggs*2;
        System.out.println("eggs price $"+price4);
        double totalPrice=price+price2+price3+price4;
        System.out.println("Total amount $"+totalPrice );
        double discount=totalPrice*10/100;
        //System.out.println("Discount amount "+discount);
        double totalAmountWithDiscount=totalPrice-discount;
        //System.out.println("Total amount with 10% off $"+totalAmountWithDiscount);

        if(totalPrice>10){
            System.out.println(" Apply Discount  10% off "+totalAmountWithDiscount);
        } if(totalPrice<10) {
            System.out.println("no discount ");

        }
    }
}

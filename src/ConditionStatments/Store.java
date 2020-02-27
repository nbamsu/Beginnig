package ConditionStatments;

import java.util.Scanner;

public class Store {
    /*
    Deal: if customer buys between 10-15 tables, he (she0 get 10% discount
    if customer buys 15-20 tables, there is 20% discount
    if customer buys more than 20 tables, he will het 25%.
    Write a program that will ask from user to enter number of tables
    1 table =110$
     */
public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("How many tables you want to buy");
    int numberOfTable=input.nextInt();
    if(numberOfTable<10) {
        System.out.println("Your total will be: " + numberOfTable * 110);
    }else if(numberOfTable>10 && numberOfTable<15) {
        int discountAmount = numberOfTable * 110 * 10 / 100;
        System.out.println("Your total will be " + (numberOfTable * 110 - discountAmount));
    }else if(numberOfTable>15 && numberOfTable<20){
        int discounAmount = numberOfTable * 110*20/100;
        System.out.print("Your total will be "+(numberOfTable *110 - discounAmount ));
    }else if(numberOfTable>=20) {
        int discountAmount = numberOfTable * 110 * 25 / 100;
        System.out.println("Your total will be " + (numberOfTable * 110 - discountAmount));
    }else{   // only ELSE when negative amount or number
        System.out.println("Your number is invalid");
    }


}

}

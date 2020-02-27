package ScannerPractice;

import java.util.Scanner;

public class newTask {
    public static void main(String [] args){
        /*Scanner input=new Scanner(System.in);
        System.out.println("How much you made");
        int deposit1=input.nextInt();
        Scanner input2=new Scanner(System.in);
        System.out.println("How much you made to day");
        int deposit2=input.nextInt();
        int deposite3=input.nextInt();
        int result=deposit1+deposit2+deposite3;
        System.out.println("Total amount in bank account "+result);


        Scanner input2=new Scanner(System.in);
        double phonePrice=input2.nextDouble();
        double priceComputer=input2.nextDouble();
        double result2=phonePrice+priceComputer;
        System.out.println(" Total spending of money "+result2);

        Scanner input3=new Scanner(System.in);
        int bankSum=input.nextInt();
        double sumResult=result-result2;
        System.out.println("I have left on my account "+sumResult);*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your daily salary");
        int amount=input.nextInt();  //500

        System.out.println("Please enter your daily salary");
        amount+=input.nextInt();  //300

        System.out.println("Please enter your daily salary");
        amount+=input.nextInt(); //400 --->1200

        System.out.println("Total amount in my bank account "+amount);

        System.out.println("HOw much did you spend for computer?");

        float spending=input.nextFloat();
        System.out.println("How much did ypu spend for Phone");

        spending+=input.nextFloat();
        amount-=spending;
        System.out.println("Total amount in my bank account "+amount);

    }
}

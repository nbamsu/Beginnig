package Project1;


import java.util.Scanner;

public class Transactions {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("What is the amount of bank account");
        int accountBalance=input.nextInt();
        System.out.println("How much was your last transaction ");
        int lastTransaction=input.nextInt();
        if (lastTransaction>=100 && lastTransaction<200) {
            System.out.println("Your account balance is "+ (accountBalance - lastTransaction + 2 / 100d));
        }else if(lastTransaction>=200 && lastTransaction<500) {
            System.out.println("Your account balance is " + (accountBalance - lastTransaction + 3 / 100d));
        }else if (lastTransaction >=500) {
            System.out.println("Your account balance is " + (accountBalance - lastTransaction + 5 / 100d));
        }else{
            System.out.println("Your enter is invalid");


        }




    }
}

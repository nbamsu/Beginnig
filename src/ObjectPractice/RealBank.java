package ObjectPractice;

import java.util.Scanner;

public class RealBank {
    public static void main(String[] args) {
        System.out.println("Welcome to Chase Bank");
        System.out.println("What is your name");
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to chase Bank "+input.next()+"!");
        int exit=0;

        BankAccount account=new BankAccount();
        do {
            account.getInstruction();
            System.out.println("Please choose the option");
            int myOption=input.nextInt();
            switch (myOption){
                case 0:
                    account.bankInfo();
                case 1:
                    System.out.println("Please enter deposit amount");
                    int depositAmount=input.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount");
                    int withdrawAmount=input.nextInt();
                    account.withdraw(withdrawAmount);
                case 3:
                    System.out.println("Please Create an account" );
                    String personName=input.next();
                    System.out.println("Please enter account number");
                    int accountNumber=input.nextInt();
                    System.out.println("Please enter your balance");
                    double balance=input.nextInt();
                    System.out.println("Please enter user name");
                    String userName=input.next();
                    System.out.println("Please enter password");
                    String password=input.next();
                    System.out.println("Please enter th date");
                    String date=input.next();
                    account.signUp(personName,accountNumber,balance,userName,password,date);
                    break;
                case 4:
                    System.out.println("Please enter username");
                    String uname=input.next();
                    System.out.println("Please enter password");
                    String pword=input.next();
                    account.logIn(uname,pword);
                    break;
                case 5:
                    exit=5;


            }
        }while (exit!=5);
        System.out.println("Thank you for working with our bank");




    }
}

package ConditionStatments;



import java.util.Scanner;

public class DoYouLNowJavatraining {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("do you know Java? ");
        String java=input.next();

        Scanner input2=new Scanner(System.in);
        System.out.println("Do you know selenium? ");
        String selenium= input.next();

        Scanner input3=new Scanner(System.in);
        System.out.println("Do you know Api Testing? ");
        String apiTestin=input.next();

        if(java.equalsIgnoreCase("yes") && selenium.equalsIgnoreCase("yes") && apiTestin.equalsIgnoreCase("yes")) {
            System.out.println("You are Hired");
        }else if(java.equalsIgnoreCase("yes") && selenium.equalsIgnoreCase("no")){
            System.out.println("You need to know Selenium");

        }


    }

}

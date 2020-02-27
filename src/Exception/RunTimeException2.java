package Exception;

import java.util.Scanner;

public class RunTimeException2 {
    public static void main(String[] args) {
//        int a =5;
//        int b=0;
//        int division=a/b;
        //System.out.println(division);
        Scanner input=new Scanner(System.in);


        int sum=1;
        do{
            int num=input.nextInt();
            int num1=input.nextInt();
        try {
            System.out.println("Division of two numbers is: " + num / num1);
            System.out.println("In try block");
            sum=1;
        }catch (Exception e){
            System.out.println("You can not divide by '0' ");
            sum=0;
        }
        }while (sum==0);
        System.out.println("Thank you for using my app");
    }


}

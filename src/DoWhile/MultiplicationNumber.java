package DoWhile;

import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int number=input.nextInt();
        int multipel=1;

        do{
            int result=number*multipel;
            System.out.println(number+"x"+multipel+"="+result);
            multipel++;


        }while(multipel<=10);



        /*
        If you wanna get sum of the numbers
       , you have to give new data type variable=0; at the beginning
       after all that give new sout.

         */




    }
}

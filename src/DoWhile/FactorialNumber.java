package DoWhile;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        //int multiple=1;
        int factorial=1;

        while(1<number){
            factorial*=1*number;
            number--;
        }
        System.out.println(factorial);
        System.out.println("Please enter second value for do-while loop");
        int num=input.nextInt();
        int factprial1=1;

        do{
            factprial1*=num; //5*4*3*2
            num--;//4, 3, 2, 1
        }while (1<num);
        System.out.println("Result do-while loop");

    }
}

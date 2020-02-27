package ForLoopFirstPractice;

import java.util.Scanner;

import static sun.misc.Version.println;

public class FindLargestValue {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to input :");
        int inputNumber=input.nextInt();

        System.out.println("Start entering the numbers");
        int firstNumber=input.nextInt();

        for(int i=0;i<inputNumber-1;i++){
            int secondNumber=input.nextInt();
            if(firstNumber<secondNumber){
            firstNumber=secondNumber;

        }
    }
        System.out.println("Largest value :"+firstNumber);

}
}

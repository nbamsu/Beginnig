package ForLoopFirstPractice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int firstNumber=input.nextInt();
        int secondNumber=input.nextInt();

        for(int i=firstNumber;i<secondNumber;i++){
            int result=0;

            for(int k=2;k<i;k++){
                if(i%k==0){
                    result+=k;
                }



            }
            if(result==0){
                System.out.println(" prime number are:  "+i);
            }


        }

    }
}

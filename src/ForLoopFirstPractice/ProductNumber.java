package ForLoopFirstPractice;

import java.util.Scanner;

public class ProductNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=input.nextInt();
        int produc=1;
        int sum=0;

        for(int i=number;i>0;i/=10){

            int digit=i%10;
            produc*=digit;
            sum+=digit;




        }
        System.out.println(produc-sum); // dont forget System out outside the curly braces
    }
}

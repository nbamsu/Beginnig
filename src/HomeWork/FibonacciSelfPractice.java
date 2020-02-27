package HomeWork;

import java.util.Scanner;

public class FibonacciSelfPractice {
    public static void main(String[] args) {
       Scanner num=new Scanner(System.in);
        System.out.println("Enter number, which will be the bounder");
        int n=num.nextInt();
        int a=0;
        int b=1;
        int count=0;
       // System.out.println(a+" "+b);
        while (count<=n){
            count=a+b;
            if (count>=n){
                break;
            }
            System.out.println(count+" ");
                a=b;
                b=count;

        }
    }
}

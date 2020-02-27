package HomeWork;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void arm(int numb) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
    int num=input.nextInt();
    int temp=num;
    int number;
    int sum=0;
    while(num>0) {
        number=num%10;
        num=num/10;
        sum+=number*number*number;
    }
    if(temp==sum){
        System.out.println( true);
    }else{
        System.out.println(false);
    }
    }

    public static void main(String[] args) {
        arm(15);
    }
}

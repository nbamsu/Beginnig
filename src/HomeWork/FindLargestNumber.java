package HomeWork;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 6 numbers :");
        int num=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();
        int num5=input.nextInt();
        int num6=input.nextInt();
        if(num>num2){
            int temp=num;
            num=num2;
            num2=temp;
        }
        if(num>num3){
            int temp=num;
            num=num3;
            num3=temp;
        }
        if(num>num4){
        int temp=num;
        num=num4;
        num4=temp;
    }
        if (num>num5){
            int temp=num;
            num=num5;
            num5=temp;
        }
        if (num>num6){
            int temp=num;
            num=num6;
            num6=temp;
        }
        if (num2>num3){
            int temp=num2;
            num2=num3;
            num3=temp;
        }
        if (num2>num4){
            int temp=num2;
            num2=num4;
            num4=temp;
        }
        if (num2>num5){
            int temp=num2;
            num2=num5;
            num5=temp;
        }
        if (num2>num6){
            int temp=num2;
            num2=num6;
            num6=temp;
        }
        if (num3>num4){
            int temp=num3;
            num3=num4;
            num4=temp;
        }
        if (num3>num5){
            int temp=num3;
            num3=num5;
            num5=temp;
        }
        if (num3>num6){
            int temp=num3;
            num3=num6;
            num6=temp;
        }
        if (num4>num5){
            int temp=num4;
            num4=num5;
            num5=temp;
        }
        if (num5>num6){
            int temp=num5;
            num5=num6;
            num6=temp;
        }
        System.out.println(num6+"\n"+num5+"\n"+num4+"\n"+num3+"\n"+num2+"\n"+num);
        }

}

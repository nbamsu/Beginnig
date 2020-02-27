package HomeWork;

import java.util.Scanner;

public class homeworkWithTeacher {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        boolean num1Result=num1>num2&&num1>num3;
        boolean num2Result=num2>num3&&num2>num1;
        boolean num3Result=num3>num2&&num3>num1;
        System.out.println(num1+" Is largest number "+num1Result);
        System.out.println(num2+" is largest numberr "+num2Result);
        System.out.println(num3+" Is largest number"+num3Result);


    }
}

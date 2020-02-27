package HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {



       /* byte num = 9;//-128 -->127
        short num2 = 20;
        byte result=(byte)(num*num2);
        //short result = (short) (num * num2);
        System.out.println("Result is "+result);

       int number=(int)4.7;
       System.out.println(number);


       //float fl=5
        //float fl1=5.5 decimal number
       byte k=(byte)5f;// explicitly casting in Java
        System.out.println(k);


        short x=6;
        short t=8;
        x+=t;  //Compound assignment
        System.out.println(x);


        //byte by=10
        //int i=by;

        int floorNumber=8;
        boolean result1=floorNumber!=13;
        System.out.println(result1);

        int a,b,c,d;
        a=2;
        b=3;
        c=a+b/4;
        d=c+7;
        System.out.println(d);*/


        Scanner input=new Scanner (System.in);
        System.out.println("Enter first day sale amount " );
        int amount=input.nextInt();

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter second day sale amount ");
        amount+=input2.nextInt();

        Scanner input3=new Scanner(System.in);
        System.out.println("Enter third day sale amount ");
        amount+=input3.nextInt();

        Scanner input4=new Scanner(System.in);
        System.out.println("Enter Fourth day sale amount ");
        amount+=input4.nextInt();

        Scanner input5=new Scanner(System.in);
        System.out.println("enter fifth day sale amount ");
        amount+=input5.nextInt();

        Scanner input6=new Scanner(System.in);
        System.out.println("Enter sixth day sale ");
        amount+=input6.nextInt();

        Scanner input7=new Scanner(System.in);
        System.out.println("enter seventh day sale amount ");
        amount+=input7.nextInt();

        int totalAmount=amount;
        System.out.println("Total amount for seven day "+totalAmount);

        Scanner input8=new Scanner(System.in);
        System.out.println("Enter commission percentage");
        double percent=input8.nextDouble();
        double commissionfee=percent*totalAmount/100;

        double payPercent=totalAmount*100/percent;
        System.out.println("Total amount of 7 days is commission "+ commissionfee);










    }
}
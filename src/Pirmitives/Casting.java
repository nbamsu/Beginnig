package Pirmitives;

public class Casting {
    public static void main(String [] Args){

        byte number=7;
        short number2=30;

        short result=(short)(number*number2);
        System.out.println("Result is "+result);  // we can change for byte(

       // int -- Integer,Integral value
        int num=(int)4.7;
        System.out.println(num);


        //Float fl=5
        //Float fl1=5.5;
        byte k=(byte)5f;
        System.out.println(k);


        short x=6;
        short t=8;
        x+=t; // compound assignment
        System.out.println(x);



    }
}

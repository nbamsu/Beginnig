package HomeWork;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the year");
        int year=input.nextInt();
        int leapyear=year/4;
        if ((year%4==0) &&(year%100!=0) || (year%400==0)){
            System.out.println("It is Leap Year "+year);
        }else{
            System.out.println("It isn't Leap Year "+year);
        }
    }
}

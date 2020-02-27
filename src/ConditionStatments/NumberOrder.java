package ConditionStatments;

import java.util.Scanner;

public class NumberOrder {
    public static void main (String [] args){
        Scanner inut=new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
        int first=inut.nextInt(); //10    change 10-->5  if true change places
        int second=inut.nextInt();//5     change10 -->4
        int third=inut.nextInt(); //4     change10 -->
        int fourth=inut.nextInt();//8

        if (first>second){
            int temp=first;//10
            first=second;//5
            second=temp; //10
        }
        if(first>third){
            int tepm=first; //5
            first=third; //4
            third=tepm;// 5
        }
        if(first>fourth){
            int temp=first;
            first=fourth;
            fourth=temp;
        }
        if(second>third){
            int temp=second;
            second=third;
            third=temp;
            }
        if(second>third){
            int temp=second;
            second=third;
            third=temp;
        }
        if(third>fourth){
            int temp=third;
            third=fourth;
            fourth=temp;
        }
        System.out.println(fourth+"\n"+third+"\n"+second+"\n"+first+"\n");
    }
}

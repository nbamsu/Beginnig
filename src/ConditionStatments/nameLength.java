package ConditionStatments;

import java.util.Scanner;

public class nameLength {
    public static void main(String [] Args){
        /*
        Create an application that will ask from user his (her) name and  will check the number of characters in name
        and if it less than 5 it will give message you name characters is less than5. Else it will give message
        your name characters more than 5
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name= input.next();  // input.next use only for letters
        System.out.println("Your name is "+ name );
        System.out.println(name.length());
        if(name.length()<5) {
            System.out.println("Your name has less than 5 characters");
        }else if(name.length()>5){
        }
    }
}

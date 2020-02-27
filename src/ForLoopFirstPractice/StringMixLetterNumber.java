package ForLoopFirstPractice;

import java.util.Scanner;

public class StringMixLetterNumber {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the words and numbers ");
        String str= input.next();

        for(int i=0;i<str.length();i++){
            //System.out.print(str.charAt(i) +",");

            for(char ch='A';ch<='Z';ch++){
                if(str.charAt(i)==ch){
                    System.out.print(str.charAt(i));
                }
        }



        }
    }
}

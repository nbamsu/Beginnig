package DoWhile;

import java.util.Scanner;

public class ReversString {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string");
        String word=scanner.next();
        String reversed="";
        int length=word.length()-1;

        while(length>=0){
            reversed+=word.charAt(length);
            length--;
        }
        System.out.println("Reversed value is : "+reversed);


    }
}

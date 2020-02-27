package DoWhile;

import java.util.Scanner;

public class Countchar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the string");
        String text=input.next();
        System.out.println("Please enter character");
        char char1=input.next().charAt(0);
        int length=text.length()-1;
        int count=0;
        while(length>=0){
            if(text.charAt(length)==char1){
                count++;
            }length--;
        }
        System.out.println("Count is "+count);
    }
}



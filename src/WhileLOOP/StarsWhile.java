package WhileLOOP;

import java.util.Scanner;

public class StarsWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=input.nextInt();
        String star="*";
        while(number>0) {
            System.out.println(star);
            star+="*";
            number--;
        }
    }
}

package WhileLOOP;

import java.util.Scanner;

public class StartAndEnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int start=input.nextInt();
        System.out.println("Enter second number: ");
        int end=input.nextInt();

        while(start<end){

            //start%2!=0
            //start%2==1
            //if start is equals to odd number print start
            if(start%2!=0){
                System.out.println(start);
            }
            start++;
        }
    }
}

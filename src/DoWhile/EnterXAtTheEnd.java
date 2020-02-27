package DoWhile;

import java.util.Scanner;

public class EnterXAtTheEnd {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String value=scanner.next();
        System.out.println("Enter for second string");
        String value2=scanner.next();

        while(value.length()<20){
            value+="*";
        }
        System.out.println("While loop -->"+value);

        do{
            value2+="*";
        }while(value2.length()<20);
        System.out.println("Do_while loop -->"+value2);
        /*
        While loop: If you need to check condition first then run the loop.
        YOu need to use the while loop.

        Do-While loop: if the user should input the answer, or if the your code should run the first,
        you need to use the do-while loop.
        For example : guessing the number application, giving the username and password.
         */
    }
}

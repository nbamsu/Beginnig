package ForLoopFirstPractice;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.next();

        for(char i =0;i<name.length();i++){

            if(name.charAt(i)=='a'||name.charAt(i)=='c'){
                break;
            }
            System.out.println(name.charAt(i));
        }

    }
}

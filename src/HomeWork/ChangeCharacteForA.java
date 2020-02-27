package HomeWork;

import DoWhile.FirstPractice;


import java.util.Scanner;

public class ChangeCharacteForA {
    public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
        System.out.println("please enter word");
        String text =input.next();
        int count=0;
        char replaceChar='a';
        String result=text;
        do {
            result=result.replace(text.charAt(count),replaceChar);
            count++;
            System.out.println(result);
        }while(count<=text.length()-1);

    }
}


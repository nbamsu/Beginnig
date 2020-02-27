package ForLoopFirstPractice;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
            System.out.println("the value for i is : "+i);
        }
       Scanner input=new Scanner(System.in);
        System.out.println("enter the String name ");
       String name=input.next();

       for(int count=0;count<name.length();count++){
        System.out.print(name.charAt(count));
        }
        String str="Techtorial Academy";
        for(int i=str.length()-1;i>0;i--){
            System.out.print(str.charAt(i)+" ,");
        }
        System.out.println();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
            reversed+=str.charAt(i);
        }




    }
}

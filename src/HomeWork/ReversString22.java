package HomeWork;

import java.util.Scanner;

public class ReversString22 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Enter your name");
        String str2=name.nextLine();
        String str="";
        for (int i=str2.length()-1;i>=0;i--){
           str+= str2.charAt(i);
        }
        System.out.println(str);

    }
}

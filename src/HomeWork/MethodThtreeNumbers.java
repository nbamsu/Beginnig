package HomeWork;

import java.util.Scanner;

public class MethodThtreeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        String str="";
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            str+="1";
            System.out.println(str);
        }

    }

}

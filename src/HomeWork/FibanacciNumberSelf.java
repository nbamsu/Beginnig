package HomeWork;

import java.util.Scanner;

public class FibanacciNumberSelf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you value");
        int num=input.nextInt();
        int preNum=0;
        int nextnum=1;
        int sum=0;
        for (int i=1;i<num;i++) {
            if (nextnum <=num) {

            System.out.println(preNum + " ");
            sum = preNum + nextnum;
            preNum=nextnum;
            nextnum=sum;
        }
        }
            System.out.println(preNum);

    }
}

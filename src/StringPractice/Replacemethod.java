package StringPractice;

import java.util.Scanner;

public class Replacemethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the date with following format: mm/dd/yyy");
        String date1=input.next();
        System.out.println("Please enter the date with following format: mm-dd-yyyy");
        String date2=input.next();
        date2=date2.replace('-','/');

        System.out.println("Two date is equals to ech other "+date1.equals(date2));
        //regex -->




    }
}

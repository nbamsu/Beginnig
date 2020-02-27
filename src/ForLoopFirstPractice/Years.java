package ForLoopFirstPractice;

import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=input.nextInt();

        for( int yearN=year;yearN<year+3;yearN++){
            System.out.println("This Year is :"+yearN);

            for(int month=1;month<=12;month++)
            {
                System.out.println(month +" Month");

            for(int day=1;day<=30;day++){
                System.out.print(day+",");
            }
                System.out.println();
            }


        }
    }
}

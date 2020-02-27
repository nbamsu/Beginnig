package StringPractice;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter gender, name and DOB with following structure :"+"Gender - yourFullName - DOOB");
        String info=input.nextLine();
        System.out.println("gender equals to M "+ info.startsWith("M"));
        System.out.println("String contais the name "+info.contains("Baha Nur"));
        System.out.println("Last four letter is "+ info.substring(info.length()-4) );
        System.out.println("DOB is correct or not? "+ info.endsWith("1995"));

        /*
        1 - Contains method
        2 - endsWith()
        3 - first using substring get the last 4 letters, then store them as a string then use equals method
         */






    }
    }


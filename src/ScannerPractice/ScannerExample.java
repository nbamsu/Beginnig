package ScannerPractice;
import java.util.Scanner;
public class ScannerExample {

    public static void main(String[] args) {
            // Alt+Enter   --> Windows
           // Option+Enter -->Mac
        Scanner input= new Scanner(System.in);


        System.out.println("What is your name");
        String name=input.next();

        System.out.println("Your name is "+name);

        System.out.println("What is your date of Birth");
     int dateOfBirth=input.nextInt();
     int currentYear=2019;
     int age=currentYear-dateOfBirth;
        System.out.println("Yuor age is "+age );

        System.out.println("Please enter your full name");
        String fullName=input.nextLine();
        String nameFull=input.nextLine();
        System.out.println("Your full name is "+fullName);


    }


}

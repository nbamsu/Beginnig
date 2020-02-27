package SwitchPractice;

import java.util.Scanner;

public class StudentNumber {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("What is your student number?");
            int studentN1=input.nextInt();
            //studentN1=123;
            switch (studentN1){
                case 123:
                    System.out.println("What is your last name");
                    String lastName=input.next();
                    if (lastName.equalsIgnoreCase("Turan")){
                        System.out.println("your last name is "+lastName);
                    }
                    break;
                case 223:
                    System.out.println("How old are you ?");
                    int  age= input.nextInt();
                    if (age==22){
                        System.out.println("Your age is not correct");
                    }
                    break;
                case 456:
                    System.out.println("Where do you live");
                    String place=input.next();
                    if (place.equalsIgnoreCase("sky")){
                        System.out.println("Great,I am living there as well");

                    }
                    break;
            }
        }
    }



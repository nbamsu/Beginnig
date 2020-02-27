package HomeWork;


import java.util.Scanner;

public class studentsgrade {
    public static void main(String [] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your grade for Java");
        int gradeInJava = input.nextInt();


        Scanner input1 = new Scanner(System.in);
        System.out.println("Soft Skills grade");
        int gradeInSoftskills = input1.nextInt();


        Scanner input2 = new Scanner(System.in);
        System.out.println("What is your Attendance");
        int attendance = input.nextInt();
        int averageGrade=(gradeInJava + gradeInSoftskills)/2;

        if (averageGrade >= 60 && attendance>= 80) {
            System.out.print("You are passed " + averageGrade + "and your attendance is " + attendance);
        }else if(averageGrade<=40 &&averageGrade<=60 && attendance<=90) {
            System.out.print("Passed " + averageGrade + "your attendance " + attendance);
        }else if(attendance>=90 && attendance ==100){
            System.out.println("Passed "+ attendance);
        }



    }
}
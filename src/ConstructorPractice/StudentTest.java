package ConstructorPractice;

public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student("Ismail",7);
        Student s2=new Student("Baha",8);
        Student s3=new Student("Ariet",9);
        Student s4=new Student ("Bermet",10);
     //   s1.schoolName="Tectorial";
       //Student.schoolName="Techtorial";
        System.out.println(s3.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s1.name);

    }
}

package ConstructorPractice;

public class Student {
    String name;
    int studentId;
    static String schoolName;
    static{
        schoolName="Techtorial";
    }
    {
        name="John";
        schoolName="techtorial2"; // instance method can accept static and non static variables
    }

    public Student(String name, int studentId){
        this.name=name;
        this.studentId=studentId;

    }
    public void study(){
        System.out.println(name+" is studying.");
    }
    public void study(int hours){
        System.out.println(name+" is studying for "+hours+" hours");
    }
    public void study(String name, int hours){
        System.out.println(name+" is studying for "+hours+" hours");
    }

}

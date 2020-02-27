package Abstraction3;

public class Programmer extends TeacherClass{

    public Programmer(String teacherName) {
        super(teacherName);
        System.out.println("Im constructor of programmer class");
    }
    static{
        System.out.println("Im static block of programmer Class");
    }
    {
        System.out.println("Im instance block of programmer class");
    }
    public static void main(String [] args){
        Programmer programmer=new Programmer("John");
        System.out.println("-------------");
        Programmer programmer1=new Programmer("Doe");
    }
}

package Abstraction3;

public class TeacherClass {
    final String TEACHERNAME;
    static{
        System.out.println("Im static block of teacher class");
    }
    {
        System.out.println("Im  instance block of Teacher  class");
    }
    public TeacherClass(String teacherName){
        this.TEACHERNAME=teacherName;
        System.out.println("Im constructor of Teacher class");
    }
}

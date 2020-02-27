package Abstraction;

public abstract class StudentClass {
    int studentId;
    String studentName;
    public void study(){
        System.out.println("Student is studying");
    }
    public abstract void attendClass();
    abstract Boolean isActive();
}

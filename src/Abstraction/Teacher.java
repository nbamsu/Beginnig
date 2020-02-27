package Abstraction;

public class Teacher extends OnlineStudent{
    public void attendClass(){
        System.out.println("teacher is teaching class");
    }
    public Boolean isActive(){
        return true;
    }

}

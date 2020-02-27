package Abstraction;

public class CampusStudent extends StudentClass{
    //Implement --> Override
    public void attendClass(){
        System.out.println("Campus student attending the class in real time");
    }
    public Boolean isActive(){
        return true;
    }
    public void study(){
        System.out.println("Student studying");
    }
}

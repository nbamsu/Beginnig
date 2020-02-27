package ConstructorPractice;

public class StaticBlockExample {
   //Static Block
    static{
        System.out.println("I am static block");
    }
    //Instance Block --> just opening curly braces

    {
        System.out.println("I am instance block");
    }
    public StaticBlockExample(){
        System.out.println("i am in constructor");
    }

    public static void main(String[] args) {
        StaticBlockExample sbEx=new StaticBlockExample();
        StaticBlockExample sbEx2=new StaticBlockExample();
        StaticBlockExample sbEx3=new StaticBlockExample();
    }
}

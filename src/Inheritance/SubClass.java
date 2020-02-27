package Inheritance;

public class SubClass extends SuperClass {
    public void subClassMethod(){
        myMethod();
        System.out.println(name);
        System.out.println(number);
    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.subClassMethod();
    }
}

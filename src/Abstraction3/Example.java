package Abstraction3;

public class Example {
    public static final String schoolName;
    //Final variables can not be reassigned. They are Constant
    //static block, instance block, Constructor
    static{
        schoolName="Techtorial";
    }
    {
        //  its instance block, we can assign school name by changing method name to non static,
    }
    {
//        public Example(){
//            schoolName="Techrotial";
    }

    public static void main(String[] args) {
      String newName=schoolName+2;
        System.out.println(newName);
    }
    }


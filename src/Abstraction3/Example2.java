package Abstraction3;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public final List<String> list;
    {
        list = new ArrayList<>();
        list.add("Java");
    }
    public Example2(){
        list.add("Selenium");
    }

    public static void main(String[] args) {
        Example2 example2=new Example2();
        example2.list.add("Cucumber Testing tool");
    }
    public final void myMethod(){
        System.out.println("Im inside of my Method");
    }
    public final void myMethod(String name){
        System.out.println("Im Overloading my Method");
    }
}

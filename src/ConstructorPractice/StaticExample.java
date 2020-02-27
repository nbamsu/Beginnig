package ConstructorPractice;

public class StaticExample {
    int num1;
    static int num2;

    public static void main(String[] args) {
        StaticExample ex1=new StaticExample();
        StaticExample ex2=new StaticExample();

        ex1.num1=20;
        num2=ex1.num1*5;// num2 = 100
        ex1.num1=ex2.num2*2;// ex1.num1 = 200
        ex1.num1=ex2.num1*2;// ex2.num2 =100, ex1.num1 = 200

        System.out.println(ex1.num1);// ex2.num1 =5, ex1.num1 =10
        System.out.println(num2);
    }

}

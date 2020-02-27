package ConstructorPractice;

public class CalculaterTest {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(4,5));
        System.out.println(Calculator.multiple(2,10));

        //Write the method in Calculater class that will accept three parameters
        //(int num1,int num2,String operator) and it will return int as result
        System.out.println(Calculator.calc(3,8,"*"));
        System.out.println(Calculator.calc(3,5,"!"));
    }
}

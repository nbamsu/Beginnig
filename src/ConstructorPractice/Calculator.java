package ConstructorPractice;

public class Calculator {
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    public static int subtract(int num1, int num2){
        return num1-num2;

    }
    public static int multiple(int num1, int num2){
        return num1*num2;
    }
    public static int division(int num1, int num2){
        return num1/num2;
    }
    public static int calc(int num1,int num2,String operator){
        if(operator == "+"){
        return sum(num1,num2);
        }else if(operator == "-"){
             return subtract(num1,num2);
        }else if (operator == "*"){
            return multiple(num1,num2);
        }else if(operator == "/"){
            return division(num1,num2);
        }else{
            System.out.println("invalid operator");
            return 0;
        }

    }
}

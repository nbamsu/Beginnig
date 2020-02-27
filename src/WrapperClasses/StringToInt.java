package WrapperClasses;

public class StringToInt {
    public static void main(String[] args) {
        String num1="22";
        String num2="2";
        String num3="321";

        String combined=num1+num2+num3;
        int result=Integer.valueOf(combined);//Integer --> int UNBOXING
        System.out.println(result);
    }
}

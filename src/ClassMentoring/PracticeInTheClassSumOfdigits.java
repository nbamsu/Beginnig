package ClassMentoring;

public class PracticeInTheClassSumOfdigits {
    public static void sumOfDigits(int number) {
        int sum = 0;
        int temp = number;
        int digit;
        while (number > 0) {
            digit = number % 10;  //sum +=num%10;
            sum = sum + digit;
            number = number / 10;

        }
        System.out.println("the sum of digits " + temp + " is " + sum);
    }

    {
        System.out.println("This is instance block");
    }
    static{
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        PracticeInTheClassSumOfdigits pr=new PracticeInTheClassSumOfdigits();
        pr.sumOfDigits(999);
    }

}

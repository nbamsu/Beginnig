package WhileLOOP;

public class WhileNumbers {
    public static void main(String[] args) {
        int number = 123;
       // do same process until your number is equals to =
        // find the sum of digits and print the sum one time
         int sum=0;
        while (number > 0) {

            int digit = number % 10;
            System.out.println(digit);
            sum=sum+digit;
            number = number / 10;
        }
        System.out.println(sum);

        int age=22;
        int totallAge=30;
        while(age<totallAge){
                age++;
            System.out.println("Sam total ages "+age);
        }
    }
}
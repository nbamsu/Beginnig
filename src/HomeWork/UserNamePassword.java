package HomeWork;

import java.util.Scanner;

public class UserNamePassword {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        boolean expectedResult;
        boolean result;
        int count=0;

        do{ System.out.println("Enter your username ");
        String userName=input.next();
        System.out.println("Enter your password");
        String password=input.next();

        String actualUserName=userName;
        String actualPassword=password;
        String expectedUserName=actualUserName.trim().toUpperCase();
        String expectedPassword=actualPassword.trim().toUpperCase();
        expectedResult=expectedPassword.equals(expectedPassword)&&expectedUserName.equals(expectedUserName);
        result =actualUserName.equals(expectedUserName)&&actualPassword.equals(expectedPassword);
        count++;
            System.out.println(result);


    }
        while (expectedResult!=result&&count<3);
        if (expectedResult==result) {
            System.out.println("You are all set");
        }else if (count==3);
        System.out.println("Your account on hold now try fter 5 minutes");
        }
}

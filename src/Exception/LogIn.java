package Exception;

import java.util.Scanner;

public class LogIn {
    public static final String USERNAME;
    public static final String PASSWORD;
    static{
        USERNAME="Techtorial";
        PASSWORD="1234";
    }

    public static void myMethod() throws Exception{
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your UserName");
        String inputUserName=input.next();
        System.out.println("Enter your password");
        String inputPassword=input.next();
        LogIn login=new LogIn();
        if (!inputUserName.equalsIgnoreCase(login.USERNAME)){
            throw new Exception("User name is not matching:"+inputUserName);
        }
        if (!inputPassword.equals(login.PASSWORD)){
            throw  new Exception("Password is not matched:"+inputPassword);
        }
        System.out.println("Welcome to main page");

    }

    public static void main(String[] args) throws Exception {
        try {
            myMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }catch (Throwable t){
            System.out.println("Throwing Throwable or subclass exception");
        }finally {
            System.out.println("In finally block");
        }
        }
}

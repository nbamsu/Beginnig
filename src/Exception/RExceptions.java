package Exception;

import java.util.Scanner;

public class RExceptions {
    public static void main(String[] args) {
        String name="";
       try {
           int length = name.length();
           int division=length/0;
       }catch (NullPointerException exception){
           System.out.println("You can not get length of null String");
       }catch (Exception exception){
           System.out.println("This Arithmetic Exception");
       }catch (Throwable exception){
           System.out.println("It is throwing Throwable");
       }
       //System.out.println(name.length());
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name=input.next();
//        System.out.println("Number of characters "+name.length());
    }

}

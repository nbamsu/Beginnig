package ConstructorPractice;

public class Amazon {
    public static void navigate(String url){
        System.out.println("Navigating to "+url);
    }
    public static void logIn(String username,String password){
        System.out.println("logging in to amazon with username: "+username+" and password: "+password);
    }
    public static void search(String itemName){
        System.out.println("Searching for: "+itemName);
    }
}

package SingletonDesign;

public class SingletonObject {
    /*
    1 - We want to create only one object other user can not creae more than one object.
    2 - You need to creae one object private static and final.
    3 - You need to create constructor. This constructor needs to be private
    4 - Create one method it will return the instance object
     */
    private static final SingletonObject instance=new SingletonObject();
    private SingletonObject(){     //constructor
    }
    public static SingletonObject getInstance(){
        return instance;
    }
    public void displayMessage(){
        System.out.println("This is from the singleton class");
    }


}

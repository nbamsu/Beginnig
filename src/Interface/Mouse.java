package Interface;

public interface Mouse {
    String COLOR="White";
    void click();
    default void scroll(){
    System.out.println("Mouse scroll up/down");
}}

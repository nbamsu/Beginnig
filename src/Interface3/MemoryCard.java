package Interface3;

public interface MemoryCard {
    int SIZE=128;
    String NAME="Sony";
    Object storeFiles();
    default void regularMethod(){
        System.out.println("This method coming from MemoryCard interface");

    }
    static void staticMethod(){
        System.out.println("This is static method from MemoryCard interface");
    }

}

package SingletonDesign;

public class SingltonTest {
    public static void main(String[] args) {
        SingletonObject object=SingletonObject.getInstance();
        object.displayMessage();
    }
}

package Interface;

public class User extends Computer {

    @Override
    public boolean onSale() {
        return false;
    }

    @Override
    public void type() {

    }

    @Override
    public int batteryLife() {
        return 0;
    }

    @Override
    public void click() {
        System.out.println("Keyboard typing");
    }

    @Override
    public void display() {
        System.out.println("Display resolution of screen");
    }

    public static void main(String[] args) {
        User user=new User();
        System.out.println(user.batteryLife());
        System.out.println(user.MEMORY);
    }
}

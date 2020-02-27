package Abstraction3;

public class CheckBox extends WebApplication{

    @Override
    public void click() {
        System.out.println("Clicking on check box");
    }

    @Override
    public void sendText() {
        System.out.println("Can not type on checkBox");
    }

    @Override
    public void dragAndDrop() {
        System.out.println("Can not drag and drop on checkbox");
    }
}

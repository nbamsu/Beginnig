package Interface;

public interface Keyboard extends Mouse,Screen{
    int BUTTONS=101;//BY DEFAULT ITS STATIC AND FINAL
    boolean ISBLUETOOTH=true;
    void type();  // public abstract void type(); by default its abstract
    int batteryLife ();
}

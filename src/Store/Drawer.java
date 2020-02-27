package Store;

public class Drawer extends Furniture {
    int quantity;
    public Drawer(String name, int price,int quantity) {
        super(name, price,quantity);
        super.quantity=quantity;
    }
    public void details(){
        System.out.println("very good brand "+name+ "\nPrice "+price+ "\nQuantity "+quantity);
    }
}

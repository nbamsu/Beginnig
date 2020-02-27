package Store;

public class Furniture {
    String name;
    int price;
    int quantity;
    public Furniture(String name,int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }
    public void details(){
        System.out.println("very good brand "+name+ "\nPrice "+price+ "\nQuantity "+quantity);
    }
}

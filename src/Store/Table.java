package Store;

public class Table extends Furniture{
    int quantity;

    Table(String name, int price,int quantity) {
        super(name, price,quantity);
        super.quantity=quantity;
    }

    public void details(){
        System.out.println("very good brand "+name+ "\nPrice "+price+ "\nQuantity "+quantity);
    }

}

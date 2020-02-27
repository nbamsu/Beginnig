package Store;

public class Sofa extends Furniture{

       // int quantity;
    public Sofa(String name, int price,int quantity) {
        super(name, price,quantity);
        super.quantity=quantity;
    }
    public  void details(){
        System.out.println("very good brand "+name+ "\nPrice "+price+ "\nQuantity "+quantity);
    }

    public static void main(String[] args) {
//        Furniture furniture=new Furniture("furniture",10);
//
//        Furniture furniture1=new Table(White Table",50,2);
//
//        Furniture furniture2=new Drawer("Small table",100,1);
//
 //       Furniture furniture3=new Sofa("Grey Sofa",150,5);

        Furniture[]furnitures=new Furniture[3];
        furnitures[0]=new Table("White Table",50,2);
        furnitures[1]=new Drawer("Small Drawer",100,1);
        furnitures[2]=new Sofa("Grey Sofa",150,5);
        int sum=0;
        for(Furniture fr:furnitures){
            fr.details();
            sum+=fr.price*fr.quantity;
        }
        System.out.println(sum);
    }
    }


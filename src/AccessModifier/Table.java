package AccessModifier;

public class Table {
    private String brand;
    private String color;
    private String material;
    private String kind;
    private double price;
    private boolean isAvailable;

   public Table(String brand,String color,String material){
       this.brand=brand;
       this.color=color;
       this.material=material;
   }
   public String getBrand(){
      return brand;
   }
   public String getColor(){
       return color;
   }
   public String getMaterial(){
       return material;
   }
   public String getKind(){
       return kind;
   }
   public double getPrice(){
       return price;
   }
   public boolean getIsAvailable(){
       return isAvailable;
   }

// modify the set price method, if the price is less than 100 do not set the price
    // if the price is more than or equals to 100, set the price
   public void setPrice(double price){

       if(price>=100){
           this.price=price;
       }else{
           System.out.println("Please enter more than 100");

       }

   }
   public void setKind(String kind){
       this.kind=kind;
   }
   public void setIsAvailable(boolean isAvailable) {
       this.isAvailable = isAvailable;
   }


}

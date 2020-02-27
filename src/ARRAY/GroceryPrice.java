package ARRAY;

public class GroceryPrice {
    public static void main(String[] args) {
        String [][] products={{"Watermelon","Apple","Banana"},{"Beans","Lettuce","Cabbage","Onion","Potato","Cucumber"},
                {"Orange juice","Pepsi","Water","Lemonade"}};
        int [][] productQuantity={{10,100,150},{200, 100,100,50,20,10},{45,80,230,49}};
        double [][] price={{1.99,1.49,0.48},{1, 0.99,2.99,1.99,0.69,1},{3.99,1,4,5}};

        for (int i=0;i<products.length;i++){
            for (int k=0;k<products[i].length;k++){

                System.out.println(productQuantity[i][k]+" This is product name :"+products[i][k]+" This is the price $"+price[i][k]);
            }
        }

    }
}

package ARRAY;

import java.util.Arrays;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        String [][] grocery={{"Watermelon","Apple","Banana"},{"Beans","Lettuce","Cabbage","Onion","Potato","Cucunber"},
                {"Orange juce","Pepsi","Water","Lemonade"}};


        for (int i=0;i<grocery.length;i++){
            //System.out.println(Arrays.toString(grocery[i]));// out put only Array version [...]
            for (int k=0;k<grocery[i].length;k++){
                System.out.println("Product name is :"+grocery[i][k]);
            }


        }
        String [][] grocery2={{"Watermelon","Apple","Banana"},{"Beans","Lettuce","Cabbage","Onion","Potato","Cucunber"},
                {"Orange juce","Pepsi","Water","Lemonade"}};
        for (String [] product:grocery2){
            for (String str:product){
                System.out.println(str);
            }
        }


    }
}

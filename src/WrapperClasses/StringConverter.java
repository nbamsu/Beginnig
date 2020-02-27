package WrapperClasses;

import java.util.Arrays;

public class StringConverter {

    static String[] prices = {"$25", "$66", "$5", "$89", "$21"};
    //convert this Array of String to Array of int, without "$" sign!!!
    public static int[] priceConverter(String [] prices){
        int[] result=new int[prices.length];
        for (int i=0;i<prices.length;i++){
            prices[i]=prices[i].substring(1);
            result[i]=Integer.valueOf(prices[i]);// it will convert to Integer Wrapper class,Integer --> int --> Unboxing
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(priceConverter(prices)));
    }
}

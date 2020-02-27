package ArrayListPractice;

import java.util.Arrays;
import java.util.List;

public class drinkPrices {
    public static void main(String[] args) {
        List<String> drinks= Arrays.asList("Coffee $2.20","Cappuccino $4.5","Latte $3.4","Hot Chocolate $4.1","Black Tea $3.0");
        for (int i=0;i<drinks.size();i++){
            int indexOf$=drinks.get(i).indexOf('$');//get the $ sign index
            String pricestr=drinks.get(i).substring(indexOf$+1);// start printing starting from   $ SIGN
            double price=Double.parseDouble(pricestr);// convert to primitive data type
            double newPrice=price*1.1;// multiply to 10%
            String newValue=drinks.get(i).substring(0,indexOf$+1)+newPrice; // replace old price with new price
            drinks.set(i,newValue);
        }
        System.out.println(drinks);
    }
}

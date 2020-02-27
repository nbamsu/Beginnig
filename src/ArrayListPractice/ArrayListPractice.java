package ArrayListPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        //List<String> list=new Array<>(); it is Polymorphism
        List<String> items= Arrays.asList("2","5","1","9");
        List<String> prices= Arrays.asList("$22.5","$41.2","$8.9","$2.4");
        double totalExpens=0;
        for (int i=0;i<items.size();i++){
            int itemAmount=Integer.parseInt(items.get(i));
            String price=prices.get(i).substring(1);
            double itemPrice=Double.parseDouble(price);
            totalExpens+=itemAmount*itemPrice;

        }
        System.out.println(totalExpens);
//        Integer items2=Integer.valueOf(items.size());
//        int items2prm=items2;
//        int [] result=new int[prices.size()];


    }
}

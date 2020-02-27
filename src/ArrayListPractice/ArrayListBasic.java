package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList bankCards=new ArrayList();
        bankCards.add("Visa");
        System.out.println(bankCards.get(0));
        System.out.println(bankCards.size());
        bankCards.add("MasterCard");
        System.out.println(bankCards.size());
        bankCards.add("Amex");
        bankCards.add("Chase");
        System.out.println(bankCards.get(3));
        bankCards.add(3,"Discovery");
        System.out.println(bankCards.get(3));
        System.out.println(bankCards);
        bankCards.set(3,"BoA");
        bankCards.remove(4);
        System.out.println(bankCards);
        System.out.println(bankCards);
        bankCards.add(100);
        bankCards.add(true);
        System.out.println(bankCards);
        System.out.println("===============");
        for (int i=0;i<bankCards.size();i++){
            System.out.println(bankCards.get(i));
            System.out.println("================");
            for (Object card: bankCards){
                System.out.println(card);
            }
            String sentence ="i love Java";
            String [] word = sentence.split(" ");
        }
    }
}

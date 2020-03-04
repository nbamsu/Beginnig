package CollectionClass;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    /*
    Create new MAp
    Create a method it will take one parameter and return map

     */

    public static Map<Character,Integer> CountLetters(String letter){
        char[] charArray=letter.toCharArray();
        Map<Character,Integer> count=new HashMap();
        for (char c:charArray){
            if (count.containsKey(c)){
                int num=count.get(c);
                count.put(c,++num);
            }else{
                count.put(c,1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountLetters("Muammer"));
    }
}

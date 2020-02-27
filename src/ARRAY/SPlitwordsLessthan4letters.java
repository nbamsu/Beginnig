package ARRAY;

import java.util.Arrays;

public class SPlitwordsLessthan4letters {
    public static void main(String[]args){
    String splitMethod="The method split() splits a String into multiple Strings" +
            " given the delimiter that separates them. The returned object is an " +
            "array which contains the split Strings. We can also pass a limit to t" +
            "he number of elements in the returned array";
    String [] text=splitMethod.split(" ");

    for (String word:text){
        if (word.length()<4){
            System.out.print(word);
        }
    }
    String jv="Array.is.today's.topic";
    String [] arr=jv.split("\\.");
        System.out.println(Arrays.toString(arr));
}
}

package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        List<String> words= new ArrayList();
        words.add("Java");
        words.add("Love");
        words.add("Me");
        words.add("I");
        words.add("Love");
        words.add("You");
        words.add("Too");
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);
        words.remove("Me");
        System.out.println(words);
        System.out.println(words.contains("Java"));
        words.set(2,"Me");
        System.out.println(words);
        words.add(2,"I");
        System.out.println(words);
//Converting ArrayList (List) to an Array using words.toArray();
        Object[] wordsInArray = words.toArray();
        System.out.println(wordsInArray[3]);
        // Converting Array to ArrayList using Arrays.asList(Array) method.
        List<Object> list = Arrays.asList(wordsInArray);
        System.out.println("+++++++++++++++++++++++++++++++");

        List<Integer> numbers=new ArrayList();
        numbers.add(5);
        numbers.add(7);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(14);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);



    }
}

package CollectionClass;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> names=new HashSet();
        names.add("Techtorial");
        names.add("School");
        names.add("Academy");
        names.add("2020");
        System.out.println(names);
        Set<String> values=new HashSet<>();
        values.addAll(names);
        System.out.println(values);
        Iterator<String> it=values.iterator();
        System.out.println(it+" iterator");
        //hasNext--> it will check iterator for next value or not
        // next--> it will iterate over next value.
        //return type is boolean
        while (it.hasNext()){
            if (it.next().startsWith("T"))
            System.out.println("it coming from iterator after method hasNext "+it.next());
        }
        for (String nm:names) {
            if (nm.startsWith("T"))
                System.out.println(nm);
        }

        Set<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        System.out.println(numbers);
        //all the methods for HashSet is available for LinkedHashSet
        numbers.remove(10);
        System.out.println(numbers);

        Set<String> computers=new TreeSet<>();
        computers.add("Thinkpad");
        computers.add("Asus");
        computers.add("Acer");
        computers.add("HP");
        System.out.println(computers);
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(0);
        treeSet.add(87);
        System.out.println(treeSet);
        //System.out.println(treeSet.descendingIterator());
        Iterator<Integer> iteratorNumber=treeSet.descendingIterator();
        while (iteratorNumber.hasNext()){
            System.out.println(iteratorNumber.next());
        }

    }

}

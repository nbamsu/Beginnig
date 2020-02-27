package SetCollaction;

import java.util.*;

public class SetCollectionPractice {
    public static void main(String[] args) {
        Set<String> list=new HashSet<>();
        HashSet<String> list1=new HashSet<>();
        Set<Integer> list2=new HashSet();
        list2.add(10);
        //add method first will check given value is present in your Set or not.If it already there it will store the value.
        list2.add(10);
        list2.add(20);
        //If you try to add existing value it will compile but it will not add.
        //addAll method
        List arrList=new ArrayList();
        arrList.add(20);
        arrList.add(30);

        System.out.println(list2);
        list2.addAll(arrList);
        System.out.println(list2);
        System.out.println(arrList);
        Iterator<Integer> i=list2.iterator();
        while (i.hasNext()){
            if (i.next()==10){
            System.out.println(i.next());
            //to be able to get value from Set use only ForEach Loop.
                for (Integer lis:list2){
                    if (lis==10){
                        System.out.println(lis);
                    }
                }
                System.out.println(list2.contains(20));
                System.out.println(list2.contains(40));
                System.out.println(list2.remove(30));
                //in your set, if it's not exist it will not remove anything. If it's exist it does.
                System.out.println(list2);
                System.out.println(list2.size());
                list2.clear();
                System.out.println(list2);
                System.out.println(list2.isEmpty());
        }
        }
    }
}

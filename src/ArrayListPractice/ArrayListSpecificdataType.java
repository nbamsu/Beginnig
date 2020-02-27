package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListSpecificdataType {
    public static void main(String[] args) {
        ArrayList<String> programL = new ArrayList();
        programL.add("Java");
        programL.add("c#");
        programL.add("Python");
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(55);
        numbers.add(64);
        numbers.add(24);
        numbers.add(11);
        numbers.add(84);
        numbers.add(7);
        numbers.add(16);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));

                for (Integer number : numbers) {
                    if (number % 2 == 0) {
                        System.out.println(number);

                    }
                }

        }

    }
        ArrayList<String> shoppingList=new ArrayList();
        shoppingList.add("Milk");
        shoppingList.add("Cereal");
        shoppingList.add("Carrot");
        shoppingList.add("Coffee");
        shoppingList.add("Sugar");
        shoppingList.add("Bread");
        shoppingList.set(4,"Yogurt");
        System.out.println(shoppingList);
        shoppingList.set(shoppingList.indexOf("Coffee"),"Tea");
        System.out.println(shoppingList);
        System.out.println(shoppingList.contains("Bread"));
        shoppingList.remove("Milk");
        System.out.println(shoppingList);

        System.out.println(shoppingList.isEmpty());
        if (shoppingList.isEmpty()){
            System.out.println("Done");
        }else{
            System.out.println("Keep shopping");
        }
        shoppingList.clear();
        System.out.println("Nothing left inside "+shoppingList);
    }
}
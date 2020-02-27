package ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparingArrayList {
    public static void main(String[] args) {
        ArrayList<String> bookShelf=new ArrayList();
        ArrayList<String> booksShelf2=new ArrayList();

        bookShelf.add("Agile OCA Book");
        bookShelf.add("Java OCA Book");
        bookShelf.add("Mind Hacking");
        bookShelf.add("War and Peace");

        booksShelf2.add("Agile OCA Book");
        booksShelf2.add("Java OCA Book");
        booksShelf2.add("Mind Hacking");
        booksShelf2.add("War and Peace");

        if (bookShelf.equals(booksShelf2)){
            System.out.println("Book are same");
        }else{
            System.out.println("Different Books");
        }
        booksShelf2.set(booksShelf2.indexOf("War and Peace"),"Selenium Book");

        if (bookShelf.equals(booksShelf2)){
            System.out.println("Book are same");
        } else{
            System.out.println("Different Books");
            System.out.println("++++++++++++++++++");
        }

        List<String> studentNames=new ArrayList();
        String[] names={"Kate","Nicole","Mike","Patel","Kushal","Arpan"};
        studentNames=Arrays.asList(names);
        System.out.println(studentNames.get(1));
        List<String> studentNames2=Arrays.asList(new String[]{"Patel","Arpan"});
        }
    }


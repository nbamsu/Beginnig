package ArrayListPractice;

import ConstructorPractice.BookStore;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    public static void main(String[] args) {
        List<Computer> computer=new ArrayList();
        Computer computer1=new Computer("MacBook",2018,2000);
        Computer computer2=new Computer("Lenova",2017,1200);
        Computer computer3=new Computer("Dell",2019,1600);
        Computer computer4=new Computer("HP",2015,1000);
        Computer computer5=new Computer("Asus",2019,1400);
        Computer computer6=new Computer("MacBook",2014, 1000);

        computer.add(computer1);
        computer.add(computer2);
        computer.add(computer3);
        computer.add(computer4);
        computer.add(computer5);
        computer.add(computer6);

        System.out.println(computer1.year);
        System.out.println(computer.get(0).brand);
        System.out.println(computer.get(0).year);
        System.out.println("============================");
        for (int i=0;i<computer.size();i++){
            System.out.println(computer.get(i).brand);

        }
        for(Computer price2: computer){
            System.out.println(price2.price);
        }
        computer.get(0).price=computer.get(0).price-100;
        System.out.println(computer.get(0).price);
        System.out.println("=============================");
        for (int k=0;k<computer.size();k++){
            computer.get(k).price=computer.get(k).price-100;
            System.out.println(computer.get(k).price);
        }
//        for (Computer computers:computer){
//            computers.price=computers.price-100;
//            System.out.println(computers.price);
//        }

        for (int i=0;i<computer.size();i++){
            if (computer.get(i).price<=1000){
                System.out.println(computer.get(i).brand);

            }
        }
        List<BookStore> listOfBooks=new ArrayList();
        listOfBooks.add(new BookStore("Java OCA",120));
        listOfBooks.add(new BookStore("Cucumber Automation",55));

        for (BookStore bookStore:listOfBooks){
            System.out.println(bookStore.titleOfBook);
        }




    }
}

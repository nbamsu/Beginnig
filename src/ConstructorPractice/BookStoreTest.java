package ConstructorPractice;

public class BookStoreTest {
    public static void main(String[] args) {
        BookStore bookstore1=new BookStore("War and Peace","Leo Tolstoy",20 );
        bookstore1.getDetails();
        BookStore bookStore2=new BookStore("Java  OCA book",50);
        bookStore2.getDetails();
        BookStore bookStore3=new BookStore("Selenium",55);
        bookStore3.getDetails();

        System.out.println(BookStore.count);

    }
}

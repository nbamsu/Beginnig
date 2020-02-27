package ConstructorPractice;

public class BookStore {
    public String titleOfBook;
    String author;
    public int price;
    static int count;
    public BookStore(String titleOfBook,int price){
        this.titleOfBook=titleOfBook;
        this.price=price;
        count++;
    }
    public BookStore(String titleOfBook,String author,int price){
        this.titleOfBook=titleOfBook;
        this.author=author;
        this.price=price;
        count++;
    }
    public void getDetails(){
        System.out.println(titleOfBook+ ", "+author+" , $"+price);
    }
}

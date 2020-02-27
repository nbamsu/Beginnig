package Polymorphism3;

public class BankAccount {
    String name;
    int balance;
    public BankAccount(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    public void details(){
        System.out.println("Name: "+name+ "\n Bakance: "+balance);
    }
}

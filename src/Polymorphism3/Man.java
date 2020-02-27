package Polymorphism3;

public class Man extends Human implements Dad, Programmer {
    @Override
    public void feed() {
        System.out.println("da is feeding the birds");
    }

    @Override
    public void eat() {
        System.out.println("Man also can it from bird's plate");
    }

    @Override
    public void walk() {
        System.out.println("But bird can not fly as man");
    }

    @Override
    public void code() {
        System.out.println("Man can write the code for bird, and bird can walk");
    }

    public static void main(String[] args) {
        Dad dad=new Man();
        dad.feed();
    }
}

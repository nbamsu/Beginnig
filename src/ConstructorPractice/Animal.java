package ConstructorPractice;

public class Animal {
    String name;
    String location;
    public Animal(String name, String location){
        this.name=name;
        this.location=location;

    }
    public static void main(String[] args) {
        Animal animal=new Animal("Pars","USA");
        // every time when we ctreate the object constructor will be called.
        System.out.println(animal.name);
        System.out.println(animal.location);
   // animal.name="Pars";
    //animal.location="USA";

    }
}

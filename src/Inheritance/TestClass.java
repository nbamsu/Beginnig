package Inheritance;

public class TestClass {
    public static void main(String[] args) {
        DomesticAnimals dAnimal=new DomesticAnimals();
        System.out.println(dAnimal.friendly());
        dAnimal.sleep();
        dAnimal.run();

        Animal animal=new Animal();
        Lion lion=new Lion();
        lion.run();
        lion.hunt();
        lion.sleep();

        WildAnimals wildAnimal= new WildAnimals();
        wildAnimal.hunt();

    }
}

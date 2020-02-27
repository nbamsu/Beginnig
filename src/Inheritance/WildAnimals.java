package Inheritance;

public class WildAnimals extends Animal{
    @Override
    public void sleep(){
        System.out.println("Wild anomals do not sleep");
    }
    @Override
    public void eat(){
        System.out.println("Wild animals eat meat");
    }
    public void hunt(){
        System.out.println("Wild animals are hunting");
    }
}

package Abstraction2;

public class MyAppClass {
    public static void main(String[] args) {
        Circle circle=new Circle("Circle",5);
        System.out.println(circle.getArea());
        Square square=new Square("Square",4,4);
        System.out.println(square.getArea());

        Triangle triagle= new Triangle("Triangle",4,2);
        System.out.println(triagle.getArea());
        circle.draw();
        triagle.draw();
    }
}

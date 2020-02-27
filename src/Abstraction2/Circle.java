package Abstraction2;

public class Circle extends Shapes{
    int radius;

    public Circle(String name,int radius) {
        super(name);
        this.radius=radius;
    }

    @Override
    public Number getArea() {
        return radius*radius*3.14/2;
    }

    @Override
    void draw() {
        System.out.println("drawing "+super.name);
    }
}

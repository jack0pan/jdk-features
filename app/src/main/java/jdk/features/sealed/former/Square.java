package jdk.features.sealed.former;

public class Square extends Shape {
    public final double side;

    public Square(String id, double side) {
        super(id);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
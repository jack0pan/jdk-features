package jdk.features.sealed.modern;

public final class Circle extends Shape {
    public final double radius;

    public Circle(String id, double radius) {
        super(id);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

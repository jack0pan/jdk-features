package jdk.features.record.improved;

public record Circle(double radius) implements Shape {
    public Circle {
        if (radius < 0) {
            throw new IllegalArgumentException(
                    "The radius of a circle can not be negative [" + radius + "]");
        }
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

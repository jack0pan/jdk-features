package jdk.features.sealed.propagate;

public abstract sealed class Shape permits Shape.Circle,Shape.Square {
    public final String id;

    public Shape(String id) {
        this.id = id;
    }

    public abstract double area();

    public static non-sealed class Circle extends Shape {
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

    public static sealed class Square extends Shape {
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

    public static class ColorCircle extends Circle {
        public final String color;

        public ColorCircle(String id, double side, String color) {
            super(id, side);
            this.color = color;
        }
    }

    public static final class ColorSquare extends Square {
        public final String color;

        public ColorSquare(String id, double side, String color) {
            super(id, side);
            this.color = color;
        }
    }
}

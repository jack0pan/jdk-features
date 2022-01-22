package jdk.features.sealed.former;

public abstract class Shape {
    public final String id;

    public Shape(String id) {
        this.id = id;
    }

    public abstract double area();
}

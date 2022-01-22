package jdk.features.sealed.modern;

public abstract sealed class Shape permits Circle,Square,Rectangle {
    public final String id;

    public Shape(String id) {
        this.id = id;
    }

    public abstract double area();
}

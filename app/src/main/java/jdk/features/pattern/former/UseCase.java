package jdk.features.pattern.former;

import jdk.features.sealed.modern.Rectangle;
import jdk.features.sealed.modern.Shape;
import jdk.features.sealed.modern.Square;

public class UseCase {

    public static boolean isSquare(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return rect.length == rect.width;
        }
        return (shape instanceof Square);
    }
}

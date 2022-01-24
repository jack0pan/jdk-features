package jdk.features.pattern.modern;

import jdk.features.sealed.modern.Rectangle;
import jdk.features.sealed.modern.Shape;
import jdk.features.sealed.modern.Square;

public class UseCase {

    public static boolean isSquare(Shape shape) {
        if (shape instanceof Rectangle rect) {
            return rect.length == rect.width;
        }
        return (shape instanceof Square);
    }
}

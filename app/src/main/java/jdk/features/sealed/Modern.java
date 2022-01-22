package jdk.features.sealed;

import jdk.features.sealed.modern.*;

public class Modern {

    static boolean isCircle(Shape shape) {
        return (shape instanceof Circle);
    }

    static boolean isSquare(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return (rect.length == rect.width);
        }

        return (shape instanceof Square);
    }
}

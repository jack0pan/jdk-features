package jdk.features.sealed;

import jdk.features.sealed.former.*;

public class Former {
    public static boolean isSquare(Shape shape) {
        return shape instanceof Square;
    }

    public static boolean isSquareImproved(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return (rect.length == rect.width);
        }

        return (shape instanceof Square);
    }
}

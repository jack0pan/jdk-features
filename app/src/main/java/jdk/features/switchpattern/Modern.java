package jdk.features.switchpattern;

import jdk.features.sealed.modern.*;

public class Modern {
    public  static boolean isSquare(Shape shape) {
        return switch (shape) {
            case null, Circle c -> false;
            case Square s -> true;
            case Rectangle rect -> rect.length == rect.width;
        };
    }
}

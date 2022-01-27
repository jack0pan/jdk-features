package jdk.features.switchpattern;

import jdk.features.sealed.modern.Rectangle;
import jdk.features.sealed.modern.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModernTest {
    @Test
    void isSquare() {
        assertTrue(Modern.isSquare(new Rectangle("rect", 10.0, 10.0)));
        assertTrue(Modern.isSquare(new Square("square", 10.0)));
    }
}

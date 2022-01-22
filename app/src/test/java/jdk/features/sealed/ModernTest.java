package jdk.features.sealed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import jdk.features.sealed.modern.*;

public class ModernTest {
    @Test
    void isCircle() {
        assertTrue(Modern.isCircle(new Circle("circle", 10.0)));
    }
    @Test
    void isSquare() {
        assertTrue(Modern.isSquare(new Rectangle("rect", 10.0, 10.0)));
        assertTrue(Modern.isSquare(new Square("square", 10.0)));
    }
}

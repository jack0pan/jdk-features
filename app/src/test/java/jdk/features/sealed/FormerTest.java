package jdk.features.sealed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import jdk.features.sealed.former.*;

public class FormerTest {
    @Test
    void isSquare() {
        Square square = new Square("square 1", 10.0);
        assertTrue(Former.isSquare(square));

        Rectangle rect = new Rectangle("rect 1", 10.0, 5.0);
        assertFalse(Former.isSquare(rect));

        rect = new Rectangle("rect 2", 10.0, 10.0);
        assertFalse(Former.isSquare(rect));
    }

    @Test
    void isSquareImproved() {
        Rectangle rect = new Rectangle("square", 10.0, 10.0);
        assertTrue(Former.isSquareImproved(rect));
    }
}

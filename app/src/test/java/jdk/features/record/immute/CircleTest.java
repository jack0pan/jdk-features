package jdk.features.record.immute;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void notEquals() {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);
        assertNotEquals(c1, c2);
    }
}

package jdk.features.record.modern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void equals() {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);
        assertEquals(c1, c2);
    }
}

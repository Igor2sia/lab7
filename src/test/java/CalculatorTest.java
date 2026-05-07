import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(14, new Calculator().add(2, 12));
        assertEquals(20, new Calculator().add(18, 2));
        assertEquals(30, new Calculator().add(18, 12));
    }

    @Test
    void dif() {
        assertEquals(18, new Calculator().dif(20, 2));
        assertEquals(28, new Calculator().dif(40, 12));
        assertEquals(38, new Calculator().dif(50, 12));
    }

    @Test
    void div() {
        assertEquals(30, new Calculator().div(60, 2));
        assertEquals(40, new Calculator().div(80, 2));
        assertEquals(10, new Calculator().div(60, 6));

    }

    @Test
    void times() {
        assertEquals(60, new Calculator().times(10, 6));
        assertEquals(30, new Calculator().times(15, 2));
        assertEquals(40, new Calculator().times(20, 2));
    }

    @Test
    void solver() {
        assertEquals(98, new Calculator().solver());
    }
}
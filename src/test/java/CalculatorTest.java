import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(20, calculator.add(10,10));
    }

    @Test
    void dif() {
        assertEquals(90, calculator.dif(100, 10));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(100,10));
    }

    @Test
    void times() {
        assertEquals(25, calculator.times(5,5));
    }

    @Test
    void solver() {
        assertEquals(91, calculator.add(calculator.dif(100, 10), calculator.div(100, calculator.times(10,10))));
    }
}
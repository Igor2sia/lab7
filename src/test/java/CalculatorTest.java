
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(8, calc.add(3, 5));
        assertEquals(0, calc.add(-2, 2));
        assertEquals(-10, calc.add(-5, -5));

    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-4, calc.dif(2, 6));
        assertEquals(0, calc.dif(7, 7));
    }


    @Test
    void div() {
        assertEquals(10, calc.div(100,10));
    }

    @Test
    void times() {

        assertEquals(25, calc.times(5,5));
    }

    @Test
    void solver() {
        assertEquals(91, calc.add(calc.dif(100, 10), calc.div(100, calc.times(10,10))));
    }
}

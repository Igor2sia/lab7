
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator calc = new Calculator();

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.add(3, 5));
        assertEquals(0, calc.add(-2, 2));
        assertEquals(-10, calc.add(-5, -5));

    }

    @Test
    void dif() {

        Calculator calc = new Calculator();
        assertEquals(2, calc.dif(5, 3));
        assertEquals(-4, calc.dif(2, 6));
        assertEquals(0, calc.dif(7, 7));
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
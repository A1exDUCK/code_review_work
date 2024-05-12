import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void dif() {
        assertEquals(4, Calculator.dif(6, 2));
    }

    @Test
    void div() {
        assertEquals(1, Calculator.div(8, 0));
    }

    @Test
    void times() {
        assertEquals(4, Calculator.times(-2, -2));
    }

    @Test
    void solver() {
        assertEquals(4,Calculator.solver(4, 4));
    }
}
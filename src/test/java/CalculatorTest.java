import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    void dif() {
        assertEquals(4, Calculator.dif(6, 2));    }

    @Test
    void div() {
        assertEquals(5, Calculator.div(10, 2));    }

    @Test
    void times() {
assertEquals(20, Calculator.times(10, 2));    }

    @Test
    void solver() {
        assertEquals(6, Calculator.solver(10, 2));    }
    }
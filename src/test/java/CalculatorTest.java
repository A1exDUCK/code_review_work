import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    Calculator Calculator = new Calculator();

    @Test
    void additional_add() {
        assertEquals(10, Calculator.add(5, 5));
    }

    @Test
    void additional_subtract() {
        assertEquals(2, Calculator.dif(8, 6));
    }

    @Test
    void additional_division() {
        assertEquals(0, Calculator.div(16, 0));
    }

    @Test
    void additional_multiplication() {
        assertEquals(3, Calculator.times(-3, -1));
    }
    @Test
    void additional_solver() {
        assertEquals(4, Calculator.solver(10, 2));

    }
}
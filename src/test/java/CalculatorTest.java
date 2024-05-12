import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    Calculator Calculator = new Calculator();

    @Test
    void additional_addnamek1305() {
        assertEquals(10, Calculator.addnamek1305(5, 5));
    }

    @Test
    void additional_subtractnamek1305() {
        assertEquals(2, Calculator.difnamek1305(8, 6));
    }

    @Test
    void additional_divisionnamek1305() {
        assertEquals(0, Calculator.divnamek1305(16, 0));
    }

    @Test
    void additional_multiplicationnamek1305() {
        assertEquals(3, Calculator.timesnamek1305(-3, -1));
    }
    @Test
    void additional_solvernamek1305() {
        assertEquals(4, Calculator.solvernamek1305(10, 2));

    }
}
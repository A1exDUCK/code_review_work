import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {
    Calculator Calculator = new Calculator();

    @Test
    void addAD() {
        assertEquals(4, Calculator.addAD(2, 2));}
    @Test
    void addSH() {
        assertEquals(4, Calculator.addSH(2, 2));}
    @Test
    void additional_addnamek1305() {
        assertEquals(10, Calculator.addnamek1305(5, 5));}


    @Test
    void difAD() {
        assertEquals(4, Calculator.difAD(6, 2));}
    @Test
    void difSH() {
        assertEquals(4, Calculator.difSH(6, 2));}
    @Test
    void additional_subtractnamek1305() {
        assertEquals(2, Calculator.difnamek1305(8, 6));}


    @Test
    void divAD() {
        assertEquals(5, Calculator.divAD(10, 2));}
    @Test
    void divSH() {
        assertEquals(1, Calculator.divSH(8, 0));}
    @Test
    void additional_divisionnamek1305() {
        assertEquals(0, Calculator.divnamek1305(16, 0));}


    @Test
    void timesAD() {
assertEquals(20, Calculator.timesAD(10, 2));}
    @Test
    void timesSH() {
        assertEquals(4, Calculator.timesSH(-2, -2));}
    @Test
    void additional_multiplicationnamek1305() {
        assertEquals(3, Calculator.timesnamek1305(-3, -1));
    }


    @Test
    void solverAD() {
        assertEquals(6, Calculator.solverAD(10, 2));}
    @Test
    void solverSH() {
        assertEquals(4,Calculator.solverSH(4, 4));}
    @Test
    void additional_solvernamek1305() {
        assertEquals(4, Calculator.solvernamek1305(10, 2));}
}
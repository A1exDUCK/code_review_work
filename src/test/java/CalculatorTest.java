import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addAD() {
        assertEquals(4, Calculator.addAD(2, 2));}
    @Test
    void addSH() {
        assertEquals(4, Calculator.addSH(2, 2));}

    @Test
    void difAD() {
        assertEquals(4, Calculator.difAD(6, 2));}
    @Test
    void difSH() {
        assertEquals(4, Calculator.difSH(6, 2));}

    @Test
    void divAD() {
        assertEquals(5, Calculator.divAD(10, 2));}
    @Test
    void divSH() {
        assertEquals(1, Calculator.divSH(8, 0));}

    @Test
    void timesAD() {
assertEquals(20, Calculator.timesAD(10, 2));}
    @Test
    void timesSH() {
        assertEquals(4, Calculator.timesSH(-2, -2));}

    @Test
    void solverAD() {
        assertEquals(6, Calculator.solverAD(10, 2));}
    @Test
    void solverSH() {
        assertEquals(4,Calculator.solverSH(4, 4));
    }
}
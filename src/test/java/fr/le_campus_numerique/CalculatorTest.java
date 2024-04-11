package fr.le_campus_numerique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void addTwoInt() {

        int result = calc.addTwoInt(5, 3);
        assertEquals(8, result);
    }

    @Test
    void subTwoInt() {

        int result = calc.subTwoInt(10, 4);
        assertEquals(6, result);
    }

    @Test
    void multi() {

        int result = calc.multi(5, 4);
        assertEquals(20, result);
    }

    @Test
    void divTwoInt() {

        float result = calc.divTwoInt(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testDivisionByZero() {

        assertThrows(ArithmeticException.class, () -> calc.divTwoInt(10, 0));
    }
}
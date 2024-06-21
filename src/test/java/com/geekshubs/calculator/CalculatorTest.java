package com.geekshubs.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(34, new Calculator(8, 26, 8 + 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new Calculator(12, 8, 12 - 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new Calculator(11, 8, 11 * 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new Calculator(12, 12, 12 / 12).getResult());
    }

    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> new Calculator(12, 0, 12 / 0).getResult());
    }
}

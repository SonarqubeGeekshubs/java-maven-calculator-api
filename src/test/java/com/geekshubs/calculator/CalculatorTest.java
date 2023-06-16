package com.geekshubs.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(34, new Calculator(8, 26, 8 + 26).getResult());
    }

    @Test
    public void testSubstract() {
        assertEquals(20, new Calculator(25, 5, 25 - 5).getResult());
    }

    @Test
    public void testMultiply() {
        assertEquals(10, new Calculator(2, 5, 2 * 5).getResult());
    }

    @Test
    public void testDivide() {
        assertEquals(50, new Calculator(100, 2, 100 / 2).getResult());
    }

    @Test
    public void testGetX() {
        assertEquals(5, new Calculator(5, 1, 1).getX());
    }

    @Test
    public void testGetY() {
        assertEquals(5, new Calculator(1, 5, 1).getY());
    }
}

package com.geekshubs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(34, new Calculator(8, 26, 8 + 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(10, new Calculator(14, 4, 14 - 4).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(12, new Calculator(3, 4, 3 * 4).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new Calculator(12, 12, 12 / 12).getResult());
    }

    @Test
    public void testGetX() {
        assertEquals(45, new Calculator(45, 12, 12 / 12).getX());
    }

    @Test
    public void testGetY() {
        assertEquals(12, new Calculator(12, 12, 12 / 12).getY());
    }
}

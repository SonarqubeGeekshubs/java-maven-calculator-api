package com.geekshubs.calculator.model;

import org.junit.jupiter.api.Test;

import com.geekshubs.calculator.model.Calculator;
import com.geekshubs.calculator.model.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(34, new Calculator(8, 26, Operation.ADD).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new Calculator(12, 8, Operation.SUB).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new Calculator(11, 8, Operation.MULT).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new Calculator(12, 12, Operation.DIV).getResult());
    }

    @Test
    public void testNone() {
        assertEquals(0, new Calculator(12, 12, Operation.NONE).getResult());
    }

}

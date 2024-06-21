package com.geekshubs.calculator.rest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAPITest {

    CalculatorAPI calculatorAPI = new CalculatorAPI();

    @Test
    public void testPing() {
        assertThat(calculatorAPI.ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

    @Test
    public void testAdd() {
        assertEquals(34, calculatorAPI.Add(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, calculatorAPI.Sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, calculatorAPI.Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, calculatorAPI.Div(12, 12).getResult());
    }
}

package com.geekshubs.calculator.rest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAPITest {

    @Test
    public void testPing() {
        assertThat(new CalculatorAPI().ping(), containsString("Welcome to Java Maven Calculator Web App!!!"));
    }

}

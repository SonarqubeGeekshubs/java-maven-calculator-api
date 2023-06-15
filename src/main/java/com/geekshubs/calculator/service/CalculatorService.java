package com.geekshubs.calculator.service;

import com.geekshubs.calculator.model.Calculator;
import com.geekshubs.calculator.model.Operation;

public class CalculatorService {

    public Calculator Add(int x, int y) {
        return new Calculator(x, y, Operation.ADD);
    }

    public Calculator Sub(int x, int y) {
        return new Calculator(x, y, Operation.SUB);
    }

    public Calculator Mul(int x, int y) {
        return new Calculator(x, y, Operation.MULT);
    }

    public Calculator Div(int x, int y) {
        return new Calculator(x, y, Operation.DIV);
    }
}

package com.geekshubs.calculator.model;

public class Calculator {

    int _x;
    int _y;
    Operation _operation;

    public Calculator(int x, int y, Operation operation) {
        _x = x;
        _y = y;
        _operation = operation;
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public Operation getOperation() {
        return _operation;
    }

    public int getResult() {

        switch (_operation.name) {
            case "add":
                return  _x + _y;
            case "sub":
                return  _x - _y;
            case "mul":
                return  _x * _y;
            case "div":
                return  _x/_y;
            default:
                return  0;
        }
    }
}

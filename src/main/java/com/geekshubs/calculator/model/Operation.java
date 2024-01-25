package com.geekshubs.calculator.model;

public enum Operation {
    ADD("add", "+"),
    SUB("sub", "-"),
    MULT("mul", "*"),
    DIV("div", "/"),
    NONE("none", "?");

    public final String name;
    public final String operation;

    Operation(String name, String operation) {
        this.name = name;
        this.operation = operation;
    }
}

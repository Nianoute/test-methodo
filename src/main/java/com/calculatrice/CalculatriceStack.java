package com.calculatrice;

public class CalculatriceStack {

    public int calculatrice(int a, int b, String operation) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "sub":
                return sub(a, b);
            case "mul":
                return mul(a, b);
            case "div":
                return div(a, b);
            default:
                throw new IllegalArgumentException("Opération inconnue : " + operation);
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro");
        }
        return a / b;
    }
}
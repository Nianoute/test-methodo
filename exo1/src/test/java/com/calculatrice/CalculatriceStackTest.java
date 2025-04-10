package com.calculatrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatriceStackTest {

    private CalculatriceStack calculatrice;

    @BeforeEach
    public void setUp() {
        calculatrice = new CalculatriceStack();
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculatrice.calculatrice(2, 3, "add"));
    }

    @Test
    public void testSoustraction() {
        assertEquals(-1.0, calculatrice.calculatrice(2, 3, "sub"));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculatrice.calculatrice(2, 3, "mul"));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculatrice.calculatrice(6, 3, "div"));
    }
}
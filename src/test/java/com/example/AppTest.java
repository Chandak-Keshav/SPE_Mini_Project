package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSquareRoot() {
        assertEquals("2.0", App.squareRoot(4.0));
        assertEquals("Error: Cannot compute square root of negative number.", App.squareRoot(-4.0));
        assertEquals("3.0", App.squareRoot(9.0));
        System.out.println("Square Root passed Tests!");
    }

    @Test
    public void testFactorial() {
        assertEquals("120", App.factorial(5.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", App.factorial(-1.0));
        assertEquals("Error: Factorial is defined for non-negative integers only.", App.factorial(4.5));
        assertEquals("1", App.factorial(0));
        System.out.println("Factorial passed Tests!");
    }

    @Test
    public void testNaturalLog() {
        assertEquals("1.0", App.naturalLog(Math.E));
        assertEquals("Error: Logarithm is defined for positive numbers only.", App.naturalLog(0.0));
        assertEquals("Error: Logarithm is defined for positive numbers only.", App.naturalLog(-3.0));
        System.out.println("Natural Logarithm passed Tests!");
    }

    @Test
    public void testPower() {
        assertEquals("8.0", App.power(2.0, 3.0));
        assertEquals("1.0", App.power(5.0, 0.0));
        assertEquals("0.25", App.power(2.0, -2.0));
        System.out.println("Exponential passed Tests!");
    }
}
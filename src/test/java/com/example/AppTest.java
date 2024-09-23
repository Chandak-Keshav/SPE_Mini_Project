package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    // Test for square root function
    @Test
    public void testSquareRoot() {
        assertEquals(3.0, Math.sqrt(9), 0.0001);
        assertEquals(0.0, Math.sqrt(0), 0.0001);
        assertEquals(Double.NaN, Math.sqrt(-1)); // Negative input should return NaN
    }

    // Test for factorial function
    @Test
    public void testFactorial() {
        assertEquals(1, factorial(0)); // 0! = 1
        assertEquals(1, factorial(1)); // 1! = 1
        assertEquals(120, factorial(5)); // 5! = 120
        assertThrows(IllegalArgumentException.class, () -> factorial(-1)); // Should throw exception
    }

    // Test for natural logarithm function
    @Test
    public void testNaturalLog() {
        assertEquals(Math.log(1), Math.log(1), 0.0001); // ln(1) = 0
        assertEquals(0.0, Math.log(1), 0.0001);
    }

    // Test for power function
    @Test
    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), 0.0001); // 2^3 = 8
        assertEquals(1.0, Math.pow(5, 0), 0.0001); // 5^0 = 1
        assertEquals(0.0, Math.pow(0, 5), 0.0001); // 0^5 = 0
        assertEquals(1.0, Math.pow(0, 0), 0.0001); // 0^0 is typically defined as 1
    }

    // Factorial helper method for testing
    private long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

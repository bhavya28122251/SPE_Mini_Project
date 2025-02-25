package com.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, App.squareRoot(16), 0.0001);
        assertEquals(5.0, App.squareRoot(25), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, App.factorial(5));
        assertEquals(1, App.factorial(0));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, App.naturalLog(1), 0.0001);
        assertEquals(1.0, App.naturalLog(Math.E), 0.0001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(16.0, App.power(2, 4), 0.0001);
        assertEquals(9.0, App.power(3, 2), 0.0001);
    }
}

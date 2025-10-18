package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TriangleNumberCalculatorTest {

    private final TriangleNumberCalculator calc = new TriangleNumberCalculator();

    @Test
    @DisplayName("value(n) matches sample outputs and base cases")
    void testValueBasics() {
        assertEquals(0, calc.value(0));
        assertEquals(1, calc.value(1));
        assertEquals(3, calc.value(2));
        assertEquals(6, calc.value(3));
        assertEquals(10, calc.value(4));
        assertEquals(55, calc.value(10));
    }

    @Test
    @DisplayName("value(n) rejects negative inputs")
    void testValueNegative() {
        assertThrows(IllegalArgumentException.class, () -> calc.value(-1));
        assertThrows(IllegalArgumentException.class, () -> calc.value(-10));
    }

    @Test
    @DisplayName("add(n, m) matches sample outputs")
    void testAdd() {
        assertEquals(2,  calc.add(1, 1)); // 1+1
        assertEquals(9,  calc.add(2, 3)); // 3+6
        assertEquals(13, calc.add(4, 2)); // 10+3
    }

    @Test
    @DisplayName("subtract(n, m) matches sample outputs")
    void testSubtract() {
        assertEquals(0,  calc.subtract(1, 1));  // 1-1
        assertEquals(-3, calc.subtract(2, 3));  // 3-6
        assertEquals(7,  calc.subtract(4, 2));  // 10-3
    }

    @Test
    @DisplayName("add/subtract validate inputs via value()")
    void testAddSubtractValidation() {
        assertThrows(IllegalArgumentException.class, () -> calc.add(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> calc.subtract(2, -3));
    }
}
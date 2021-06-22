package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum3Test {

    @Test
    public void testSum30() {
        assertEquals(6, Sum3.sum3(new int[]{1, 2, 3}), "Expected value: 6");
    }

    @Test
    public void testSum31() {
        assertEquals(8, Sum3.sum3(new int[]{5, 1, 2}), "Expected value: 8");
    }

    @Test
    public void testSum32() {
        assertEquals(7, Sum3.sum3(new int[]{7, 0, 0}), "Expected value: 7");
    }

    @Test
    public void testSum33() {
        assertEquals(4, Sum3.sum3(new int[]{1, 2, 1}), "Expected value: 4");
    }

    @Test
    public void testSum34() {
        assertEquals(3, Sum3.sum3(new int[]{1, 1, 1}), "Expected value: 3");
    }

    @Test
    public void testSum35() {
        assertEquals(11, Sum3.sum3(new int[]{2, 7, 2}), "Expected value: 11");
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sum2Test {

    @Test
    public void testSum20() {
        assertEquals( 3, Sum2.sum2(new int[]{1, 2, 3}), "Expected value: 3");
    }

    @Test
    public void testSum21() {
        assertEquals( 2, Sum2.sum2(new int[]{1, 1}), "Expected value: 2");
    }

    @Test
    public void testSum22() {
        assertEquals( 2, Sum2.sum2(new int[]{1, 1, 1, 1}), "Expected value: 2");
    }

    @Test
    public void testSum23() {
        assertEquals( 3, Sum2.sum2(new int[]{1, 2}), "Expected value: 3");
    }

    @Test
    public void testSum24() {
        assertEquals( 1, Sum2.sum2(new int[]{1}), "Expected value: 1");
    }

    @Test
    public void testSum25() {
        assertEquals( 0, Sum2.sum2(new int[]{}), "Expected value: 0");
    }

    @Test
    public void testSum26() {
        assertEquals( 9, Sum2.sum2(new int[]{4, 5, 6}), "Expected value: 9");
    }

    @Test
    public void testSum27() {
        assertEquals( 4, Sum2.sum2(new int[]{4}), "Expected value: 4");
    }

}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonEndTest {

    @Test
    public void testCommonEnd0() {
        assertEquals(true, CommonEnd.coomonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), "Expected value: true");
    }

    @Test
    public void testCommonEnd1() {
        assertEquals(false, CommonEnd.coomonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), "Expected value: false");
    }

    @Test
    public void testCommonEnd2() {
        assertEquals(true, CommonEnd.coomonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), "Expected value: true");
    }

    @Test
    public void testCommonEnd3() {
        assertEquals(true, CommonEnd.coomonEnd(new int[]{1, 2, 3}, new int[]{1}), "Expected value: true");
    }

    @Test
    public void testCommonEnd4() {
        assertEquals(false, CommonEnd.coomonEnd(new int[]{1, 2, 3}, new int[]{2}), "Expected value: false");
    }
}

package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Unlucky1Test {

    @Test
    public void testUnlucky10() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 3, 4, 5}), "Expected value: true");
    }

    @Test
    public void testUnlucky11() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{2, 1, 3, 4, 5}), "Expected value: true");
    }

    @Test
    public void testUnlucky12() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky13() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky14() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky15() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky16() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky17() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky18() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky19() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }
    @Test

    public void testUnlucky110() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky111() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky112() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky113() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky114() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky115() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky116() {
        assertEquals(false, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: false");
    }

    @Test
    public void testUnlucky117() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 1, 1}), "Expected value: true");
    }

    @Test
    public void testUnlucky118() {
        assertEquals(true, Unlucky1.unlucky1(new int[]{1, 2, 3, 4, 1, 3}), "Expected value: true");
    }
}

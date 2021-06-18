package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstLast6Test {

    @Test
    public void testFirstLast60() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{1, 2, 6}), "Expected value: true");
    }

    @Test
    public void testFirstLast61() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{6, 1, 2, 3}), "Expected value: true");
    }

    @Test
    public void testFirstLast62() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{13, 6, 1, 2, 3}), "Expected value: false");
    }

    @Test
    public void testFirstLast63() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{13, 6, 1, 2, 6}), "Expected value: true");
    }

    @Test
    public void testFirstLast64() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{3, 2, 1}), "Expected value: false");
    }

    @Test
    public void testFirstLast65() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{3, 6, 1}), "Expected value: false");
    }

    @Test
    public void testFirstLast66() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{3, 6}), "Expected value: true");
    }

    @Test
    public void testFirstLast67() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{6}), "Expected value: true");
    }

    @Test
    public void testFirstLast68() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{3}), "Expected value: false");
    }

    @Test
    public void testFirstLast69() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{5, 6}), "Expected value: true");
    }

    @Test
    public void testFirstLast610() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{5, 5}), "Expected value: false");
    }

    @Test
    public void testFirstLast611() {
        assertEquals(true, FIrstLast6.firstLast6(new int[]{1, 2, 3, 4, 6}), "Expected value: true");
    }

    @Test
    public void testFirstLast612() {
        assertEquals(false, FIrstLast6.firstLast6(new int[]{1, 2, 3, 4}), "Expected value: false");
    }

}

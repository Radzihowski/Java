package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No23Test {

    @Test
    public void testNo230() {
        assertEquals(true, No23.no23(new int[]{4, 5}), "Expected value: true");
    }

    @Test
    public void testNo231() {
        assertEquals(false, No23.no23(new int[]{4, 2}), "Expected value: false");
    }

    @Test
    public void testNo232() {
        assertEquals(false, No23.no23(new int[]{3, 5}), "Expected value: false");
    }

    @Test
    public void testNo233() {
        assertEquals(true, No23.no23(new int[]{1, 9}), "Expected value: true");
    }

    @Test
    public void testNo234() {
        assertEquals(false, No23.no23(new int[]{2, 9}), "Expected value: false");
    }

    @Test
    public void testNo235() {
        assertEquals(false, No23.no23(new int[]{1, 3}), "Expected value: false");
    }

    @Test
    public void testNo236() {
        assertEquals(true, No23.no23(new int[]{1, 1}), "Expected value: true");
    }

    @Test
    public void testNo237() {
        assertEquals(false, No23.no23(new int[]{2, 2}), "Expected value: false");
    }

    @Test
    public void testNo238() {
        assertEquals(false, No23.no23(new int[]{3, 3}), "Expected value: false");
    }

    @Test
    public void testNo239() {
        assertEquals(true, No23.no23(new int[]{7, 8}), "Expected value: true");
    }

    @Test
    public void testNo2310() {
        assertEquals(true, No23.no23(new int[]{8, 7}), "Expected value: true");
    }
}

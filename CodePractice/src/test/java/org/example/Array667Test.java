package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array667Test {

    @Test
    public void testArray667() {
        assertEquals(1, Array667.array667( new int[] {6, 6, 2}), "Expected value: 1");
    }

    @Test
    public void testArray6671() {
        assertEquals(1, Array667.array667(new int[] {6, 6, 2, 6}), "Expected value: 1");
    }

    @Test
    public void testArray6672() {
        assertEquals(1, Array667.array667(new int[] {6, 7, 2, 6}), "Expected value: 1");
    }

    @Test
    public void testArray6673() {
        assertEquals(2, Array667.array667(new int[] {6, 6, 2, 6, 7}), "Expected value: 2");
    }

    @Test
    public void testArray6674() {
        assertEquals(0, Array667.array667(new int[] {1, 6, 3}), "Expected value: 0");
    }

    @Test
    public void testArray6675() {
        assertEquals(0, Array667.array667(new int[] {6, 1}), "Expected value: 0");
    }

    @Test
    public void testArray6676() {
        assertEquals(0, Array667.array667(new int[] {}), "Expected value: 0");
    }

    @Test
    public void testArray6677() {
        assertEquals(1, Array667.array667(new int[] {3, 6, 7, 6}), "Expected value: 1");
    }

    @Test
    public void testArray6678() {
        assertEquals(2, Array667.array667(new int[] {3, 6, 6, 7}), "Expected value: 2");
    }

    @Test
    public void testArray6679() {
        assertEquals(1, Array667.array667(new int[] {6, 3, 6, 6}), "Expected value: 1");
    }

    @Test
    public void testArray66710() {
        assertEquals(2, Array667.array667(new int[] {6, 7, 6, 6}), "Expected value: 2");
    }

    @Test
    public void testArray66711() {
        assertEquals(0, Array667.array667(new int[] {1, 2, 3, 5, 6}), "Expected value: 0");
    }

    @Test
    public void testArray66712() {
        assertEquals(1, Array667.array667(new int[] {1, 2, 3, 6, 6}), "Expected value: 1");
    }

}

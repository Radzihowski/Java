package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Has271Test {

    @Test
    public void testHas271() {
        assertEquals(true, Has271.has271(new int[]{1, 2, 7, 1}), "Expected value true");
    }

    @Test
    public void testHas2711() {
        assertEquals(false, Has271.has271(new int[]{1, 2, 8, 1}), "Expected value false");
    }

    @Test
    public void testHas2712() {
        assertEquals(true, Has271.has271(new int[]{2, 7, 1}), "Expected value true");
    }

    @Test
    public void testHas2713() {
        assertEquals(true, Has271.has271(new int[]{3, 8, 2}), "Expected value true");
    }

    @Test
    public void testHas2714() {
        assertEquals(true, Has271.has271(new int[]{2, 7, 3}), "Expected value true");
    }

    @Test
    public void testHas2715() {
        assertEquals(false, Has271.has271(new int[]{2, 7, 4}), "Expected value false");
    }

    @Test
    public void testHas276() {
        assertEquals(true, Has271.has271(new int[]{2, 7, -1}), "Expected value true");
    }

    @Test
    public void testHas2717() {
        assertEquals(false, Has271.has271(new int[]{2, 7, -2}), "Expected value false");
    }

    @Test
    public void testHas2718() {
        assertEquals(true, Has271.has271(new int[]{4, 5, 3, 8, 0}), "Expected value true");
    }

    @Test
    public void testHas2719() {
        assertEquals(true, Has271.has271(new int[]{2, 7, 5, 10, 4}), "Expected value true");
    }

    @Test
    public void testHas27110() {
        assertEquals(true, Has271.has271(new int[]{2, 7, -2, 4, 9, 3}), "Expected value true");
    }

    @Test
    public void testHas27111() {
        assertEquals(false, Has271.has271(new int[]{2, 7, 5, 10, 1}), "Expected value false");
    }

    @Test
    public void testHas27112() {
        assertEquals(false, Has271.has271(new int[]{2, 7, -2, 4, 10, 2}), "Expected value false");
    }

    @Test
    public void testHas27113() {
        assertEquals(true, Has271.has271(new int[]{1, 1, 4, 9, 0}), "Expected value true");
    }

    @Test
    public void testHas27114() {
        assertEquals(true, Has271.has271(new int[]{1, 1, 4, 9, 4, 9, 2}), "Expected value true");
    }
}

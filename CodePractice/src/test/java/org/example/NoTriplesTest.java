package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoTriplesTest {

    @Test
    public void testNoTriples0() {
        assertEquals(true, NoTriples.noTriples(new int[] {1, 1, 2, 2, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples1() {
        assertEquals(false, NoTriples.noTriples(new int[] {1, 1, 2, 2, 2, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples2() {
        assertEquals(false, NoTriples.noTriples(new int[] {1, 1, 1, 2, 2, 2, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples3() {
        assertEquals(true, NoTriples.noTriples(new int[] {1, 1, 2, 2, 1, 2, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples4() {
        assertEquals(true, NoTriples.noTriples(new int[] {1, 2, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples5() {
        assertEquals(false, NoTriples.noTriples(new int[] {1, 1, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples6() {
        assertEquals(true, NoTriples.noTriples(new int[] {1, 1}), "Expected result: true");
    }

    @Test
    public void testNoTriples7() {
        assertEquals(true, NoTriples.noTriples(new int[] {1}), "Expected result: true");
    }

    @Test
    public void testNoTriples8() {
        assertEquals(true, NoTriples.noTriples(new int[] {}), "Expected result: true");
    }

}

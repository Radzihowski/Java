package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Old35Test {

    @Test
    public void testOld350() {
        assertEquals( true, Old35.old35(3), "Expected value: true");
    }

    @Test
    public void testOld351() {
        assertEquals( true, Old35.old35(10), "Expected value: true");
    }

    @Test
    public void testOld352() {
        assertEquals( false, Old35.old35(15), "Expected value: false");
    }

    @Test
    public void testOld353() {
        assertEquals( true, Old35.old35(5), "Expected value: true");
    }

    @Test
    public void testOld354() {
        assertEquals( true, Old35.old35(9), "Expected value: true");
    }

    @Test
    public void testOld355() {
        assertEquals( false, Old35.old35(8), "Expected value: false");
    }

    @Test
    public void testOld356() {
        assertEquals( false, Old35.old35(7), "Expected value: false");
    }

    @Test
    public void testOld357() {
        assertEquals( true, Old35.old35(6), "Expected value: true");
    }

    @Test
    public void testOld358() {
        assertEquals( false, Old35.old35(17), "Expected value: false");
    }

    @Test
    public void testOld359() {
        assertEquals( true, Old35.old35(18), "Expected value: true");
    }

    @Test
    public void testOld3510() {
        assertEquals( false, Old35.old35(29), "Expected value: false");
    }

    @Test
    public void testOld3511() {
        assertEquals( true, Old35.old35(20), "Expected value: true");
    }

    @Test
    public void testOld3512() {
        assertEquals( true, Old35.old35(21), "Expected value: true");
    }

    @Test
    public void testOld3513() {
        assertEquals( false, Old35.old35(22), "Expected value: false");
    }

    @Test
    public void testOld3514() {
        assertEquals( false, Old35.old35(45), "Expected value: false");
    }

    @Test
    public void testOld3515() {
        assertEquals( true, Old35.old35(99), "Expected value: true");
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOrderEqualTest {

    @Test
    public void testInOrderEqual0() {
        assertEquals(true, InOrderEqual.inOrderEqual(2, 5, 11, false), "Expected value: true");
    }

    @Test
    public void testInOrderEqual1() {
        assertEquals(false, InOrderEqual.inOrderEqual(5, 7, 6, false), "Expected value: false");
    }

    @Test
    public void testInOrderEqual2() {
        assertEquals(true, InOrderEqual.inOrderEqual(5, 5, 7, true), "Expected value: true");
    }

    @Test
    public void testInOrderEqual3() {
        assertEquals(false, InOrderEqual.inOrderEqual(5, 5, 7, false), "Expected value: false");
    }

    @Test
    public void testInOrderEqual4() {
        assertEquals(false, InOrderEqual.inOrderEqual(2, 5, 4, false), "Expected value: false");
    }

    @Test
    public void testInOrderEqual5() {
        assertEquals(false, InOrderEqual.inOrderEqual(3, 4, 3, false), "Expected value: false");
    }

    @Test
    public void testInOrderEqual6() {
        assertEquals(false, InOrderEqual.inOrderEqual(3, 4, 4, false), "Expected value: false");
    }

    @Test
    public void testInOrderEqual7() {
        assertEquals(false, InOrderEqual.inOrderEqual(3, 4, 3, true), "Expected value: false");
    }

    @Test
    public void testInOrderEqual8() {
        assertEquals(true, InOrderEqual.inOrderEqual(3, 4, 4, true), "Expected value: true");
    }

    @Test
    public void testInOrderEqual9() {
        assertEquals(true, InOrderEqual.inOrderEqual(1, 5, 5, true), "Expected value: true");
    }

    @Test
    public void testInOrderEqual10() {
        assertEquals(true, InOrderEqual.inOrderEqual(5, 5, 5, true), "Expected value: true");
    }

    @Test
    public void testInOrderEqual11() {
        assertEquals(false, InOrderEqual.inOrderEqual(2, 2, 1, true), "Expected value: false");
    }

    @Test
    public void testInOrderEqual12() {
        assertEquals(false, InOrderEqual.inOrderEqual(9, 2, 2, true), "Expected value: true");
    }

    @Test
    public void testInOrderEqual13() {
        assertEquals(false, InOrderEqual.inOrderEqual(0, 1, 0, true), "Expected value: false");
    }
}

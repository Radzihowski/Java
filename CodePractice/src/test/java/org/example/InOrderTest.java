package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InOrderTest {

    @Test
    public void testInOrder0() {
        assertEquals( true, InOrder.inOrder(1, 2, 4, false), "Expected value: true");
    }

    @Test
    public void testInOrder1() {
        assertEquals( false, InOrder.inOrder(1, 2, 1, false), "Expected value: false");
    }

    @Test
    public void testInOrder2() {
        assertEquals( true, InOrder.inOrder(1, 1, 2, true), "Expected value: true");
    }

    @Test
    public void testInOrder3() {
        assertEquals( false, InOrder.inOrder(3, 2, 4, false), "Expected value: false");
    }

    @Test
    public void testInOrder4() {
        assertEquals( true, InOrder.inOrder(2, 3, 4, false), "Expected value: true");
    }

    @Test
    public void testInOrder5() {
        assertEquals( true, InOrder.inOrder(3, 2, 4, true), "Expected value: true");
    }

    @Test
    public void testInOrder6() {
        assertEquals( false, InOrder.inOrder(4, 2, 2, true), "Expected value: false");
    }

    @Test
    public void testInOrder7() {
        assertEquals( false, InOrder.inOrder(4, 5, 2, true), "Expected value: false");
    }

    @Test
    public void testInOrder8() {
        assertEquals( true, InOrder.inOrder(2, 4, 6, true), "Expected value: true");
    }

    @Test
    public void testInOrder9() {
        assertEquals( true, InOrder.inOrder(7, 9, 10, false), "Expected value: true");
    }

    @Test
    public void testInOrder10() {
        assertEquals( true, InOrder.inOrder(7, 5, 6, true), "Expected value: true");
    }

    @Test
    public void testInOrder11() {
        assertEquals( false, InOrder.inOrder(7, 5, 4, true), "Expected value: false");
    }
}

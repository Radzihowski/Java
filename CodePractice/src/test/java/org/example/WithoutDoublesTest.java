package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutDoublesTest {

    @Test
    public void testWithoutDoubles0() {
        assertEquals(5, WithoutDoubles.withoutDoubles(2, 3, true), "Expected value: 5");
    }

    @Test
    public void testWithoutDoubles1() {
        assertEquals(7, WithoutDoubles.withoutDoubles(3, 3, true), "Expected value: 7");
    }

    @Test
    public void testWithoutDoubles2() {
        assertEquals(6, WithoutDoubles.withoutDoubles(3, 3, false), "Expected value: 6");
    }

    @Test
    public void testWithoutDoubles3() {
        assertEquals(5, WithoutDoubles.withoutDoubles(2, 3, false), "Expected value: 5");
    }

    @Test
    public void testWithoutDoubles4() {
        assertEquals(9, WithoutDoubles.withoutDoubles(5, 4, true), "Expected value: 9");
    }

    @Test
    public void testWithoutDoubles5() {
        assertEquals(9, WithoutDoubles.withoutDoubles(5, 4, false), "Expected value: 9");
    }

    @Test
    public void testWithoutDoubles6() {
        assertEquals(11, WithoutDoubles.withoutDoubles(5, 5, true), "Expected value: 11");
    }

    @Test
    public void testWithoutDoubles7() {
        assertEquals(10, WithoutDoubles.withoutDoubles(5, 5, false), "Expected value: 10");
    }

    @Test
    public void testWithoutDoubles8() {
        assertEquals(7, WithoutDoubles.withoutDoubles(6, 6, true), "Expected value: 7");
    }

    @Test
    public void testWithoutDoubles9() {
        assertEquals(12, WithoutDoubles.withoutDoubles(6, 6, false), "Expected value: 12");
    }

    @Test
    public void testWithoutDoubles10() {
        assertEquals(7, WithoutDoubles.withoutDoubles(1, 6, true), "Expected value: 7");
    }

    @Test
    public void testWithoutDoubles11() {
        assertEquals(7, WithoutDoubles.withoutDoubles(6, 1, false), "Expected value: 7");
    }
}

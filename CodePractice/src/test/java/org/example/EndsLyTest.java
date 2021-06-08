package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndsLyTest {

    @Test
    public void testEndsLy0() {
        assertEquals(true, EndsLy.endsLy("oddly"), "Expected value: true");
    }

    @Test
    public void testEndsLy1() {
        assertEquals(false, EndsLy.endsLy("y"), "Expected value: false");
    }

    @Test
    public void testEndsLy2() {
        assertEquals(false, EndsLy.endsLy("oddy"), "Expected value: false");
    }

    @Test
    public void testEndsLy3() {
        assertEquals(false, EndsLy.endsLy("oddl"), "Expected value: false");
    }

    @Test
    public void testEndsLy4() {
        assertEquals(false, EndsLy.endsLy("olydd"), "Expected value: false");
    }

    @Test
    public void testEndsLy5() {
        assertEquals(true, EndsLy.endsLy("ly"), "Expected value: true");
    }

    @Test
    public void testEndsLy6() {
        assertEquals(false, EndsLy.endsLy(""), "Expected value: false");
    }

    @Test
    public void testEndsLy7() {
        assertEquals(false, EndsLy.endsLy("falsey"), "Expected value: false");
    }

    @Test
    public void testEndsLy8() {
        assertEquals(true, EndsLy.endsLy("evenly"), "Expected value: true");
    }
 }

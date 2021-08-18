package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessBy10Test {

    @Test
    public void testLessBy100() {
        assertEquals( true, LessBy10.lessBy10(1, 7, 11), "Expected value: true");
    }

    @Test
    public void testLessBy101() {
        assertEquals( false, LessBy10.lessBy10(1, 7, 10), "Expected value: false");
    }

    @Test
    public void testLessBy102() {
        assertEquals( true, LessBy10.lessBy10(11, 1, 7), "Expected value: true");
    }

    @Test
    public void testLessBy103() {
        assertEquals( false, LessBy10.lessBy10(10, 7, 1), "Expected value: false");
    }

    @Test
    public void testLessBy104() {
        assertEquals( true, LessBy10.lessBy10(-10, 2, 2), "Expected value: true");
    }

    @Test
    public void testLessBy105() {
        assertEquals( false, LessBy10.lessBy10(2, 11, 11), "Expected value: false");
    }

    @Test
    public void testLessBy106() {
        assertEquals( true, LessBy10.lessBy10(3, 3, 30), "Expected value: true");
    }

    @Test
    public void testLessBy107() {
        assertEquals( false, LessBy10.lessBy10(3, 3, 3), "Expected value: false");
    }

    @Test
    public void testLessBy108() {
        assertEquals( true, LessBy10.lessBy10(10, 1, 11), "Expected value: true");
    }

    @Test
    public void testLessBy109() {
        assertEquals( true, LessBy10.lessBy10(10, 1, 11), "Expected value: true");
    }

    @Test
    public void testLessBy1010() {
        assertEquals( false, LessBy10.lessBy10(10, 11, 2), "Expected value: false");
    }

    @Test
    public void testLessBy1011() {
        assertEquals( true, LessBy10.lessBy10(3, 30, 3), "Expected value: true");
    }

    @Test
    public void testLessBy1012() {
        assertEquals( true, LessBy10.lessBy10(2, 2, -8), "Expected value: true");
    }

    @Test
    public void testLessBy1013() {
        assertEquals( true, LessBy10.lessBy10(2, 8, 12), "Expected value: true");
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoAsOneTest {

    @Test
    public void testTwoAsOne0() {
        assertEquals( true, TwoAsOne.twoAsOne(1, 2, 3), "Expected value: true");
    }

    @Test
    public void testTwoAsOne1() {
        assertEquals( true, TwoAsOne.twoAsOne(3, 1, 2), "Expected value: true");
    }

    @Test
    public void testTwoAsOne2() {
        assertEquals( false, TwoAsOne.twoAsOne(3, 2, 2), "Expected value: false");
    }

    @Test
    public void testTwoAsOne3() {
        assertEquals( true, TwoAsOne.twoAsOne(2, 3, 1), "Expected value: true");
    }

    @Test
    public void testTwoAsOne4() {
        assertEquals( true, TwoAsOne.twoAsOne(5, 3, -2), "Expected value: true");
    }

    @Test
    public void testTwoAsOne5() {
        assertEquals( false, TwoAsOne.twoAsOne(5, 3, -3), "Expected value: false");
    }

    @Test
    public void testTwoAsOne6() {
        assertEquals( true, TwoAsOne.twoAsOne(2, 5, 3), "Expected value: true");
    }

    @Test
    public void testTwoAsOne7() {
        assertEquals( false, TwoAsOne.twoAsOne(9, 5, 5), "Expected value: false");
    }

    @Test
    public void testTwoAsOne8() {
        assertEquals( true, TwoAsOne.twoAsOne(9, 4, 5), "Expected value: true");
    }

    @Test
    public void testTwoAsOne9() {
        assertEquals( true, TwoAsOne.twoAsOne(5, 4, 9), "Expected value: true");
    }

    @Test
    public void testTwoAsOne10() {
        assertEquals( true, TwoAsOne.twoAsOne(3, 3, 0), "Expected value: true");
    }

    @Test
    public void testTwoAsOne11() {
        assertEquals( false, TwoAsOne.twoAsOne(3, 3, 2), "Expected value: false");
    }

}

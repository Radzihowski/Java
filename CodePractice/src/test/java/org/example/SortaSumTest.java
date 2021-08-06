package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortaSumTest {
    @Test
    public void testSortaSum0() {
        assertEquals( 7, SortaSum.sortaSum(3, 4), "Expected value: 7");
    }

    @Test
    public void testSortaSum1() {
        assertEquals( 20, SortaSum.sortaSum(9, 4), "Expected value: 20");
    }

    @Test
    public void testSortaSum2() {
        assertEquals( 21, SortaSum.sortaSum(10, 11), "Expected value: 21");
    }

    @Test
    public void testSortaSum3() {
        assertEquals( 9, SortaSum.sortaSum(12, -3), "Expected value: 9");
    }

    @Test
    public void testSortaSum4() {
        assertEquals( 9, SortaSum.sortaSum(-3, 12), "Expected value: 9");
    }

    @Test
    public void testSortaSum5() {
        assertEquals( 9, SortaSum.sortaSum(4, 5), "Expected value: 9");
    }

    @Test
    public void testSortaSum6() {
        assertEquals( 20, SortaSum.sortaSum(4, 6), "Expected value: 20");
    }

    @Test
    public void testSortaSum7() {
        assertEquals( 21, SortaSum.sortaSum(14, 7), "Expected value: 21");
    }

    @Test
    public void testSortaSum8() {
        assertEquals( 20, SortaSum.sortaSum(14, 6), "Expected value: 20");
    }
}

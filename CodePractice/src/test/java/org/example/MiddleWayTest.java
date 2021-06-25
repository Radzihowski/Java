package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleWayTest {

    @Test
    public void testMiddleWay0() {
        assertArrayEquals(new int[]{2, 5}, MiddleWay.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}), "Expected value: {2, 5}");
    }

    @Test
    public void testMiddleWay1() {
        assertArrayEquals(new int[]{7, 8}, MiddleWay.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}), "Expected value: {7, 8}");
    }

    @Test
    public void testMiddleWay2() {
        assertArrayEquals(new int[]{2, 4}, MiddleWay.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}), "Expected value: {2, 4}");
    }

    @Test
    public void testMiddleWay3() {
        assertArrayEquals(new int[]{9, 8}, MiddleWay.middleWay(new int[]{1, 9, 7}, new int[]{4, 8, 8}), "Expected value: {9, 8}");
    }

    @Test
    public void testMiddleWay4() {
        assertArrayEquals(new int[]{2, 1}, MiddleWay.middleWay(new int[]{1, 2, 3}, new int[]{3, 1, 4}), "Expected value: {2, 1}");
    }

    @Test
    public void testMiddleWay5() {
        assertArrayEquals(new int[]{2, 1}, MiddleWay.middleWay(new int[]{1, 2, 3}, new int[]{4, 1, 1}), "Expected value: {2, 1}");
    }
}

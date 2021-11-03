package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumLimitTest {

    @Test
    public void testSumLimit0() {
        assertEquals(5, SumLimit.sumLimit(2, 3), "Expected value: 5" );
    }

    @Test
    public void testSumLimit1() {
        assertEquals(8, SumLimit.sumLimit(8, 3), "Expected value: 8" );
    }

    @Test
    public void testSumLimit2() {
        assertEquals(9, SumLimit.sumLimit(8, 1), "Expected value: 9" );
    }

    @Test
    public void testSumLimit3() {
        assertEquals(50, SumLimit.sumLimit(11, 39), "Expected value: 50" );
    }

    @Test
    public void testSumLimit4() {
        assertEquals(11, SumLimit.sumLimit(11, 99), "Expected value: 11" );
    }

    @Test
    public void testSumLimit5() {
        assertEquals(0, SumLimit.sumLimit(0, 0), "Expected value: 0" );
    }

    @Test
    public void testSumLimit6() {
        assertEquals(99, SumLimit.sumLimit(99, 0), "Expected value: 99" );
    }

    @Test
    public void testSumLimit7() {
        assertEquals(99, SumLimit.sumLimit(99, 1), "Expected value: 99" );
    }

    @Test
    public void testSumLimit8() {
        assertEquals(124, SumLimit.sumLimit(123, 1), "Expected value: 124" );
    }

    @Test
    public void testSumLimit9() {
        assertEquals(1, SumLimit.sumLimit(1, 123), "Expected value: 1" );
    }

    @Test
    public void testSumLimit10() {
        assertEquals(83, SumLimit.sumLimit(23, 60), "Expected value: 83" );
    }

    @Test
    public void testSumLimit11() {
        assertEquals(23, SumLimit.sumLimit(23, 80), "Expected value: 23" );
    }

    @Test
    public void testSumLimit12() {
        assertEquals(9001, SumLimit.sumLimit(9000, 1), "Expected value: 9001" );
    }

    @Test
    public void testSumLimit13() {
        assertEquals(90000001, SumLimit.sumLimit(90000000, 1), "Expected value: 90000001" );
    }

    @Test
    public void testSumLimit14() {
        assertEquals(9000, SumLimit.sumLimit(9000, 1000), "Expected value: 9000" );
    }

}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeenSumTest {
    @Test
    public void testTeenSum0() {
        assertEquals( 7, TeenSum.teenSum(3, 4), "Expected value: 7");
    }

    @Test
    public void testTeenSum1() {
        assertEquals( 19, TeenSum.teenSum(13, 2), "Expected value: 19");
    }

    @Test
    public void testTeenSum2() {
        assertEquals( 19, TeenSum.teenSum(3, 19), "Expected value: 19");
    }

    @Test
    public void testTeenSum3() {
        assertEquals( 19, TeenSum.teenSum(13, 13), "Expected value: 19");
    }

    @Test
    public void testTeenSum4() {
        assertEquals( 19, TeenSum.teenSum(13, 2), "Expected value: 19");
    }

    @Test
    public void testTeenSum5() {
        assertEquals( 20, TeenSum.teenSum(10, 10), "Expected value: 20");
    }

    @Test
    public void testTeenSum6() {
        assertEquals( 19, TeenSum.teenSum(6, 14), "Expected value: 19");
    }

    @Test
    public void testTeenSum7() {
        assertEquals( 19, TeenSum.teenSum(15, 2), "Expected value: 19");
    }

    @Test
    public void testTeenSum8() {
        assertEquals( 19, TeenSum.teenSum(19, 19), "Expected value: 19");
    }

    @Test
    public void testTeenSum9() {
        assertEquals( 19, TeenSum.teenSum(19, 20), "Expected value: 19");
    }

    @Test
    public void testTeenSum10() {
        assertEquals( 19, TeenSum.teenSum(2, 18), "Expected value: 19");
    }

    @Test
    public void testTeenSum11() {
        assertEquals( 16, TeenSum.teenSum(12, 4), "Expected value: 16");
    }

    @Test
    public void testTeenSum12() {
        assertEquals( 22, TeenSum.teenSum(2, 20), "Expected value: 22");
    }

    @Test
    public void testTeenSum13() {
        assertEquals( 19, TeenSum.teenSum(2, 17), "Expected value: 19");
    }

    @Test
    public void testTeenSum14() {
        assertEquals( 19, TeenSum.teenSum(2, 16), "Expected value: 19");
    }

    @Test
    public void testTeenSum15() {
        assertEquals( 13, TeenSum.teenSum(6, 7), "Expected value: 13");
    }
}

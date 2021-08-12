package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Less20Test {

    @Test
    public void testLess200() {
        assertEquals( true, Less20.less20(18), "Expected value: true");
    }

    @Test
    public void testLess201() {
        assertEquals( true, Less20.less20(19), "Expected value: true");
    }

    @Test
    public void testLess202() {
        assertEquals( false, Less20.less20(20), "Expected value: false");
    }

    @Test
    public void testLess203() {
        assertEquals( false, Less20.less20(8), "Expected value: false");
    }

    @Test
    public void testLess204() {
        assertEquals( false, Less20.less20(17), "Expected value: false");
    }

    @Test
    public void testLess205() {
        assertEquals( false, Less20.less20(23), "Expected value: false");
    }

    @Test
    public void testLess206() {
        assertEquals( false, Less20.less20(25), "Expected value: false");
    }

    @Test
    public void testLess207() {
        assertEquals( false, Less20.less20(30), "Expected value: false");
    }

    @Test
    public void testLess208() {
        assertEquals( false, Less20.less20(31), "Expected value: false");
    }

    @Test
    public void testLess209() {
        assertEquals( true, Less20.less20(58), "Expected value: true");
    }

    @Test
    public void testLess2010() {
        assertEquals( true, Less20.less20(59), "Expected value: true");
    }

    @Test
    public void testLess2011() {
        assertEquals( false, Less20.less20(60), "Expected value: false");
    }

    @Test
    public void testLess2012() {
        assertEquals( false, Less20.less20(61), "Expected value: false");
    }

    @Test
    public void testLess2013() {
        assertEquals( false, Less20.less20(62), "Expected value: false");
    }

    @Test
    public void testLess2014() {
        assertEquals( false, Less20.less20(1017), "Expected value: false");
    }

    @Test
    public void testLess2015() {
        assertEquals( true, Less20.less20(1018), "Expected value: true");
    }

    @Test
    public void testLess2016() {
        assertEquals( true, Less20.less20(1019), "Expected value: true");
    }

    @Test
    public void testLess2017() {
        assertEquals( false, Less20.less20(1020), "Expected value: false");
    }

    @Test
    public void testLess2018() {
        assertEquals( false, Less20.less20(1021), "Expected value: false");
    }

    @Test
    public void testLess2019() {
        assertEquals( false, Less20.less20(1022), "Expected value: false");
    }

    @Test
    public void testLess2020() {
        assertEquals( false, Less20.less20(1023), "Expected value: false");
    }

    @Test
    public void testLess2021() {
        assertEquals( false, Less20.less20(37), "Expected value: false");
    }
}

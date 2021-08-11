package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class More20Test {

    @Test
    public void testMore200() {
        assertEquals( false, More20.more20(20), "Expected value: false");
    }

    @Test
    public void testMore201() {
        assertEquals( true, More20.more20(21), "Expected value: true");
    }

    @Test
    public void testMore202() {
        assertEquals( true, More20.more20(22), "Expected value: true");
    }

    @Test
    public void testMore203() {
        assertEquals( false, More20.more20(23), "Expected value: false");
    }

    @Test
    public void testMore204() {
        assertEquals( false, More20.more20(25), "Expected value: false");
    }

    @Test
    public void testMore205() {
        assertEquals( false, More20.more20(30), "Expected value: false");
    }

    @Test
    public void testMore206() {
        assertEquals( false, More20.more20(31), "Expected value: false");
    }

    @Test
    public void testMore207() {
        assertEquals( false, More20.more20(59), "Expected value: false");
    }

    @Test
    public void testMore208() {
        assertEquals( false, More20.more20(60), "Expected value: false");
    }

    @Test
    public void testMore209() {
        assertEquals( true, More20.more20(61), "Expected value: true");
    }

    @Test
    public void testMore2010() {
        assertEquals( true, More20.more20(62), "Expected value: true");
    }

    @Test
    public void testMore2011() {
        assertEquals( false, More20.more20(1020), "Expected value: false");
    }

    @Test
    public void testMore2012() {
        assertEquals( true, More20.more20(1021), "Expected value: true");
    }

    @Test
    public void testMore2013() {
        assertEquals( false, More20.more20(1000), "Expected value: false");
    }

    @Test
    public void testMore2014() {
        assertEquals( true, More20.more20(1001), "Expected value: true");
    }

    @Test
    public void testMore2015() {
        assertEquals( false, More20.more20(50), "Expected value: false");
    }

    @Test
    public void testMore2016() {
        assertEquals( false, More20.more20(55), "Expected value: false");
    }

    @Test
    public void testMore2017() {
        assertEquals( false, More20.more20(40), "Expected value: false");
    }

    @Test
    public void testMore2018() {
        assertEquals( true, More20.more20(41), "Expected value: true");
    }

    @Test
    public void testMore2019() {
        assertEquals( false, More20.more20(39), "Expected value: false");
    }

    @Test
    public void testMore2020() {
        assertEquals( true, More20.more20(42), "Expected value: true");
    }
}

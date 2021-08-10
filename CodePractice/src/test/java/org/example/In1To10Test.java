package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class In1To10Test {
    @Test
    public void testIn1To100() {
        assertEquals( true, In1To10.in1To10(5, false), "Expected value: true");
    }

    @Test
    public void testIn1To101() {
        assertEquals( false, In1To10.in1To10(11, false), "Expected value: false");
    }

    @Test
    public void testIn1To102() {
        assertEquals( true, In1To10.in1To10(11, true), "Expected value: true");
    }

    @Test
    public void testIn1To103() {
        assertEquals( true, In1To10.in1To10(10, false), "Expected value: true");
    }

    @Test
    public void testIn1To104() {
        assertEquals( true, In1To10.in1To10(10, true), "Expected value: true");
    }

    @Test
    public void testIn1To105() {
        assertEquals( true, In1To10.in1To10(9, false), "Expected value: true");
    }

    @Test
    public void testIn1To106() {
        assertEquals( false, In1To10.in1To10(9, true), "Expected value: false");
    }

    @Test
    public void testIn1To107() {
        assertEquals( true, In1To10.in1To10(1, false), "Expected value: true");
    }

    @Test
    public void testIn1To108() {
        assertEquals( true, In1To10.in1To10(1, true), "Expected value: true");
    }

    @Test
    public void testIn1To109() {
        assertEquals( false, In1To10.in1To10(0, false), "Expected value: false");
    }

    @Test
    public void testIn1To1010() {
        assertEquals( true, In1To10.in1To10(0, true), "Expected value: true");
    }

    @Test
    public void testIn1To1011() {
        assertEquals( false, In1To10.in1To10(-1, false), "Expected value: false");
    }

    @Test
    public void testIn1To1012() {
        assertEquals( true, In1To10.in1To10(-1, true), "Expected value: true");
    }

    @Test
    public void testIn1To1013() {
        assertEquals( false, In1To10.in1To10(99, false), "Expected value: false");
    }

    @Test
    public void testIn1To1014() {
        assertEquals( true, In1To10.in1To10(-99, true), "Expected value: true");
    }
}

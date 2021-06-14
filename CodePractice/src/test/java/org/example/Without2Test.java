package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Without2Test {

    @Test
    public void testWithout0() {
        assertEquals("lloHe", Without2.without2("HelloHe"), "Expected value: lloHe");
    }

    @Test
    public void testWithout1() {
        assertEquals("HelloHi", Without2.without2("HelloHi"), "Expected value: HelloHi");
    }

    @Test
    public void testWithout2() {
        assertEquals("", Without2.without2("Hi"), "Expected value: ");
    }

    @Test
    public void testWithout3() {
        assertEquals("Chocolate", Without2.without2("Chocolate"), "Expected value: Chocolate");
    }

    @Test
    public void testWithout4() {
        assertEquals("x", Without2.without2("xxx"), "Expected value: x");
    }

    @Test
    public void testWithout5() {
        assertEquals("", Without2.without2("xx"), "Expected value: ");
    }

    @Test
    public void testWithout6() {
        assertEquals("x", Without2.without2("x"), "Expected value: x");
    }

    @Test
    public void testWithout7() {
        assertEquals("", Without2.without2(""), "Expected value: loHe");
    }

    @Test
    public void testWithout8() {
        assertEquals("Fruits", Without2.without2("Fruits"), "Expected value: Fruits");
    }
}

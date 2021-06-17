package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutX2Test {

    @Test
    public void testWithoutX20() {
        assertEquals("Hi", WithoutX2.withoutX2("xHi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX21() {
        assertEquals("Hi", WithoutX2.withoutX2("Hxi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX22() {
        assertEquals("Hi", WithoutX2.withoutX2("Hi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX23() {
        assertEquals("Hi", WithoutX2.withoutX2("xxHi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX24() {
        assertEquals("Hix", WithoutX2.withoutX2("Hix"), "Expected value: Hix");
    }

    @Test
    public void testWithoutX25() {
        assertEquals("axb", WithoutX2.withoutX2("xaxb"), "Expected value: axb");
    }

    @Test
    public void testWithoutX26() {
        assertEquals("", WithoutX2.withoutX2("xx"), "Expected value: ");
    }

    @Test
    public void testWithoutX27() {
        assertEquals("", WithoutX2.withoutX2("x"), "Expected value: ");
    }

    @Test
    public void testWithoutX28() {
        assertEquals("", WithoutX2.withoutX2(""), "Expected value: ");
    }

    @Test
    public void testWithoutX29() {
        assertEquals("Hello", WithoutX2.withoutX2("Hello"), "Expected value: Hello");
    }

    @Test
    public void testWithoutX210() {
        assertEquals("Hexllo", WithoutX2.withoutX2("Hexllo"), "Expected value: Hexllo");
    }

    @Test
    public void testWithoutX211() {
        assertEquals("Hxllo", WithoutX2.withoutX2("xHxllo"), "Expected value: Hxllo");
    }

}

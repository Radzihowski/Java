package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutXTest {

    @Test
    public void testWithoutX0() {
        assertEquals("Hi", WithoutX.withoutX("xHix"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX1() {
        assertEquals("Hi", WithoutX.withoutX("xHi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX2() {
        assertEquals("Hxi", WithoutX.withoutX("Hxix"), "Expected value: Hxi");
    }

    @Test
    public void testWithoutX3() {
        assertEquals("Hi", WithoutX.withoutX("Hi"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX4() {
        assertEquals("xHi", WithoutX.withoutX("xxHi"), "Expected value: xHi");
    }

    @Test
    public void testWithoutX5() {
        assertEquals("Hi", WithoutX.withoutX("Hix"), "Expected value: Hi");
    }

    @Test
    public void testWithoutX6() {
        assertEquals("axb", WithoutX.withoutX("xaxbx"), "Expected value: axb");
    }

    @Test
    public void testWithoutX7() {
        assertEquals("", WithoutX.withoutX("xx"), "Expected value: ");
    }

    @Test
    public void testWithoutX8() {
        assertEquals("", WithoutX.withoutX("x"), "Expected value: ");
    }

    @Test
    public void testWithoutX9() {
        assertEquals("", WithoutX.withoutX(""), "Expected value: ");
    }

    @Test
    public void testWithoutX10() {
        assertEquals("Hello", WithoutX.withoutX("Hello"), "Expected value: Hello");
    }

    @Test
    public void testWithoutX11() {
        assertEquals("Hexllo", WithoutX.withoutX("Hexllo"), "Expected value: Hexllo");
    }


}

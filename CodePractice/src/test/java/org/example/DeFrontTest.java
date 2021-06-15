package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeFrontTest {

    @Test
    public void testDeFront0() {
        assertEquals("llo", DeFront.deFront("Hello"), "Expected value: llo");
    }

    @Test
    public void testDeFront1() {
        assertEquals("va", DeFront.deFront("java"), "Expected value: va");
    }

    @Test
    public void testDeFront2() {
        assertEquals("aay", DeFront.deFront("away"), "Expected value: aay");
    }

    @Test
    public void testDeFront3() {
        assertEquals("ay", DeFront.deFront("axy"), "Expected value: ay");
    }

    @Test
    public void testDeFront4() {
        assertEquals("abc", DeFront.deFront("abc"), "Expected value: abc");
    }

    @Test
    public void testDeFront5() {
        assertEquals("by", DeFront.deFront("xby"), "Expected value: by");
    }

    @Test
    public void testDeFront6() {
        assertEquals("ab", DeFront.deFront("ab"), "Expected value: ab");
    }

    @Test
    public void testDeFront7() {
        assertEquals("a", DeFront.deFront("ax"), "Expected value: a");
    }

    @Test
    public void testDeFront8() {
        assertEquals("ab", DeFront.deFront("axb"), "Expected value: ab");
    }

    @Test
    public void testDeFront9() {
        assertEquals("aa", DeFront.deFront("aaa"), "Expected value: aa");
    }

    @Test
    public void testDeFront10() {
        assertEquals("bc", DeFront.deFront("xbc"), "Expected value: bc");
    }

    @Test
    public void testDeFront11() {
        assertEquals("bb", DeFront.deFront("bbb"), "Expected value: bb");
    }

    @Test
    public void testDeFront12() {
        assertEquals("zz", DeFront.deFront("bazz"), "Expected value: zz");
    }

    @Test
    public void testDeFront13() {
        assertEquals("", DeFront.deFront("ba"), "Expected value: ");
    }

    @Test
    public void testDeFront14() {
        assertEquals("abxyz", DeFront.deFront("abxyz"), "Expected value: abxyz");
    }

    @Test
    public void testDeFront15() {
        assertEquals("", DeFront.deFront("hi"), "Expected value: ");
    }

    @Test
    public void testDeFront16() {
        assertEquals("s", DeFront.deFront("his"), "Expected value: s");
    }

    @Test
    public void testDeFront17() {
        assertEquals("", DeFront.deFront("xz"), "Expected value: ");
    }

    @Test
    public void testDeFront18() {
        assertEquals("z", DeFront.deFront("zzz"), "Expected value: z");
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCatTest {

    @Test
    public void testMinCat0() {
        assertEquals("loHi", MinCat.minCat("Hello", "Hi"), "Expected value: loHi");
    }

    @Test
    public void testMinCat1() {
        assertEquals("ellojava", MinCat.minCat("Hello", "java"), "Expected value: ellojava");
    }

    @Test
    public void testMinCat2() {
        assertEquals("javaello", MinCat.minCat("java", "Hello"), "Expected value: javaello");
    }

    @Test
    public void testMinCat3() {
        assertEquals("cx", MinCat.minCat("abc", "x"), "Expected value: cx");
    }

    @Test
    public void testMinCat4() {
        assertEquals("javaello", MinCat.minCat("x", "abc"), "Expected value: javaello");
    }

    @Test
    public void testMinCat5() {
        assertEquals("", MinCat.minCat("abc", ""), "Expected value: ");
    }

}

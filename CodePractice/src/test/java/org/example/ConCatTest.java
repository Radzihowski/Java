package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConCatTest {

    @Test
    public void testConCat0() {
        assertEquals("abcat", ConCat.conCat("abc", "cat"), "Expected value: abcat");
    }

    @Test
    public void testConCat1() {
        assertEquals("dogcat", ConCat.conCat("dog", "cat"), "Expected value: dogcat");
    }

    @Test
    public void testConCat2() {
        assertEquals("abc", ConCat.conCat("abc", ""), "Expected value: abc");
    }

    @Test
    public void testConCat3() {
        assertEquals("cat", ConCat.conCat("", "cat"), "Expected value: cat");
    }

    @Test
    public void testConCat4() {
        assertEquals("pig", ConCat.conCat("pig", "g"), "Expected value: pig");
    }

    @Test
    public void testConCat5() {
        assertEquals("pigdoggy", ConCat.conCat("pig", "doggy"), "Expected value: pigdoggy");
    }
}

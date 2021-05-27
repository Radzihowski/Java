package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComboStringTest {

    @Test
    public void testComboString0() {
        assertEquals("hiHellohi", ComboString.comboString("Hello", "hi"), "Expected value: hiHellohi");
    }

    @Test
    public void testComboString1() {
        assertEquals("hiHellohi", ComboString.comboString("hi", "Hello"), "Expected value: hiHellohi");
    }

    @Test
    public void testComboString2() {
        assertEquals("baaab", ComboString.comboString("aaa", "b"), "Expected value: baaab");
    }

    @Test
    public void testComboString3() {
        assertEquals("baaab", ComboString.comboString("b", "aaa"), "Expected value: baaab");
    }

    @Test
    public void testComboString4() {
        assertEquals("aaa", ComboString.comboString("aaa", ""), "Expected value: aaa");
    }

    @Test
    public void testComboString5() {
        assertEquals("bb", ComboString.comboString("", "bb"), "Expected value: bb");
    }

    @Test
    public void testComboString6() {
        assertEquals("aaa1234aaa", ComboString.comboString("aaa", "1234"), "Expected value: aaa1234aaa");
    }

    @Test
    public void testComboString7() {
        assertEquals("bbaaabb", ComboString.comboString("aaa", "bb"), "Expected value: bbaaabb");
    }

    @Test
    public void testComboString8() {
        assertEquals("abba", ComboString.comboString("a", "bb"), "Expected value: abba");
    }

    @Test
    public void testComboString9() {
        assertEquals("abba", ComboString.comboString("bb", "a"), "Expected value: abba");
    }

    @Test
    public void testComboString10() {
        assertEquals("abxyzab", ComboString.comboString("xyz", "ab"), "Expected value: abxyzab");
    }
}

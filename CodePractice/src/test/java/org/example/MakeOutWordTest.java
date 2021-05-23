package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeOutWordTest {

    @Test
    public void testMakeOutWord() {
        assertEquals("<<Yay>>", MakeOutWord.makeOutWord("<<>>", "Yay"), "Expected value: <<Yay>>");
    }

    @Test
    public void testMakeOutWord1() {
        assertEquals("<<WooHoo>>", MakeOutWord.makeOutWord("<<>>", "WooHoo"), "Expected value: <<WooHoo>>");
    }

    @Test
    public void testMakeOutWord2() {
        assertEquals("[[word]]", MakeOutWord.makeOutWord("[[]]", "word"), "Expected value: [[word]]");
    }

    @Test
    public void testMakeOutWord3() {
        assertEquals("HHHellooo", MakeOutWord.makeOutWord("HHoo", "Hello"), "Expected value: HHHellooo");
    }

    @Test
    public void testMakeOutWord4() {
        assertEquals("abYAYyz", MakeOutWord.makeOutWord("abyz", "YAY"), "Expected value: abYAYyz");
    }
}

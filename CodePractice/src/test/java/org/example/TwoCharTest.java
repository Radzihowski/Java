package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoCharTest {

    @Test
    public void testTwoChar0() {
        assertEquals("ja", TwoChar.twoChar("java", 0), "Expected value: ja");
    }

    @Test
    public void testTwoChar1() {
        assertEquals("va", TwoChar.twoChar("java", 2), "Expected value: va");
    }

    @Test
    public void testTwoChar2() {
        assertEquals("ja", TwoChar.twoChar("java", 3), "Expected value: ja");
    }

    @Test
    public void testTwoChar3() {
        assertEquals("ja", TwoChar.twoChar("java", 4), "Expected value: ja");
    }

    @Test
    public void testTwoChar4() {
        assertEquals("ja", TwoChar.twoChar("java", -1), "Expected value: ja");
    }

    @Test
    public void testTwoChar5() {
        assertEquals("He", TwoChar.twoChar("Hello", 0), "Expected value: He");
    }

    @Test
    public void testTwoChar6() {
        assertEquals("el", TwoChar.twoChar("Hello", 1), "Expected value: el");
    }

    @Test
    public void testTwoChar7() {
        assertEquals("He", TwoChar.twoChar("Hello", 99), "Expected value: He");
    }

    @Test
    public void testTwoChar8() {
        assertEquals("lo", TwoChar.twoChar("Hello", 3), "Expected value: lo");
    }

    @Test
    public void testTwoChar9() {
        assertEquals("He", TwoChar.twoChar("Hello", 4), "Expected value: He");
    }

    @Test
    public void testTwoChar10() {
        assertEquals("He", TwoChar.twoChar("Hello", 5), "Expected value: He");
    }

    @Test
    public void testTwoChar11() {
        assertEquals("He", TwoChar.twoChar("Hello", -7), "Expected value: He");
    }

    @Test
    public void testTwoChar12() {
        assertEquals("He", TwoChar.twoChar("Hello", 6), "Expected value: He");
    }

    @Test
    public void testTwoChar13() {
        assertEquals("He", TwoChar.twoChar("Hello", -1), "Expected value: He");
    }

    @Test
    public void testTwoChar14() {
        assertEquals("ya", TwoChar.twoChar("yay", 0), "Expected value: ya");
    }

}

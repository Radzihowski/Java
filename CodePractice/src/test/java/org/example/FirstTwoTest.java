package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwoTest {

    @Test
    public void testFirstTwo() {
        assertEquals("He", FirstTwo.firstTwo("Hello"), "Expected value: He");
    }

    @Test
    public void testFirstTwo1() {
        assertEquals("ab", FirstTwo.firstTwo("abcdefg"), "Expected value: ab");
    }

    @Test
    public void testFirstTwo2() {
        assertEquals("ab", FirstTwo.firstTwo("ab"), "Expected value: ab");
    }

    @Test
    public void testFirstTwo3() {
        assertEquals("a", FirstTwo.firstTwo("a"), "Expected value: a");
    }

    @Test
    public void testFirstTwo4() {
        assertEquals("", FirstTwo.firstTwo(""), "Expected value: ");
    }

    @Test
    public void testFirstTwo5() {
        assertEquals("Ki", FirstTwo.firstTwo("Ki"), "Expected value: Ki");
    }

    @Test
    public void testFirstTwo6() {
        assertEquals("hi", FirstTwo.firstTwo("hi"), "Expected value: hi");
    }

    @Test
    public void testFirstTwo7() {
        assertEquals("hi", FirstTwo.firstTwo("hiya"), "Expected value: hi");
    }
}

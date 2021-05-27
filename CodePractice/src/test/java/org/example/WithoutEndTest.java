package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutEndTest {

    @Test
    public void testWithoutEnd() {
        assertEquals("ell", WithoutEnd.withoutEnd("Hello"), "Expected value: 1");
    }

    @Test
    public void testWithoutEnd1() {
        assertEquals("av", WithoutEnd.withoutEnd("java"), "Expected value: av");
    }

    @Test
    public void testWithoutEnd2() {
        assertEquals("odin", WithoutEnd.withoutEnd("coding"), "Expected value: odin");
    }

    @Test
    public void testWithoutEnd3() {
        assertEquals("od", WithoutEnd.withoutEnd("code"), "Expected value: od");
    }

    @Test
    public void testWithoutEnd4() {
        assertEquals("", WithoutEnd.withoutEnd("ab"), "Expected value: ");
    }

    @Test
    public void testWithoutEnd5() {
        assertEquals("hocolate", WithoutEnd.withoutEnd("Chocolate!"), "Expected value: hocolate");
    }

    @Test
    public void testWithoutEnd6() {
        assertEquals("itte", WithoutEnd.withoutEnd("kitten"), "Expected value: itte");
    }

    @Test
    public void testWithoutEnd7() {
        assertEquals("ooho", WithoutEnd.withoutEnd("woohoo"), "Expected value: ooho");
    }
}

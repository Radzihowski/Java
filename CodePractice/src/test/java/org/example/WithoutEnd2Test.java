package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutEnd2Test {

    @Test
    public void testWithoutEnd20() {
        assertEquals("ell", WithoutEnd2.withoutEnd2("Hello"), "Expected value: ell");
    }

    @Test
    public void testWithoutEnd21() {
        assertEquals("b", WithoutEnd2.withoutEnd2("abc"), "Expected value: b");
    }

    @Test
    public void testWithoutEnd22() {
        assertEquals("", WithoutEnd2.withoutEnd2("ab"), "Expected value: ");
    }

    @Test
    public void testWithoutEnd23() {
        assertEquals("", WithoutEnd2.withoutEnd2("a"), "Expected value: ");
    }

    @Test
    public void testWithoutEnd24() {
        assertEquals("old", WithoutEnd2.withoutEnd2("coldy"), "Expected value: old");
    }

    @Test
    public void testWithoutEnd25() {
        assertEquals("ell", WithoutEnd2.withoutEnd2("Hello"), "Expected value: ell");
    }

    @Test
    public void testWithoutEnd26() {
        assertEquals("ava cod", WithoutEnd2.withoutEnd2("java code"), "Expected value: ava cod");
    }

}

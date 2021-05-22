package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba() {
        assertEquals("HiByeByeHi", MakeAbba.makeAbba("Hi", "Bye"), "Expected value: HiByeByeHi");
    }

    @Test
    public void testMakeAbba1() {
        assertEquals("YoAliceAliceYo", MakeAbba.makeAbba("Yo", "Alice"), "Expected value: YoAliceAliceYo");
    }

    @Test
    public void testMakeAbba2() {
        assertEquals("WhatUpUpWhat", MakeAbba.makeAbba("What", "Up"), "Expected value: WhatUpUpWhat");
    }

    @Test
    public void testMakeAbba3() {
        assertEquals("aaabbbbbbaaa", MakeAbba.makeAbba("aaa", "bbb"), "Expected value: aaabbbbbbaaa");
    }

    @Test
    public void testMakeAbba4() {
        assertEquals("xyyx", MakeAbba.makeAbba("x", "y"), "Expected value: xyyx");
    }

    @Test
    public void testMakeAbba5() {
        assertEquals("xx", MakeAbba.makeAbba("x", ""), "Expected value: xx");
    }

    @Test
    public void testMakeAbba6() {
        assertEquals("yy", MakeAbba.makeAbba("", "y"), "Expected value: yy");
    }

    @Test
    public void testMakeAbba7() {
        assertEquals("BoYaYaBo", MakeAbba.makeAbba("Bo", "Ya"), "Expected value: BoYaYaBo");
    }

    @Test
    public void testMakeAbba8() {
        assertEquals("YaYaYaYa", MakeAbba.makeAbba("Ya", "Ya"), "Expected value: YaYaYaYa");
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrontAgainTest {

    @Test
    public void testFrontAgain0() {
        assertEquals(true, FrontAgain.frontAgain("edited"), "Expected value: true");
    }

    @Test
    public void testFrontAgain1() {
        assertEquals(false, FrontAgain.frontAgain("edit"), "Expected value: false");
    }

    @Test
    public void testFrontAgain2() {
        assertEquals(true, FrontAgain.frontAgain("ed"), "Expected value: true");
    }

    @Test
    public void testFrontAgain3() {
        assertEquals(true, FrontAgain.frontAgain("jj"), "Expected value: true");
    }

    @Test
    public void testFrontAgain4() {
        assertEquals(true, FrontAgain.frontAgain("jjj"), "Expected value: true");
    }

    @Test
    public void testFrontAgain5() {
        assertEquals(true, FrontAgain.frontAgain("jjjj"), "Expected value: true");
    }

    @Test
    public void testFrontAgain6() {
        assertEquals(true, FrontAgain.frontAgain("jjj"), "Expected value: true");
    }

    @Test
    public void testFrontAgain7() {
        assertEquals(false, FrontAgain.frontAgain("x"), "Expected value: false");
    }

    @Test
    public void testFrontAgain8() {
        assertEquals(false, FrontAgain.frontAgain(""), "Expected value: false");
    }

    @Test
    public void testFrontAgain9() {
        assertEquals(false, FrontAgain.frontAgain("java"), "Expected value: false");
    }

    @Test
    public void testFrontAgain10() {
        assertEquals(true, FrontAgain.frontAgain("javaja"), "Expected value: true");
    }
}

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NTwiceTest {

    @Test
    public void testNTwice0() {
        assertEquals("Helo", NTwice.nTwice("Hello", 2), "Expected value: Helo");
    }

    @Test
    public void testNTwice1() {
        assertEquals("Choate", NTwice.nTwice("Chocolate", 3), "Expected value: Choate");
    }

    @Test
    public void testNTwice2() {
        assertEquals("Ce", NTwice.nTwice("Chocolate", 1), "Expected value: Ce");
    }

    @Test
    public void testNTwice3() {
        assertEquals("", NTwice.nTwice("Chocolate", 0), "Expected value: ");
    }

    @Test
    public void testNTwice4() {
        assertEquals("Hellello", NTwice.nTwice("Hello", 4), "Expected value: Hellello");
    }

    @Test
    public void testNTwice5() {
        assertEquals("CodeCode", NTwice.nTwice("Code", 4), "Expected value: CodeCode");
    }

    @Test
    public void testNTwice6() {
        assertEquals("Code", NTwice.nTwice("Code", 2), "Expected value: Code");
    }

}

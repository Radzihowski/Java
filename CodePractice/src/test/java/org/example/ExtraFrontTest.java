package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraFrontTest {

    @Test
    public void testExtraFront0() {
        assertEquals("HeHeHe", ExtraFront.extraFront("Hello"), "Expected value: HeHeHe");
    }

    @Test
    public void testExtraFront1() {
        assertEquals("ababab", ExtraFront.extraFront("ab"), "Expected value: ababab");
    }

    @Test
    public void testExtraFront2() {
        assertEquals("HHH", ExtraFront.extraFront("H"), "Expected value: HHH");
    }

    @Test
    public void testExtraFront3() {
        assertEquals("", ExtraFront.extraFront(""), "Expected value: ");
    }

    @Test
    public void testExtraFront4() {
        assertEquals("CaCaCa", ExtraFront.extraFront("Candy"), "Expected value: CaCaCa");
    }

    @Test
    public void testExtraFront5() {
        assertEquals("CoCoCo", ExtraFront.extraFront("Code"), "Expected value: CoCoCo");
    }


}

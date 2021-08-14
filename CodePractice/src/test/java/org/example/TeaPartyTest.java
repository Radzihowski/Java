package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeaPartyTest {

    @Test
    public void testTeaParty0() {
        assertEquals( 1, TeaParty.teaParty(6, 8), "Expected value: 1");
    }

    @Test
    public void testTeaParty1() {
        assertEquals( 0, TeaParty.teaParty(3, 8), "Expected value: 0");
    }

    @Test
    public void testTeaParty2() {
        assertEquals( 2, TeaParty.teaParty(20, 6), "Expected value: 2");
    }

    @Test
    public void testTeaParty3() {
        assertEquals( 2, TeaParty.teaParty(12, 6), "Expected value: 2");
    }

    @Test
    public void testTeaParty4() {
        assertEquals( 1, TeaParty.teaParty(11, 6), "Expected value: 1");
    }

    @Test
    public void testTeaParty5() {
        assertEquals( 0, TeaParty.teaParty(11, 4), "Expected value: 0");
    }

    @Test
    public void testTeaParty6() {
        assertEquals( 0, TeaParty.teaParty(4, 5), "Expected value: 0");
    }

    @Test
    public void testTeaParty7() {
        assertEquals( 1, TeaParty.teaParty(5, 5), "Expected value: 1");
    }

    @Test
    public void testTeaParty8() {
        assertEquals( 1, TeaParty.teaParty(6, 6), "Expected value: 1");
    }

    @Test
    public void testTeaParty9() {
        assertEquals( 2, TeaParty.teaParty(5, 10), "Expected value: 2");
    }

    @Test
    public void testTeaParty10() {
        assertEquals( 1, TeaParty.teaParty(5, 9), "Expected value: 1");
    }

    @Test
    public void testTeaParty11() {
        assertEquals( 0, TeaParty.teaParty(10, 4), "Expected value: 0");
    }

    @Test
    public void testTeaParty12() {
        assertEquals( 2, TeaParty.teaParty(10, 20), "Expected value: 2");
    }
}

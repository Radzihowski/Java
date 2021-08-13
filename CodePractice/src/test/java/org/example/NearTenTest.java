package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearTenTest {

    @Test
    public void testNearTen0() {
        assertEquals( true, NearTen.nearTen(12), "Expected value: true");
    }

    @Test
    public void testNearTen1() {
        assertEquals( false, NearTen.nearTen(17), "Expected value: false");
    }

    @Test
    public void testNearTen2() {
        assertEquals( true, NearTen.nearTen(19), "Expected value: true");
    }

    @Test
    public void testNearTen3() {
        assertEquals( true, NearTen.nearTen(31), "Expected value: true");
    }

    @Test
    public void testNearTen4() {
        assertEquals( false, NearTen.nearTen(6), "Expected value: false");
    }

    @Test
    public void testNearTen5() {
        assertEquals( true, NearTen.nearTen(10), "Expected value: true");
    }

    @Test
    public void testNearTen6() {
        assertEquals( true, NearTen.nearTen(11), "Expected value: true");
    }

    @Test
    public void testNearTen7() {
        assertEquals( true, NearTen.nearTen(21), "Expected value: true");
    }

    @Test
    public void testNearTen8() {
        assertEquals( true, NearTen.nearTen(22), "Expected value: true");
    }

    @Test
    public void testNearTen9() {
        assertEquals( false, NearTen.nearTen(23), "Expected value: false");
    }

    @Test
    public void testNearTen10() {
        assertEquals( false, NearTen.nearTen(54), "Expected value: false");
    }

    @Test
    public void testNearTen11() {
        assertEquals( false, NearTen.nearTen(155), "Expected value: false");
    }

    @Test
    public void testNearTen12() {
        assertEquals( true, NearTen.nearTen(158), "Expected value: true");
    }

    @Test
    public void testNearTen13() {
        assertEquals( false, NearTen.nearTen(3), "Expected value: false");
    }

    @Test
    public void testNearTen14() {
        assertEquals( true, NearTen.nearTen(1), "Expected value: true");
    }

}

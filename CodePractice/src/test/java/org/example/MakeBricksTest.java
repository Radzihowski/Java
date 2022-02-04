package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeBricksTest {

    @Test
    public void testMakeBricks0() {
        assertEquals(true, MakeBricks.makeBricks(3, 1, 8), "Expected true");
    }

    @Test
    public void testMakeBricks1() {
        assertEquals(false, MakeBricks.makeBricks(3, 1, 9), "Expected false");
    }

    @Test
    public void testMakeBricks2() {
        assertEquals(true, MakeBricks.makeBricks(3, 2, 10), "Expected true");
    }

    @Test
    public void testMakeBricks3() {
        assertEquals(true, MakeBricks.makeBricks(3, 2, 8), "Expected true");
    }

    @Test
    public void testMakeBricks4() {
        assertEquals(false, MakeBricks.makeBricks(3, 2, 9), "Expected false");
    }

    @Test
    public void testMakeBricks5() {
        assertEquals(true, MakeBricks.makeBricks(6, 1, 11), "Expected true");
    }

    @Test
    public void testMakeBricks6() {
        assertEquals(true, MakeBricks.makeBricks(6, 0, 11), "Expected true");
    }

    @Test
    public void testMakeBricks7() {
        assertEquals(true, MakeBricks.makeBricks(1, 4, 11), "Expected true");
    }

    @Test
    public void testMakeBricks8() {
        assertEquals(true, MakeBricks.makeBricks(0, 3, 10), "Expected true");
    }

    @Test
    public void testMakeBricks9() {
        assertEquals(false, MakeBricks.makeBricks(1, 4, 12), "Expected false");
    }

    @Test
    public void testMakeBricks10() {
        assertEquals(true, MakeBricks.makeBricks(3, 1, 7), "Expected true");
    }

    @Test
    public void testMakeBricks11() {
        assertEquals(false, MakeBricks.makeBricks(1, 1, 7), "Expected false");
    }

    @Test
    public void testMakeBricks12() {
        assertEquals(true, MakeBricks.makeBricks(2, 1, 7), "Expected true");
    }

    @Test
    public void testMakeBricks13() {
        assertEquals(true, MakeBricks.makeBricks(7, 1, 11), "Expected true");
    }

    @Test
    public void testMakeBricks14() {
        assertEquals(true, MakeBricks.makeBricks(7, 1, 8), "Expected true");
    }

    @Test
    public void testMakeBricks15() {
        assertEquals(false, MakeBricks.makeBricks(7, 1, 13), "Expected false");
    }

    @Test
    public void testMakeBricks16() {
        assertEquals(true, MakeBricks.makeBricks(43, 1, 46), "Expected true");
    }

    @Test
    public void testMakeBricks17() {
        assertEquals(false, MakeBricks.makeBricks(40, 1, 46), "Expected false");
    }

    @Test
    public void testMakeBricks18() {
        assertEquals(true, MakeBricks.makeBricks(40, 2, 47), "Expected true");
    }

    @Test
    public void testMakeBricks19() {
        assertEquals(true, MakeBricks.makeBricks(40, 2, 50), "Expected true");
    }

    @Test
    public void testMakeBricks20() {
        assertEquals(false, MakeBricks.makeBricks(40, 2, 52), "Expected false");
    }

    @Test
    public void testMakeBricks21() {
        assertEquals(false, MakeBricks.makeBricks(22, 2, 33), "Expected false");
    }

    @Test
    public void testMakeBricks22() {
        assertEquals(true, MakeBricks.makeBricks(0, 2, 10), "Expected true");
    }

    @Test
    public void testMakeBricks23() {
        assertEquals(true, MakeBricks.makeBricks(1000000, 1000, 1000100), "Expected true");
    }

    @Test
    public void testMakeBricks24() {
        assertEquals(false, MakeBricks.makeBricks(2, 1000000, 100003), "Expected false");
    }

    @Test
    public void testMakeBricks25() {
        assertEquals(true, MakeBricks.makeBricks(20, 0, 19), "Expected true");
    }

    @Test
    public void testMakeBricks26() {
        assertEquals(false, MakeBricks.makeBricks(20, 0, 21), "Expected false");
    }

    @Test
    public void testMakeBricks27() {
        assertEquals(false, MakeBricks.makeBricks(20, 4, 51), "Expected false");
    }

    @Test
    public void testMakeBricks28() {
        assertEquals(true, MakeBricks.makeBricks(20, 4, 39), "Expected true");
    }

}

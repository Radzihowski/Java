package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFashionTest {

    @Test
    public void testDateFashion0() {
        assertEquals( 2, DateFashion.dateFashion(5, 10), "Expected value: 2");
    }

    @Test
    public void testDateFashion1() {
        assertEquals( 0, DateFashion.dateFashion(5, 2), "Expected value: 0");
    }

    @Test
    public void testDateFashion2() {
        assertEquals( 1, DateFashion.dateFashion(5, 5), "Expected value: 1");
    }

    @Test
    public void testDateFashion3() {
        assertEquals( 1, DateFashion.dateFashion(3, 3), "Expected value: 1");
    }

    @Test
    public void testDateFashion4() {
        assertEquals( 0, DateFashion.dateFashion(10, 2), "Expected value: 0");
    }

    @Test
    public void testDateFashion5() {
        assertEquals( 0, DateFashion.dateFashion(2, 9), "Expected value: 0");
    }

    @Test
    public void testDateFashion6() {
        assertEquals( 2, DateFashion.dateFashion(9, 9), "Expected value: 2");
    }

    @Test
    public void testDateFashion7() {
        assertEquals( 2, DateFashion.dateFashion(10, 5), "Expected value: 2");
    }

    @Test
    public void testDateFashion8() {
        assertEquals( 0, DateFashion.dateFashion(2, 2), "Expected value: 0");
    }

    @Test
    public void testDateFashion9() {
        assertEquals( 1, DateFashion.dateFashion(3, 7), "Expected value: 1");
    }

    @Test
    public void testDateFashion10() {
        assertEquals( 0, DateFashion.dateFashion(2, 7), "Expected value: 0");
    }

    @Test
    public void testDateFashion11() {
        assertEquals( 0, DateFashion.dateFashion(6, 2), "Expected value: 0");
    }

}

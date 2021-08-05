package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquirrelPlayTest {

    @Test
    public void testSquirrelPlay0() {
        assertEquals( true, SquirrelPlay.squirrelPlay(70, false), "Expected value: true");
    }

    @Test
    public void testSquirrelPlay1() {
        assertEquals( false, SquirrelPlay.squirrelPlay(95, false), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay2() {
        assertEquals( true, SquirrelPlay.squirrelPlay(95, true), "Expected value: true");
    }

    @Test
    public void testSquirrelPlay3() {
        assertEquals( true, SquirrelPlay.squirrelPlay(90, false), "Expected value: true");
    }

    @Test
    public void testSquirrelPlay4() {
        assertEquals( true, SquirrelPlay.squirrelPlay(90, true), "Expected value: true");
    }

    @Test
    public void testSquirrelPlay5() {
        assertEquals( false, SquirrelPlay.squirrelPlay(50, false), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay6() {
        assertEquals( false, SquirrelPlay.squirrelPlay(50, true), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay7() {
        assertEquals( false, SquirrelPlay.squirrelPlay(100, false), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay8() {
        assertEquals( true, SquirrelPlay.squirrelPlay(100, true), "Expected value: true");
    }

    @Test
    public void testSquirrelPlay9() {
        assertEquals( false, SquirrelPlay.squirrelPlay(105, true), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay10() {
        assertEquals( false, SquirrelPlay.squirrelPlay(59, false), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay11() {
        assertEquals( false, SquirrelPlay.squirrelPlay(59, true), "Expected value: false");
    }

    @Test
    public void testSquirrelPlay12() {
        assertEquals( true, SquirrelPlay.squirrelPlay(60, false), "Expected value: true");
    }
}

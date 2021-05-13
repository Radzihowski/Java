package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringYakTest {

    @Test
    public void testGetInt() {
        assertEquals(2, StringYak.getInt(), "Expected value 1");
    }

}

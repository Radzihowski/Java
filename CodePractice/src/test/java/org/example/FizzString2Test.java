package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzString2Test {

    @Test
    public void testFizzString20() {
        assertEquals( "1!", FizzString2.fizzString2(1), "Expected value: 1!");
    }

    @Test
    public void testFizzString21() {
        assertEquals( "2!", FizzString2.fizzString2(2), "Expected value: 2!");
    }

    @Test
    public void testFizzString22() {
        assertEquals( "Fizz!", FizzString2.fizzString2(3), "Expected value: Fizz!");
    }

    @Test
    public void testFizzString23() {
        assertEquals( "4!", FizzString2.fizzString2(4), "Expected value: 4!");
    }

    @Test
    public void testFizzString24() {
        assertEquals( "Buzz!", FizzString2.fizzString2(5), "Expected value: Buzz!");
    }

    @Test
    public void testFizzString25() {
        assertEquals( "Fizz!", FizzString2.fizzString2(6), "Expected value: Fizz!");
    }

    @Test
    public void testFizzString26() {
        assertEquals( "7!", FizzString2.fizzString2(7), "Expected value: 7!");
    }

    @Test
    public void testFizzString27() {
        assertEquals( "8!", FizzString2.fizzString2(8), "Expected value: 8!");
    }

    @Test
    public void testFizzString28() {
        assertEquals( "Fizz!", FizzString2.fizzString2(9), "Expected value: Fizz!");
    }

    @Test
    public void testFizzString29() {
        assertEquals( "FizzBuzz!", FizzString2.fizzString2(15), "Expected value: FizzBuzz!");
    }

    @Test
    public void testFizzString210() {
        assertEquals( "16!", FizzString2.fizzString2(16), "Expected value: 16!");
    }

    @Test
    public void testFizzString211() {
        assertEquals( "Fizz!", FizzString2.fizzString2(18), "Expected value: Fizz!");
    }

    @Test
    public void testFizzString212() {
        assertEquals( "19!", FizzString2.fizzString2(19), "Expected value: 19!");
    }

    @Test
    public void testFizzString213() {
        assertEquals( "Fizz!", FizzString2.fizzString2(21), "Expected value: Fizz!");
    }

    @Test
    public void testFizzString214() {
        assertEquals( "44!", FizzString2.fizzString2(44), "Expected value: 44!");
    }

    @Test
    public void testFizzString215() {
        assertEquals( "FizzBuzz!", FizzString2.fizzString2(45), "Expected value: FizzBuzz!");
    }

    @Test
    public void testFizzString216() {
        assertEquals( "Buzz!", FizzString2.fizzString2(100), "Expected value: Buzz!");
    }
}

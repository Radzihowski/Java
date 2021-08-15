package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzStringTest {

    @Test
    public void testFizzString0() {
        assertEquals( "Fizz", FizzString.fizzString("fig"), "Expected value: Fizz");
    }

    @Test
    public void testFizzString1() {
        assertEquals( "Buzz", FizzString.fizzString("dib"), "Expected value: Buzz");
    }

    @Test
    public void testFizzString2() {
        assertEquals( "FizzBuzz", FizzString.fizzString("fib"), "Expected value: FizzBuzz");
    }

    @Test
    public void testFizzString3() {
        assertEquals( "abc", FizzString.fizzString("abc"), "Expected value: abc");
    }

    @Test
    public void testFizzString4() {
        assertEquals( "Fizz", FizzString.fizzString("fooo"), "Expected value: Fizz");
    }

    @Test
    public void testFizzString5() {
        assertEquals( "booo", FizzString.fizzString("booo"), "Expected value: booo");
    }

    @Test
    public void testFizzString6() {
        assertEquals( "Buzz", FizzString.fizzString("ooob"), "Expected value: Buzz");
    }

    @Test
    public void testFizzString7() {
        assertEquals( "FizzBuzz", FizzString.fizzString("fooob"), "Expected value: FizzBuzz");
    }

    @Test
    public void testFizzString8() {
        assertEquals( "Fizz", FizzString.fizzString("f"), "Expected value: Fizz");
    }

    @Test
    public void testFizzString9() {
        assertEquals( "Buzz", FizzString.fizzString("b"), "Expected value: Buzz");
    }

    @Test
    public void testFizzString10() {
        assertEquals( "Buzz", FizzString.fizzString("abcb"), "Expected value: Buzz");
    }

    @Test
    public void testFizzString11() {
        assertEquals( "Hello", FizzString.fizzString("Hello"), "Expected value: Hello");
    }

    @Test
    public void testFizzString12() {
        assertEquals( "Buzz", FizzString.fizzString("Hellob"), "Expected value: Buzz");
    }

    @Test
    public void testFizzString13() {
        assertEquals( "af", FizzString.fizzString("af"), "Expected value: af");
    }

    @Test
    public void testFizzString14() {
        assertEquals( "bf", FizzString.fizzString("bf"), "Expected value: bf");
    }

    @Test
    public void testFizzString15() {
        assertEquals( "FizzBuzz", FizzString.fizzString("fb"), "Expected value: FizzBuzz");
    }
}

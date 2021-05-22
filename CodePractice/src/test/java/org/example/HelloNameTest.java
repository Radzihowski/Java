package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        assertEquals("Hello Bob!", HelloName.helloName("Bob"), "Expected value: Hello Bob!");
    }

    @Test
    public void testHelloName1() {
        assertEquals("Hello Alice!", HelloName.helloName("Alice"), "Expected value: Hello Alice!");
    }

    @Test
    public void testHelloName2() {
        assertEquals("Hello X!", HelloName.helloName("X"), "Expected value: Hello X!");
    }

    @Test
    public void testHelloName3(){
        assertEquals("Hello Dolly!", HelloName.helloName("Dolly"), "Expected value: Hello Dolly!");
    }

    @Test
    public void testHelloName4(){
        assertEquals("Hello Alpha!", HelloName.helloName("Alpha"), "Expected value: Hello Alpha!");
    }

    @Test
    public void testHelloName5(){
        assertEquals("Hello Omega!", HelloName.helloName("Omega"), "Expected value: Hello Omega!");
    }

    @Test
    public void testHelloName6(){
        assertEquals("Hello Goodbye!", HelloName.helloName("Goodbye"), "Expected value: Hello Goodbye!");
    }

    @Test
    public void testHelloName7(){
        assertEquals("Hello ho ho ho!", HelloName.helloName("ho ho ho"), "Expected value: Hello ho ho ho!");
    }

    @Test
    public void testHelloName8(){
        assertEquals("Hello xyz!!", HelloName.helloName("xyz!"), "Expected value: Hello xyz!!");
    }

    @Test
    public void testHelloName9(){
        assertEquals("Hello Hello!", HelloName.helloName("Hello"), "Expected value: Hello Hello!");
    }

}

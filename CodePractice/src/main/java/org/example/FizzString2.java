/*
Given an int n, return the string form of the number followed by "!".
So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number,
and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
fizzString2(1) → "1!"
fizzString2(2) → "2!"
fizzString2(3) → "Fizz!"
 */
package org.example;

public class FizzString2 {
    public static String fizzString2(int n) {
        boolean fizz = n % 3 == 0;
        boolean buzz = n % 5 == 0;
        if ( fizz && buzz ) {
            return "FizzBuzz!";
        } else if ( fizz ) {
            return  "Fizz!";
        } else if ( buzz ) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }
}

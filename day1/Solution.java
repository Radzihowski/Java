package com.company.day1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int userInt = 0;
        double userDouble = 0.0;
        String userS = "";

        /* Read and save an integer, double, and String to your variables.*/

        userInt = scan.nextInt();
        userDouble = scan.nextDouble();
        userS = scan.toString();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        System.out.println(i + userInt);
        System.out.println(d + userDouble);
        System.out.println(userS + "is ths best place to learn and practice coding");

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
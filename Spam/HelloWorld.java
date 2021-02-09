package Spam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // open scanner
        String s = scan.nextLine(); // read the next token and save it to 's'
        scan.close(); // close scanner
        System.out.println("Hello, World.");
        System.out.println(s); // print 's' to System.out, followed by a new line
    }
}



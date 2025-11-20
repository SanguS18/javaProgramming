package com.jsp.operators;

public class Operators1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));
        System.out.println("Modulus: " + (b % a));

        // Relational Operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        //unary Operators
        int c = 5;
        System.out.println("Unary plus: " + (+c));
        System.out.println("Unary minus: " + (-c));
        System.out.println("Increment: " + (++c));
        System.out.println("Decrement: " + (--c));

        // Assignment Operators
        int d = 15;
        d += 5;
        System.out.println("d after += 5: " + d);
        d -= 3;
        System.out.println("d after -= 3: " + d);
        d *= 2;
        System.out.println("d after *= 2: " + d);
        d /= 4;
        System.out.println("d after /= 4: " + d);
        d %= 3;
        System.out.println("d after %= 3: " + d);

        // Bitwise Operators
        int e = 6;  // 110 in binary
        int f = 3;  // 011 in binary
        System.out.println("e & f: " + (e & f)); // 010
        System.out.println("e | f: " + (e | f)); // 111
        System.out.println("e ^ f: " + (e ^ f)); // 101
        System.out.println("~e: " + (~e));       // 001
        System.out.println("e << 1: " + (e << 1)); // 1100
        System.out.println("e >> 1: " + (e >> 1)); // 011

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // instanceof Operator
        String str = "Hello, World!";
        boolean result = str instanceof String;
        System.out.println("str is an instance of String: " + result);

       
    }
}

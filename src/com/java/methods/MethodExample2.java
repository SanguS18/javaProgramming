package com.java.methods;

public class MethodExample2 
{
    public static void main(String[] args) {
        System.out.println("Program started");
        help();
        help();
        help();
        System.out.println("Program ended");
    }
    static void help() {
        System.out.println("Help method called - Providing help...");
    }
}

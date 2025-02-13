package com.example;

public class CodeQualityTest {
    
    public static boolean checkPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) { // Inefficient loop, should be i <= sqrt(x)
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 17;
        boolean result = checkPrime(n);
        
        if (result == true) { // Bad practice: should be "if (result)"
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
        
        // Poor error handling example
        try {
            int val = Integer.parseInt("ABC"); // Will throw an exception
            System.out.println("Parsed Value: " + val);
        } catch (Exception e) { // Catching generic Exception, bad practice
            System.out.println("Something went wrong");
        }
    }
}

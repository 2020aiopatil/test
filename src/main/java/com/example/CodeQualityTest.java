package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

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
        
        // Security issue: Reading file without proper validation
        try {
            File file = new File("/etc/passwd"); // Potential security vulnerability
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            fis.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

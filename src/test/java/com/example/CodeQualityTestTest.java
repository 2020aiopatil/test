package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodeQualityTestTest {
    
    @Test
    public void testCheckPrime() {
        assertTrue(CodeQualityTest.checkPrime(17));
        assertFalse(CodeQualityTest.checkPrime(4));
    }
}

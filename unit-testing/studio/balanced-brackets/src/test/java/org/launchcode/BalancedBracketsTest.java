package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @Test
    public void testCorrectlyBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Nested]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("La[un]ch[Co]de"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void testIncorrectlyBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[La[unc]hCo[de"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]Extra]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Nested]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // Additional test cases can be added here as needed
}

package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void stringWithTwoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void stringWithOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringWithUnbalancedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }

    @Test
    public void stringWithUnMatchedOpeningBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Co[de"));
    }

    @Test
    public void stringWithUnMatchedClosingBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Co]de"));
    }

    @Test
    public void stringWithIncorrectlyFacingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithIncorrectlyFacingEndBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void stringWithManyBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]]"));
    }
}
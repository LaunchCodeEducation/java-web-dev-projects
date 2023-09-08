package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void onlyFirstBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlySecondBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsWithLetterInsideBalancedReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[g]"));
    }

    @Test
    public void twoOpeningAndOneClosingAssertFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void twoClosingAndOneOpeningAssertFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void flippedBracketsShouldFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoBracketsFlippedWithCharacters() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]8d["));
    }

    @Test
    public void firstBracketCurly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));

    }

    @Test
    public void secondBracketCurly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void nestedBracketsBalancedTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("str[ing]"));
    }
}
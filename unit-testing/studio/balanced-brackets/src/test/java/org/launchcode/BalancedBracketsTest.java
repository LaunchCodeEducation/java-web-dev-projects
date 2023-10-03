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
    public void stringThatStartsAndEndsWithBracketReturnsTrue(){
        BalancedBrackets brackets = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ another sentense]"));
    }
    @Test
    public void brachektInMiddleOfStringAndEndOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Test [Code]"));
    }

    @Test
    public void openningAndClosingBracketsAtTheStartOfAStringReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]  Launc hCode"));
    }

    @Test
    public void openingBracketWithNoClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void closingBracketBeforeOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void closingThenOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
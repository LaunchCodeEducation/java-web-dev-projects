package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    // POSITIVE TEST CASES

    // Sample test from instructions, refactored to use constructor with message
    @Test
    public void singlePairOfBrackets() {
        String message = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "balanced brackets among other characters returns true";
        String testData = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "three nested pairs of brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }


    // NEGATIVE TEST CASES

    @Test
    public void singleOpeningBracket() {
        String message = "a single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleClosingBracket() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void reversedBrackets() {
        String message = "a reversed sets of brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleBracketWithOtherCharacters() {
        String message = "a single opening bracket with other characters returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void unbalancedBracketsAmongOtherCharacters() {
        String message = "unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void mixOfUnbalancedBrackets() {
        String message = "a mix of unbalanced brackets returns false";
        String testData = "[[]][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }


    // EDGE CASES

    @Test
    public void stringOfCharactersWithoutBrackets() {
        String message = "a string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void emptyString() {
        String message = "an empty string returns true";
        String testData = "";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
}
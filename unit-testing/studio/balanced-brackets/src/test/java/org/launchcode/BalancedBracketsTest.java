package org.launchcode;

import org.junit.jupiter.api.Test;

import javax.sql.rowset.BaseRowSet;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: emptyTest to assert gradle build is good
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TODO: Assert there is an even number of opening and closing braces
    @Test
    public void evenNumberOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[la]u[nch]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //TODO: assert if there are more opening braces than closing braces
    @Test
    public void closingBracesMissing(){

        assertTrue(BalancedBrackets.moreOpeningOrClosingBraces("[string]") <= 0);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }

    //TODO: assert if there are more closing braces than opening braces
    @Test
    public void openingBracesMissing(){

        assertTrue(BalancedBrackets.moreOpeningOrClosingBraces("[stri]ng") >= 0);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[la]unch"));
    }

    //TODO: assert string containing only brackets returns true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    //TODO: assert if opening brace comes first
    @Test
    public void openingBraceFirst(){
        assertEquals("[",BalancedBrackets.openingOrClosingFirst("[launch"));
    }


    //TODO: asser if closing brace comes first
    @Test
    public void closingBraceFirst(){
        assertEquals("]", BalancedBrackets.openingOrClosingFirst("lau]nch"));
    }

    //TODO: assert does opening brace start string
    @Test
    public void stringStartWithOpeningBrace(){
        assertEquals("[", BalancedBrackets.stringStartWith("[launch"));
    }
    //TODO: assert does closing brace end string
    @Test
    public void stringEndWithClosingBrace(){
        assertEquals("]", BalancedBrackets.stringEndsWith("launchCode]"));
    }
    //TODO: assert empty string returns true
    @Test
    public void emptyStringConsideredBraces(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    //TODO: assert is OPENING brace contained in string
    @Test
    public void openingBraceContainedInString(){
        assertEquals("[", BalancedBrackets.openingBraceInString("lau[sdf"));
    }

    //TODO: assert is CLOSING brace contained in string
    @Test
    public void closingBraceContainedInString(){
        assertEquals("]", BalancedBrackets.closingBraceInString("lau]sdf"));
    }

    //TODO: assert if two opening brace are in a row
    @Test
    public void twoOpeningBracesInARow(){

        assertNotEquals("[", BalancedBrackets.twoOpeningBracesInARow("[la]un[ch"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[la]unc[h]"));
    }

    //TODO: assert is two closing brace are in a row
    @Test
    public void twoClosingBraceInSequence(){
        assertNotEquals("]", BalancedBrackets.twoClosingBraceInSequence("]l[au]sdf"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[la][unch]"));
    }

}
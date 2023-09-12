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
//number 1
public void onlyBracketsReturnTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
}

@Test
//number 2
public void worksWithNonBracketChar() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[aaa]"));
    }

    @Test
    //number 3 edge case
public void worksWithWonkyBracketOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]backwards["));
    }
@Test
    //number 4 edge case
    public void worksWithNestedBrackets() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
}

//@Test
    // won't work with any parameter that is not a string --error message Integer cannot be converted to String
//    public void failsWithInt() {
//        Integer failNumber = 3;
//        assertFalse(BalancedBrackets.hasBalancedBrackets(failNumber));
//}

    @Test
    //number 5
    public void failsWithSingleRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    //number 6
    public void failsWithSingleLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    // number 7
    public void failsWithUnbalancedLeftBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    //number 8
    public void failsWithUnbalancedRightBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

@Test
    //number 9
    public void unnestedMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
}

@Test
    //number 10
    public void concatenatedBrackets() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[]"+"[]"));
}

@Test
    //number 11
    public void nestedAndNotNested() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
}

@Test
    //number 12
    public void otherCharsSurroundBrackets() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code] Rules"));

}

@Test
    //number 13
    public void stringWithNoBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(" "));
}


}
package org.launchcode;

public class BalancedBrackets {

    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     * "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     * "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }

            // If brackets go negative at any point, return false
            if (brackets < 0) {
                return false;
            }
        }
        return brackets == 0;
    }

    // Additional unit tests
    public static void main(String[] args) {
        // Test 1: Only brackets in correct order
        System.out.println(hasBalancedBrackets("[]")); // Should return true

        // Test 2: Only brackets in reverse order
        System.out.println(hasBalancedBrackets("][")); // Should return false

        // Test 3: Brackets in the middle of a string
        System.out.println(hasBalancedBrackets("Launch[Code]")); // Should return true

        // Test 4: Brackets with non-bracket characters
        System.out.println(hasBalancedBrackets("[Hello] World!")); // Should return true

        // Test 5: Unbalanced brackets
        System.out.println(hasBalancedBrackets("[LaunchCode")); // Should return false

        // Test 6: Empty string
        System.out.println(hasBalancedBrackets("")); // Should return true

        // Test 7: Nested brackets
        System.out.println(hasBalancedBrackets("[[Nested]]")); // Should return true

        // Test 8: Only open bracket
        System.out.println(hasBalancedBrackets("[LaunchCode")); // Should return false

        // Test 9: Only close bracket
        System.out.println(hasBalancedBrackets("Launch]Code]")); // Should return false

        // Test 10: Balanced brackets with spaces
        System.out.println(hasBalancedBrackets("[Launch Code]")); // Should return true

        // Test 11: Nested brackets with non-bracket characters
        System.out.println(hasBalancedBrackets("La[un]ch[Co]de")); // Should return true

        // Test 12: Non-bracket characters with no brackets
        System.out.println(hasBalancedBrackets("LaunchCode")); // Should return true
    }
}

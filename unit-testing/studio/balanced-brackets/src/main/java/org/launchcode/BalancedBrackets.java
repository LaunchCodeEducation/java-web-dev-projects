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
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;
        final String str1 = str;
        for (char ch : str1.toCharArray()) {
            if (ch == '[') {
                brackets++;
            } else if (ch == ']') {
                brackets--;
            }
        }
        return brackets == 0;
        public boolean isBalanced (String str1){
            if (null == str1 || ((str1.length() % 2) != 0)) {
                return false;
            } else {
                char[] ch = str1.toCharArray();
                for (char c : ch) {
                    if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                        return false;
                    }
                    while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
                        str = str.replaceAll("\\(\\)", "")
                                .replaceAll("\\[\\]", "")
                                .replaceAll("\\{\\}", "");
                    }
                    return (str.isEmpty());
                }
            }
        }
    }
}



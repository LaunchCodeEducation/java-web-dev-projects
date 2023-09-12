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

        for (char ch : str.toCharArray()) {
            if(brackets <= -1 && ch == '['){
                brackets--;
            } else if(brackets >= 1 && ch == '[' ){
                brackets++;
            } else {
                if (ch == '[') {
                    brackets++;
                } else if (ch == ']') {
                    brackets--;
                }
            }

        }
        return brackets == 0;
    }

    public static String openingOrClosingFirst(String str) {
        String braceFirst = "";
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                braceFirst = "[";
            } else if (ch == ']') {
                braceFirst = "]";
            }
        }
        return braceFirst;
    }

    public static int moreOpeningOrClosingBraces(String str) {
        int balancedOrNot = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                balancedOrNot++;
            } else if (ch == ']') {

                balancedOrNot--;
            }
        }
        return balancedOrNot;

    }

    public static String stringStartWith(String str) {
        char[] charArray = new char[str.length()];
        int i = 0;
        String startsWith=null;
        for (char ch : str.toCharArray()){
            charArray[i] = ch;
            i++;
        }
        if(charArray[0] == '['){
            startsWith = "[";
        }
        return startsWith;
    }

    public static String stringEndsWith(String str) {
        char[] charArray = new char[str.length()];
        int i = 0;
        String endsWith=null;
        for (char ch : str.toCharArray()){
            charArray[i] = ch;
            i++;
        }
        if(charArray[str.length()-1] == ']'){
            endsWith = "]";
        }
        return endsWith;
    }

    public static String openingBraceInString(String str) {
        String stringContains=null;
        char[] charArray = new char[str.length()];
        int i = 0;
        int containsBrace = 0;
        for (char ch : str.toCharArray()){
            if(ch == '['){
                containsBrace++;
            }
            charArray[i] = ch;
            i++;

        }
        if(charArray[0] != '[' && charArray[str.length()-1] != ']' && containsBrace > 0){
            stringContains = "[";
        }
        return stringContains;
    }

    public static String closingBraceInString(String str) {
        String stringContains=null;
        char[] charArray = new char[str.length()];
        int i = 0;
        int containsBrace = 0;
        for (char ch : str.toCharArray()){
            if(ch == ']'){
                containsBrace++;
            }
            charArray[i] = ch;
            i++;

        }
        if(charArray[0] != '[' && charArray[str.length()-1] != ']' && containsBrace > 0){
            stringContains = "]";
        }
        return stringContains;
    }

    public static String twoOpeningBracesInARow(String str) {

        char[] charArray = new char[str.length()];
        StringBuilder arrayToStringBuilder = new StringBuilder();
        int i = 0;
        String twoOpeningBraces = null;
        for (char ch : str.toCharArray()){
            if(ch == '[' || ch == ']'){
                charArray[i] = ch;
                i++;
            }
        }

        arrayToStringBuilder.append(charArray);
        String braces =  arrayToStringBuilder.toString();

        if(braces.contains("[[")){
            twoOpeningBraces = "[";
        }
        return twoOpeningBraces;
    }

    public static String twoClosingBraceInSequence(String str) {

        char[] charArray = new char[str.length()];
        StringBuilder arrayToStringBuilder = new StringBuilder();
        int i = 0;
        String twoClosingBraces = null;
        for (char ch : str.toCharArray()){
            if(ch == '[' || ch == ']'){
                charArray[i] = ch;
                i++;
            }
        }

        arrayToStringBuilder.append(charArray);
        String braces =  arrayToStringBuilder.toString();

        if(braces.contains("]]")){
            twoClosingBraces = "]";
        }
        return twoClosingBraces;
    }



}
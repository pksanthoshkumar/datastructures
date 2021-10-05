package org.opendesk.strings;

import java.util.HashMap;

public class FindMinimumWindowSubStringThatContainsAllChars {
    /**
     * Solution:
     *
     * https://www.youtube.com/watch?v=U1q16AFcjKs
     *
     * Given two strings s and t of lengths m and n respectively,
     * return the minimum window substring of s
     * such that every character in t (including duplicates)
     * is included in the window.
     *  If there is no such substring, return the empty string "".
     *
     *  Example 1:
     *
     * Input: s = "ADOBECODEBANC", t = "ABC"
     * Output: "BANC"
     * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
     * Example 2:
     *
     * Input: s = "a", t = "a"
     * Output: "a"
     * Explanation: The entire string s is the minimum window.
     * Example 3:
     *
     * Input: s = "a", t = "aa"
     * Output: ""
     * Explanation: Both 'a's from t must be included in the window.
     * Since the largest window of s only has one 'a', return empty string.
     */
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        int wBegin = 0;
        int wEnd = 0;
    }

    String getMinimumWindowSubStringThatContainsAllChars (String aString, String t) {
       HashMap <Character, Integer> windowMap = new HashMap();
       HashMap <Character, Integer> minWindowMap = new HashMap<>();

       for (int i = 0; i < t.length(); i++){
           windowMap.put(t.charAt(i), 1);
       }



        for (int i=0; i < aString.length(); i++){

            if (t.contains( String.valueOf(aString.charAt(i)))){

            }

        }

        return null;
    }
}

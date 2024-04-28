package org.example.interviewq;

import java.util.HashMap;
import java.util.Map;

/*
9. Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */

public class E9FirstNonRepChar {
    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }


        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstNonRepeatingChar(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

}

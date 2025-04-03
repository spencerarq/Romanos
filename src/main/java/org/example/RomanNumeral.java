package org.example;

import java.util.Map;
import java.util.HashMap;

public class RomanNumeral {

    private static final Map<Character, Integer> romanToInt = new HashMap<>();

    static {
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);
    }

    public int convert(String romanNumeral) {
        int total = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToInt.get(romanNumeral.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}
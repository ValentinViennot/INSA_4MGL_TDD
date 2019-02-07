package fr.insalyon.telecom.mgl;

import java.util.HashMap;

class RomanNumberConverter {

    private final HashMap<Character, Integer> map = new HashMap<>();

    RomanNumberConverter() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    int convert(String romanNumber) {
        int sum = 0, same = 0, lastValue = 0;
        for (int i = 0; i < romanNumber.length(); ++i) {
            char c = romanNumber.charAt(i);
            try {
                // try to get the corresponding value in dictionary
                int value = map.get(c);
                // not more than 3 times the same letter, excepted for M
                if (value == lastValue && c != 'M' && ++same > 2)
                    throw new IllegalArgumentException("Invalid syntax: too much repetitions of char " + c);
                // IV = 4 but VI = 6
                if (lastValue < value) {
                    sum += (value - 2 * lastValue);
                } else {
                    sum += value;
                }
                lastValue = value;
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Unknown char " + c);
            }
        }
        return sum;
    }

    String convert(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; ++i) {
            roman.append("I");
        }
        return roman.toString();
    }

    String getClosestRoman(int i) {
        if (i > 3) return "V";
        return "I";
    }

}

package fr.insalyon.telecom.mgl;

class RomanNumberConverter {

    int convert(String romanNumber) {
        int sum = 0, lastValue = 0;
        checkNoMoreThanThreeTimesPerLetter(romanNumber);
        for (char c : romanNumber.toCharArray()) {
            try {
                int value = RomanDictionary.getArabicValue(c);
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

    private void checkNoMoreThanThreeTimesPerLetter(String roman) {
        int count = 0;
        char lastChar = ' ';
        for (char c : roman.toCharArray()) {
            if (c == lastChar && c != 'M' && ++count > 2) {
                throw new IllegalArgumentException("Invalid syntax: too much repetitions of char " + c);
            }
            lastChar = c;
        }
    }

    String convert(int number) throws IllegalArgumentException {
        if (number == 0) {
            throw new IllegalArgumentException("Wait for Arabs...");
        }
        char upperRoman = RomanDictionary.getUpperRomanInDictionary(number);
        int upperArabic = RomanDictionary.getArabicValue(upperRoman);
        if (number > upperArabic) {
            return upperRoman + convert(number - upperArabic);
        }
        if (number < upperArabic) {
            try {
                return findSubtrahendToGetExactValue(upperArabic, number) + "" + upperRoman;
            } catch (NullPointerException e) {
                final int previousIndex = RomanDictionary.getIndex(upperRoman) - 1;
                return RomanDictionary.romanValues[previousIndex] + convert(number - RomanDictionary.arabicValues[previousIndex]);
            }
        }
        return "" + upperRoman;
    }

    char findSubtrahendToGetExactValue(int upperValue, int matchValue) throws NullPointerException {
        return findSubtrahendToGetExactValue(upperValue, matchValue, 0);
    }

    private char findSubtrahendToGetExactValue(int upperValue, int matchValue, int startIndex) throws NullPointerException {
        int resultRemain = (upperValue - RomanDictionary.arabicValues[startIndex]) - matchValue;
        if (resultRemain == 0) {
            return RomanDictionary.romanValues[startIndex];
        }
        if (resultRemain < 0) {
            throw new NullPointerException();
        }
        return findSubtrahendToGetExactValue(upperValue, matchValue, startIndex + 1);
    }
}
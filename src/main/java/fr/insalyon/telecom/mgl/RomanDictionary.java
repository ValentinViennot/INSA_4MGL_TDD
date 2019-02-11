package fr.insalyon.telecom.mgl;

class RomanDictionary {

    static final int[] arabicValues = {1, 5, 10, 50, 100, 500, 1000};
    static final char[] romanValues = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    static int getArabicValue(char letter) {
        int index = getIndex(letter);
        if (index < 0 || index >= arabicValues.length) {
            throw new IllegalArgumentException("Unknown roman letter: " + letter);
        }
        return arabicValues[index];
    }

    static char getUpperRomanInDictionary(final int arabic) {
        return getUpperRomanInDictionary(arabic, 0);
    }

    private static char getUpperRomanInDictionary(final int arabic, int index) {
        if (index == arabicValues.length - 1 || arabicValues[index] >= arabic) {
            return romanValues[index];
        }
        return getUpperRomanInDictionary(arabic, index + 1);
    }

    static int getIndex(char letter) {
        return getIndex(letter, 0);
    }

    private static int getIndex(char letter, int index) {
        if (index == romanValues.length) {
            return -1;
        }
        if (romanValues[index] == letter) {
            return index;
        }
        return getIndex(letter, index + 1);
    }

}

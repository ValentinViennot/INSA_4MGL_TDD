package fr.insalyon.telecom.mgl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanDictionaryTest {

    @Test
    public void getArabicValue_return1givenI() {
        assertThat(RomanDictionary.getArabicValue('I')).isEqualTo(1);
    }

    @Test
    public void getArabicValue_return5givenV() {
        assertThat(RomanDictionary.getArabicValue('V')).isEqualTo(5);
    }

    @Test
    public void getArabicValue_return10givenX() {
        assertThat(RomanDictionary.getArabicValue('X')).isEqualTo(10);
    }

    @Test
    public void getArabicValue_return50givenL() {
        assertThat(RomanDictionary.getArabicValue('L')).isEqualTo(50);
    }

    @Test
    public void getArabicValue_return100givenC() {
        assertThat(RomanDictionary.getArabicValue('C')).isEqualTo(100);
    }

    @Test
    public void getArabicValue_return500givenD() {
        assertThat(RomanDictionary.getArabicValue('D')).isEqualTo(500);
    }

    @Test
    public void getArabicValue_return1000givenM() {
        assertThat(RomanDictionary.getArabicValue('M')).isEqualTo(1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getArabicValue_throwIllegalArgumentGivenAnythingElse() {
        RomanDictionary.getArabicValue('A');
    }

    @Test
    public void getUpperRomanInDictionary_return1given1() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(1))
                .isEqualTo('I');
    }

    @Test
    public void getUpperRomanInDictionary_return5given2() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(2))
                .isEqualTo('V');
    }

    @Test
    public void getUpperRomanInDictionary_return5given3() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(3))
                .isEqualTo('V');
    }

    @Test
    public void getUpperRomanInDictionary_return5given4() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(4))
                .isEqualTo('V');
    }

    @Test
    public void getUpperRomanInDictionary_return5given5() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(5))
                .isEqualTo('V');
    }

    @Test
    public void getUpperRomanInDictionary_return10given6() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(6))
                .isEqualTo('X');
    }

    @Test
    public void getUpperRomanInDictionary_return1000given2000() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(2000))
                .isEqualTo('M');
    }

    @Test
    public void getUpperRomanInDictionary_return10given9() {
        assertThat(RomanDictionary.getUpperRomanInDictionary(9))
                .isEqualTo('X');
    }

}

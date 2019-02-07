package fr.insalyon.telecom.mgl;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

    private RomanNumberConverter romanNumberConverter;

    @Before
    public void setup() {
        romanNumberConverter = new RomanNumberConverter();
    }

    // convert

    @Test
    public void convert_return1GivenI() {
        assertThat(romanNumberConverter.convert("I"))
                .isEqualTo(1);
    }

    @Test
    public void convert_return2GivenII() {
        assertThat(romanNumberConverter.convert("II"))
                .isEqualTo(2);
    }

    @Test
    public void convert_return5GivenV() {
        assertThat(romanNumberConverter.convert("V"))
                .isEqualTo(5);
    }

    @Test
    public void convert_return10GivenX() {
        assertThat(romanNumberConverter.convert("X"))
                .isEqualTo(10);
    }

    @Test
    public void convert_return50GivenL() {
        assertThat(romanNumberConverter.convert("L"))
                .isEqualTo(50);
    }

    @Test
    public void convert_return100GivenC() {
        assertThat(romanNumberConverter.convert("C"))
                .isEqualTo(100);
    }

    @Test
    public void convert_return500GivenD() {
        assertThat(romanNumberConverter.convert("D"))
                .isEqualTo(500);
    }

    @Test
    public void convert_return1000GivenM() {
        assertThat(romanNumberConverter.convert("M"))
                .isEqualTo(1000);
    }

    @Test
    public void convert_return4000GivenMMMM() {
        assertThat(romanNumberConverter.convert("MMMM"))
                .isEqualTo(4000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenIIII() {
        romanNumberConverter.convert("IIII");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenABC() {
        romanNumberConverter.convert("ABC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_returnExceptionGivenNumber() {
        romanNumberConverter.convert("-10");
    }

    @Test
    public void convert_return4GivenIV() {
        assertThat(romanNumberConverter.convert("IV"))
                .isEqualTo(4);
    }

    @Test
    public void convert_return151GivenCLI() {
        assertThat(romanNumberConverter.convert("CLI"))
                .isEqualTo(151);
    }

    @Test
    public void convert_return1059GivenMLIX() {
        assertThat(romanNumberConverter.convert("MLIX"))
                .isEqualTo(1059);
    }

    @Test
    public void convert_returnIGiven1() {
        assertThat(romanNumberConverter.convert(1))
                .isEqualTo("I");
    }

    @Test
    public void convert_returnIIGiven2() {
        assertThat(romanNumberConverter.convert(2))
                .isEqualTo("II");
    }

    @Test
    public void convert_returnVGiven5() {
        assertThat(romanNumberConverter.convert(5))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnIgiven1() {
        assertThat(romanNumberConverter.getClosestRoman(1))
                .isEqualTo("I");
    }

    @Test
    public void getClosestRoman_returnIgiven2() {
        assertThat(romanNumberConverter.getClosestRoman(2))
                .isEqualTo("I");
    }

    @Test
    public void getClosestRoman_returnIgiven3() {
        assertThat(romanNumberConverter.getClosestRoman(3))
                .isEqualTo("I");
    }

    @Test
    public void getClosestRoman_returnVgiven4() {
        assertThat(romanNumberConverter.getClosestRoman(4))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnVgiven5() {
        assertThat(romanNumberConverter.getClosestRoman(5))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnVgiven6() {
        assertThat(romanNumberConverter.getClosestRoman(6))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnVgiven7() {
        assertThat(romanNumberConverter.getClosestRoman(7))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnVgiven8() {
        assertThat(romanNumberConverter.getClosestRoman(7))
                .isEqualTo("V");
    }

    @Test
    public void getClosestRoman_returnXgiven9() {
        assertThat(romanNumberConverter.getClosestRoman(7))
                .isEqualTo("X");
    }

}

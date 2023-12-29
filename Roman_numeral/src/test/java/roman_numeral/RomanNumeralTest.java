package roman_numeral;

import org.junit.jupiter.api.Test;

class RomanNumeralTest {
    @Test
    public void shouldConvertZeroToEmptyString() {
        assert(RomanNumeral.convertArabicToRoman(0)).isEmpty();
    }

    @Test
    public void shouldConvertOneToIString() {
        assert(RomanNumeral.convertArabicToRoman(1)).equals("I");
    }

    @Test
    public void shouldConvertThreeToIIIString() {
        assert(RomanNumeral.convertArabicToRoman(3)).equals("III");
    }

    @Test
    public void shouldConvertFourToIVString() {
        assert(RomanNumeral.convertArabicToRoman(4)).equals("IV");
    }

    @Test
    public void shouldConvertFiveToVString() {
        assert(RomanNumeral.convertArabicToRoman(5)).equals("V");
    }

    @Test
    public void shouldConvertSevenToVIIString() {
        assert(RomanNumeral.convertArabicToRoman(7)).equals("VII");
    }

    @Test
    public void shouldConvertNineToIXString() {
        assert(RomanNumeral.convertArabicToRoman(9)).equals("IX");
    }
}
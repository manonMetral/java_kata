package roman_numeral;

import org.junit.jupiter.api.Test;

class RomanNumeralTest {
    @Test
    public void shouldConvertZeroToEmptyString() {
        assert (RomanNumeral.convertArabicToRoman(0)).isEmpty();
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

    @Test
    public void shouldConvertTenToXString() {
        assert(RomanNumeral.convertArabicToRoman(10)).equals("X");
    }

    @Test
    public void shouldConvertThirtySixToXXXVIString() {
        assert(RomanNumeral.convertArabicToRoman(36)).equals("XXXVI");
    }

    @Test
    public void shouldConvertFourtyNineToXLIXString() {
        assert(RomanNumeral.convertArabicToRoman(49)).equals("XLIX");
    }

    @Test
    public void shouldConvertNintyNineToXCIXString() {
        assert(RomanNumeral.convertArabicToRoman(99)).equals("XCIX");
    }

    @Test
    public void shouldConvertTwoHundredFourtyFiveToCCXLVString() {
        assert(RomanNumeral.convertArabicToRoman(245)).equals("CCXLV");
    }

    @Test
    public void shouldConvertTwoHundredToCCString() {
        assert(RomanNumeral.convertArabicToRoman(200)).equals("CC");
    }

    @Test
    public void shouldConvertThousandFiveHundredFiftyFiveToMDLVString() {
        System.out.println(RomanNumeral.convertArabicToRoman(1555));
        assert(RomanNumeral.convertArabicToRoman(1555)).equals("MDLV");
    }
}
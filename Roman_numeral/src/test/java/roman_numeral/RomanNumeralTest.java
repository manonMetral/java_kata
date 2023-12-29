package roman_numeral;

import org.junit.jupiter.api.Test;

class RomanNumeralTest {
    @Test
    public void shouldConvertZeroToEmptyString() {
        assert(RomanNumeral.convertNumeral(0)).isEmpty();
    }

    @Test
    public void shouldConvertOneToIString() {
        assert(RomanNumeral.convertNumeral(1)).equals("I");
    }

    @Test
    public void shouldConvertThreeToIIIString() {
        assert(RomanNumeral.convertNumeral(3)).equals("III");
    }

    @Test
    public void shouldConvertFourToIVString() {
        assert(RomanNumeral.convertNumeral(4)).equals("IV");
    }
}
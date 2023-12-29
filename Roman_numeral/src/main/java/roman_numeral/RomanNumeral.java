package roman_numeral;

public class RomanNumeral {

    public static final int ONE_NUMBER_MINIMUM_VALUE = RomanNumeralSymbol.ONENUMBERMINIMUM.getValue();
    public static final int ONE_NUMBER_MEDIUM_VALUE = RomanNumeralSymbol.ONENUMBERMEDIUM.getValue();
    public static final String ONE_NUMBER_MINIMUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMINIMUM.getRomanNumeralSymbol();
    public static final String ONE_NUMBER_MEDIUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMEDIUM.getRomanNumeralSymbol();
    public static final int ONE_NUMBER_MAXIMUM_VALUE = RomanNumeralSymbol.ONENUMBERMAXIMUM.getValue();
    public static final String ONE_NUMBER_MAXIMUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMAXIMUM.getRomanNumeralSymbol();

    public static String convertArabicToRoman(int arabicNumeral) {
        /*
        On raisonne avec
            min md  max
            I   V   X
            X   L   C
            C   D   M
            M   *   *
        Si min < nbr < md
        if nbr != md - min
        alors nbr = nbr x min
        sinon nbr = "min+md"

        Si md < nbr < max
        if nbr != max - md
        alors nbr = "mb+[(nbr-md) x min]"
        sinon if nbr = max - md
        alors nbr = "md+max"
        */
        if (ONE_NUMBER_MINIMUM_VALUE <= arabicNumeral && arabicNumeral < ONE_NUMBER_MEDIUM_VALUE) {
            if (arabicNumeral != ONE_NUMBER_MEDIUM_VALUE - ONE_NUMBER_MINIMUM_VALUE) {
                return ONE_NUMBER_MINIMUM_SYMBOL.repeat(arabicNumeral);
            } else {
                return ONE_NUMBER_MINIMUM_SYMBOL + ONE_NUMBER_MEDIUM_SYMBOL;
            }
        } else if (ONE_NUMBER_MEDIUM_VALUE <= arabicNumeral && arabicNumeral < ONE_NUMBER_MAXIMUM_VALUE) {
            if (arabicNumeral != ONE_NUMBER_MAXIMUM_VALUE - ONE_NUMBER_MINIMUM_VALUE) {
                return ONE_NUMBER_MEDIUM_SYMBOL + ONE_NUMBER_MINIMUM_SYMBOL.repeat(arabicNumeral-ONE_NUMBER_MEDIUM_VALUE);
            } else {
                return ONE_NUMBER_MINIMUM_SYMBOL + ONE_NUMBER_MAXIMUM_SYMBOL;
            }
        }
        return "";
    }
}

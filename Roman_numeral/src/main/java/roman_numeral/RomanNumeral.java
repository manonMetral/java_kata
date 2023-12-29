package roman_numeral;

public class RomanNumeral {

    public static final int ONE_NUMBER_MINIMUM_VALUE = RomanNumeralSymbol.ONENUMBERMINIMUM.getValue();
    public static final int ONE_NUMBER_MEDIUM_VALUE = RomanNumeralSymbol.ONENUMBERMEDIUM.getValue();
    public static final int ONE_NUMBER_MAXIMUM_VALUE = RomanNumeralSymbol.ONENUMBERMAXIMUM.getValue();
    public static final String ONE_NUMBER_MINIMUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMINIMUM.getRomanNumeralSymbol();
    public static final String ONE_NUMBER_MEDIUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMEDIUM.getRomanNumeralSymbol();
    public static final String ONE_NUMBER_MAXIMUM_SYMBOL = RomanNumeralSymbol.ONENUMBERMAXIMUM.getRomanNumeralSymbol();
    public static String unitsRomanNumeral = "";
    public static final int TWO_NUMBER_MEDIUM_VALUE = RomanNumeralSymbol.TWONUMBERMEDIUM.getValue();
    public static final int TWO_NUMBER_MAXIMUM_VALUE = RomanNumeralSymbol.TWONUMBERMAXIMUM.getValue();
    public static final String TWO_NUMBER_MEDIUM_SYMBOL = RomanNumeralSymbol.TWONUMBERMEDIUM.getRomanNumeralSymbol();
    public static final String TWO_NUMBER_MAXIMUM_SYMBOL = RomanNumeralSymbol.TWONUMBERMAXIMUM.getRomanNumeralSymbol();
    public static String decadesRomanNumeral = "";
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
        if (getDecadesRomanNumeral(arabicNumeral).isEmpty()) {
            return getUnitsRomanNumeral(arabicNumeral);
        }
        return getDecadesRomanNumeral(arabicNumeral) + getUnitsRomanNumeral(arabicNumeral);
    }

    public static String getDecadesRomanNumeral(int arabicNumeral) {
        int decadesArabicNumeral = getDecades(arabicNumeral);
        if (arabicNumeral < ONE_NUMBER_MAXIMUM_VALUE) {
            decadesRomanNumeral = "";
        } else if (ONE_NUMBER_MAXIMUM_VALUE <= decadesArabicNumeral && decadesArabicNumeral < TWO_NUMBER_MEDIUM_VALUE) {
            if (decadesArabicNumeral != TWO_NUMBER_MEDIUM_VALUE - ONE_NUMBER_MAXIMUM_VALUE) {
                decadesRomanNumeral = ONE_NUMBER_MAXIMUM_SYMBOL.repeat(decadesArabicNumeral/10);
            } else {
                decadesRomanNumeral = ONE_NUMBER_MAXIMUM_SYMBOL + TWO_NUMBER_MEDIUM_SYMBOL;
            }
        } else if (TWO_NUMBER_MEDIUM_VALUE <= decadesArabicNumeral && decadesArabicNumeral < TWO_NUMBER_MAXIMUM_VALUE) {
            if (decadesArabicNumeral != TWO_NUMBER_MAXIMUM_VALUE - ONE_NUMBER_MAXIMUM_VALUE) {
                decadesRomanNumeral =  TWO_NUMBER_MEDIUM_SYMBOL + ONE_NUMBER_MAXIMUM_SYMBOL.repeat((decadesArabicNumeral-TWO_NUMBER_MEDIUM_VALUE)/10);
            } else {
                decadesRomanNumeral = ONE_NUMBER_MAXIMUM_SYMBOL + TWO_NUMBER_MAXIMUM_SYMBOL;
            }
        }
        return decadesRomanNumeral;
    }

    public static String getUnitsRomanNumeral(int arabicNumeral) {
        int unitsArabicNumeral = getUnits(arabicNumeral);
        if (ONE_NUMBER_MINIMUM_VALUE <= unitsArabicNumeral && unitsArabicNumeral < ONE_NUMBER_MEDIUM_VALUE) {
            if (unitsArabicNumeral != ONE_NUMBER_MEDIUM_VALUE - ONE_NUMBER_MINIMUM_VALUE) {
                unitsRomanNumeral = ONE_NUMBER_MINIMUM_SYMBOL.repeat(unitsArabicNumeral);
            } else {
                unitsRomanNumeral = ONE_NUMBER_MINIMUM_SYMBOL + ONE_NUMBER_MEDIUM_SYMBOL;
            }
        } else if (ONE_NUMBER_MEDIUM_VALUE <= unitsArabicNumeral && unitsArabicNumeral < ONE_NUMBER_MAXIMUM_VALUE) {
            if (unitsArabicNumeral != ONE_NUMBER_MAXIMUM_VALUE - ONE_NUMBER_MINIMUM_VALUE) {
                unitsRomanNumeral =  ONE_NUMBER_MEDIUM_SYMBOL + ONE_NUMBER_MINIMUM_SYMBOL.repeat(unitsArabicNumeral-ONE_NUMBER_MEDIUM_VALUE);
            } else {
                unitsRomanNumeral = ONE_NUMBER_MINIMUM_SYMBOL + ONE_NUMBER_MAXIMUM_SYMBOL;
            }
        } else {
            unitsRomanNumeral = "";
        }
        return unitsRomanNumeral;
    }

    public static int getUnits(int arabicNumber) {
        return arabicNumber % 10;
    }

    public static int getDecades(int arabicNumber) {
        return arabicNumber % 100 - getUnits(arabicNumber);
    }
}

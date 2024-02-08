package roman_numeral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RomanNumeral {

    public static final RomanNumeralSymbol ONE_NUMBER_MINIMUM = RomanNumeralSymbol.ONENUMBERMINIMUM;
    public static final RomanNumeralSymbol ONE_NUMBER_MEDIUM = RomanNumeralSymbol.ONENUMBERMEDIUM;
    public static final RomanNumeralSymbol ONE_NUMBER_MAXIMUM = RomanNumeralSymbol.ONENUMBERMAXIMUM;
    public static final RomanNumeralSymbol TWO_NUMBER_MEDIUM = RomanNumeralSymbol.TWONUMBERMEDIUM;
    public static final RomanNumeralSymbol TWO_NUMBER_MAXIMUM = RomanNumeralSymbol.TWONUMBERMAXIMUM;
    public static final RomanNumeralSymbol THREE_NUMBER_MEDIUM = RomanNumeralSymbol.THREENUMBERMEDIUM;
    public static final RomanNumeralSymbol THREE_NUMBER_MAXIMUM = RomanNumeralSymbol.THREENUMBERMAXIMUM;
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

        if(getThousandRomanNumeral(arabicNumeral).isEmpty()){
            if (getHundredRomanNumeral(arabicNumeral).isEmpty()) {
                if (getDecadesRomanNumeral(arabicNumeral).isEmpty()) {
                    return getUnitsRomanNumeral(arabicNumeral);
                }
                return getDecadesRomanNumeral(arabicNumeral) + getUnitsRomanNumeral(arabicNumeral);
            }
            return getHundredRomanNumeral(arabicNumeral) + getDecadesRomanNumeral(arabicNumeral) + getUnitsRomanNumeral(arabicNumeral);
        }
        return getThousandRomanNumeral(arabicNumeral) + getHundredRomanNumeral(arabicNumeral) + getDecadesRomanNumeral(arabicNumeral) + getUnitsRomanNumeral(arabicNumeral);

    }
    public static String getThousandRomanNumeral(int arabicNumeral) {
        int thousandArabicNumeral = (arabicNumeral-getHundred(arabicNumeral)-getDecades(arabicNumeral)-getUnits(arabicNumeral))/1000;
        return THREE_NUMBER_MAXIMUM.getRomanNumeralSymbol().repeat(thousandArabicNumeral);
    }
    public static String getHundredRomanNumeral(int arabicNumeral) {
        int hundredArabicNumeral = getHundred(arabicNumeral);
        return getPowerTenToConvert(hundredArabicNumeral, TWO_NUMBER_MAXIMUM, THREE_NUMBER_MEDIUM, THREE_NUMBER_MAXIMUM);
    }

    public static String getDecadesRomanNumeral(int arabicNumeral) {
        int decadesArabicNumeral = getDecades(arabicNumeral);
        return getPowerTenToConvert(decadesArabicNumeral, ONE_NUMBER_MAXIMUM, TWO_NUMBER_MEDIUM, TWO_NUMBER_MAXIMUM);
    }

    public static String getUnitsRomanNumeral(int arabicNumeral) {
        int unitsArabicNumeral = getUnits(arabicNumeral);
        return getPowerTenToConvert(unitsArabicNumeral, ONE_NUMBER_MINIMUM, ONE_NUMBER_MEDIUM, ONE_NUMBER_MAXIMUM);
    }

    public static String getPowerTenToConvert(int powerTenArabicNumeral, RomanNumeralSymbol minimum, RomanNumeralSymbol medium, RomanNumeralSymbol maximum) {
        String powerTenToConvert;
        if (powerTenArabicNumeral < minimum.getValue()) {
            powerTenToConvert = "";
        } else if (powerTenArabicNumeral < medium.getValue()) {
            if (powerTenArabicNumeral != medium.getValue() - minimum.getValue()) {
                powerTenToConvert = minimum.getRomanNumeralSymbol().repeat(powerTenArabicNumeral/minimum.getValue());
            } else {
                powerTenToConvert = minimum.getRomanNumeralSymbol() + medium.getRomanNumeralSymbol();
            }
        } else if (powerTenArabicNumeral < maximum.getValue()) {
            if (powerTenArabicNumeral != maximum.getValue() - minimum.getValue()) {
                powerTenToConvert =  medium.getRomanNumeralSymbol() + minimum.getRomanNumeralSymbol().repeat(powerTenArabicNumeral-medium.getValue());
            } else {
                powerTenToConvert = minimum.getRomanNumeralSymbol() + maximum.getRomanNumeralSymbol();
            }
        } else {
            powerTenToConvert = "";
        }
        return powerTenToConvert;
    }

    public static int getUnits(int arabicNumber) {
        return arabicNumber % 10;
    }

    public static int getDecades(int arabicNumber) {
        return arabicNumber % 100 - getUnits(arabicNumber);
    }

    public static int getHundred(int arabicNumber) {
        return arabicNumber % 1000 - getDecades(arabicNumber) - getUnits(arabicNumber);
    }

    public static int convertRomanToArabic(String numeralRoman) {
        RomanNumeralSymbol[] enumValues = RomanNumeralSymbol.values();
        List<Integer> arrayValues = new ArrayList<>();
        arrayValues.add(calculationForComplexNumber(numeralRoman));

        List<String> arrayRomanNumberToTreat = Arrays.stream(treatmentForComplexNumberOnString(numeralRoman).split("")).toList();
        for(String numberToConvert: arrayRomanNumberToTreat){
            for (RomanNumeralSymbol enumValue : enumValues) {
                if (Objects.equals(enumValue.getRomanNumeralSymbol(), numberToConvert)) {
                    arrayValues.add(enumValue.getValue());
                }
            }
        }
        return arrayValues.stream().mapToInt(Integer::intValue).sum();
    }

    public static int calculationForComplexNumber(String numeralRoman) {
        int additionOfComplexNumbers = 0;
        if (numeralRoman.matches(".*CM.*")){
            additionOfComplexNumbers += 900;
        }
        if(numeralRoman.matches(".*XC.*")){
            additionOfComplexNumbers += 90;
        }
        if(numeralRoman.matches(".*IX.*")){
            additionOfComplexNumbers += 9;
        }
        if(numeralRoman.matches(".*IV.*")){
            additionOfComplexNumbers += 4;
        }
        return additionOfComplexNumbers;
    }

    public static String treatmentForComplexNumberOnString(String numeralRoman) {
        if(numeralRoman.matches(".*CM.*")){
            numeralRoman = numeralRoman.replace("CM", "");
        }
        if(numeralRoman.matches(".*XC.*")){
            numeralRoman = numeralRoman.replace("XC", "");
        }
        if(numeralRoman.matches(".*IX.*")){
            numeralRoman = numeralRoman.replace("IX", "");
        }
        if(numeralRoman.matches(".*IV.*")){
            numeralRoman = numeralRoman.replace("IV", "");
        }
        return numeralRoman;
    }
}

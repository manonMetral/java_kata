package roman_numeral;

public enum RomanNumeralSymbol {
    ONENUMBERMINIMUM("I", 1), ONENUMBERMEDIUM("V", 5), ONENUMBERMAXIMUM("X", 10);

    private String romanNumeralSymbol;
    private int value;

    RomanNumeralSymbol(String romanNumeralSymbol, int value) {
        this.romanNumeralSymbol = romanNumeralSymbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getRomanNumeralSymbol() {
        return romanNumeralSymbol;
    }
}

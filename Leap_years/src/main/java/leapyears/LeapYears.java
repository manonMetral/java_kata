package leapyears;

public class LeapYears {
    public Boolean isLeapYear(int testingYear) {
        if (testingYear%400 != 0 && testingYear%100 == 0) {
            return false;
        }
        return testingYear % 4 == 0;
    }
}

package leapyears;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Evaluate if year is leap year")
class LeapYearsTest {
    private LeapYears leapYear;

    @BeforeEach
    public void init(){
        leapYear = new LeapYears();
    }
    @DisplayName("Year is leap year if divisible by 400")
    @Test
    public void isYearDivisibleByFourHundredIsLeapYear() {
        assertThat(leapYear.isLeapYear(400)).isTrue();
        assertThat(leapYear.isLeapYear(2000)).isTrue();
    }

    @DisplayName("Year is not a leap year if divisible by 100 but not by 400")
    @Test
    public void isYearDivisibleByHundredButNotByFourHundredIsNotLeapYear() {
        assertThat(leapYear.isLeapYear(300)).isFalse();
        assertThat(leapYear.isLeapYear(1000)).isFalse();
    }

    @DisplayName("Year is a leap year if divisible by 4 but not by 100")
    @Test
    public void isYearDivisibleByFourButNotByHundredIsLeapYear() {
        assertThat(leapYear.isLeapYear(20)).isTrue();
        assertThat(leapYear.isLeapYear(88)).isTrue();
    }

    @DisplayName("Year is not a leap year if not divisible by 4")
    @Test
    public void isYearDivisibleByFourIsNotLeapYear() {
        assertThat(leapYear.isLeapYear(4)).isTrue();
        assertThat(leapYear.isLeapYear(64)).isTrue();
    }
}
package tech.pathtoprogramming.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AYearShould {

    @ParameterizedTest
    @CsvSource({
            "2001,false",
            "1996,true",
            "1992,true",
            "1900,false",
            "2000,true"
    })
    void determineWhetherAGivenYearIsALeapYearOrNot(int givenYear, boolean isExpectedLeapYear) {
        boolean isLeapYear = Year.isLeapYear(givenYear);

        assertThat(isLeapYear).isEqualTo(isExpectedLeapYear);
    }
}

class Year {

    public static boolean isLeapYear(int year) {
        int four = 4;
        int fourHundred = 400;
        if (year % four == 0 && (year % 100 != 0 || year % fourHundred == 0)) {
            return true;
        }
        return false;
    }
}

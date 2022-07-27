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
        if (isDivisibleBy(year, 4) && (year % 100 != 0 || isDivisibleBy(year, 400))) {
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy(int year, int four) {
        return year % four == 0;
    }
}

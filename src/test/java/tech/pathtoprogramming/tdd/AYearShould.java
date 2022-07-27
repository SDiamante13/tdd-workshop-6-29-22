package tech.pathtoprogramming.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class AYearShould {

    @ParameterizedTest
    @CsvSource({
            "2001,false",
            "1996,true",
            "1992,true"
    })
    void determineThatTheYearIsNotALeapYearForCommonCase(int givenYear, boolean isExpectedLeapYear) {
        boolean isLeapYear = Year.isLeapYear(givenYear);

        assertThat(isLeapYear).isEqualTo(isExpectedLeapYear);
    }

    @Test
    void determineThatTheYearIsAStandardLeapYear() {
        boolean isLeapYear = Year.isLeapYear(1996);

        assertThat(isLeapYear).isTrue();
    }

    @Test
    void anotherLeapYear() {
        boolean isLeapYear = Year.isLeapYear(1992);

        assertThat(isLeapYear).isTrue();
    }
}

class Year {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}

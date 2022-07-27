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
        boolean isLeapYear = new Year(givenYear).isLeapYear(givenYear);

        assertThat(isLeapYear).isEqualTo(isExpectedLeapYear);
    }
}

class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    private boolean isDivisibleBy(int four) {
        return this.year % four == 0;
    }

    public boolean isLeapYear(int year) {
        if (isDivisibleBy(4) && (isNotDivisibleBy(year, 100) || isDivisibleBy(400))) {
            return true;
        }
        return false;
    }

    private boolean isNotDivisibleBy(int year, int hundred) {
        return year % hundred != 0;
    }
}

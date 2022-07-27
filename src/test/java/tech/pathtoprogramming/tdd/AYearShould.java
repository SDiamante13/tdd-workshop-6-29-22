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
        boolean isLeapYear = new Year(givenYear).isLeapYear();

        assertThat(isLeapYear).isEqualTo(isExpectedLeapYear);
    }
}

class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        if (isDivisibleBy(4) && (isNotDivisibleBy(100) || isDivisibleBy(400))) {
            return true;
        }
        return false;
    }

    private boolean isDivisibleBy(int number) {
        return this.year % number == 0;
    }

    private boolean isNotDivisibleBy(int number) {
        return this.year % number != 0;
    }
}

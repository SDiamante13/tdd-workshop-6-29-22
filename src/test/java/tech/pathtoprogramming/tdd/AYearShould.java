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

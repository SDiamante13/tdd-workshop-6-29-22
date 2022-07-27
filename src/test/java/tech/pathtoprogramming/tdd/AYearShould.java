package tech.pathtoprogramming.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AYearShould {

    @Test
    void determineThatTheYearIsNotALeapYearForCommonCase() {
        boolean isLeapYear = Year.isLeapYear(2001);

        assertThat(isLeapYear).isFalse();
    }

    @Test
    void determineThatTheYearIsAStandardLeapYear() {
        boolean isLeapYear = Year.isLeapYear(1996);

        assertThat(isLeapYear).isTrue();
    }
}

class Year {

    public static boolean isLeapYear(int year) {
        if (year == 1996) {
            return true;
        }
        return false;
    }
}

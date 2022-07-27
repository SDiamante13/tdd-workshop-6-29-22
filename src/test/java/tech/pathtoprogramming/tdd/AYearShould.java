package tech.pathtoprogramming.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AYearShould {

    @Test
    void determineThatTheYearIsNotALeapYearForCommonCase() {
        boolean isLeapYear = Year.isLeapYear(2001);

        assertThat(isLeapYear).isFalse();
    }
}

class Year {

    public static boolean isLeapYear(int year) {
        return false;
    }
}

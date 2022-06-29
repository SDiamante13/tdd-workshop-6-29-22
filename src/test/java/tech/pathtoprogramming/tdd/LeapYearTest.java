package tech.pathtoprogramming.tdd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "1998,false",
            "2001,false",
            "1996,true",
            "1992,true",
            "1900,false",
            "2000,true"
    })
    void returnsLeapYear(int input, boolean expectedResult) {
        boolean isLeapYear = new LeapYear().isLeapYear(input);

        assertEquals(expectedResult, isLeapYear);
    }
}


class LeapYear {
    public boolean isLeapYear(int year) {
        Year theYear = new Year(year);
        return theYear.isDivisibleBy(4) && (theYear.isNotDivisibleBy(100) || theYear.isDivisibleBy(400));
    }
}

class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isDivisibleBy(int input) {
        return year % input == 0;
    }

    public boolean isNotDivisibleBy(int input) {
        return year % input != 0;
    }
}

// Fixed Primitive Obsession by introducing Year class.

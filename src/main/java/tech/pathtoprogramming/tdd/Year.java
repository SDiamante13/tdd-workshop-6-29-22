package tech.pathtoprogramming.tdd;

class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy(4)
                && (isNotDivisibleBy(100)
                || isDivisibleBy(400));
    }

    private boolean isDivisibleBy(int number) {
        return this.year % number == 0;
    }

    private boolean isNotDivisibleBy(int number) {
        return this.year % number != 0;
    }
}

package com.thoughtworks.refactor.martinfolwerbook;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        double result = 0;
        result += daysRented * 3;
        return result;
    }
}

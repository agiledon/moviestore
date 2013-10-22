package com.thoughtworks.refactor.martinfolwerbook;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }
}

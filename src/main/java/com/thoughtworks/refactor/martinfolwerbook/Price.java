package com.thoughtworks.refactor.martinfolwerbook;

public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);
}

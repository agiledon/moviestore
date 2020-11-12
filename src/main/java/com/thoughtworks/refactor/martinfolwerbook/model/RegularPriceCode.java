package com.thoughtworks.refactor.martinfolwerbook.model;

public class RegularPriceCode extends PriceCode {
    public RegularPriceCode() {
    }

    @Override
    public double amountFor(int days) {
        double thisAmount = 2;
        if (days > 2) {
            thisAmount += (days - 2) * 1.5;
        }
        return thisAmount;
    }
}
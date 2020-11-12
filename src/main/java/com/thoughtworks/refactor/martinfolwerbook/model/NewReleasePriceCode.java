package com.thoughtworks.refactor.martinfolwerbook.model;

public class NewReleasePriceCode extends PriceCode {
    public NewReleasePriceCode() {
    }

    @Override
    public double amountFor(int days) {
        double thisAmount = days * 3;
        return thisAmount;
    }
}
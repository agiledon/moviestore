package com.thoughtworks.refactor.martinfolwerbook.model;

public class ChildrenPriceCode extends PriceCode {
    public ChildrenPriceCode() {
    }

    @Override
    public double amountFor(int days) {
        double thisAmount = 1.5;
        if (days > 3)
            thisAmount += (days - 3) * 1.5;
        return thisAmount;
    }
}
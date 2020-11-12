package com.thoughtworks.refactor.martinfolwerbook.model;

public class DefaultPriceCode extends PriceCode {
    @Override
    public double amountFor(int days) {
        return 0;
    }
}

package com.thoughtworks.refactor.martinfolwerbook.model;

public abstract class PriceCode {
    public abstract double amountFor(int days);

    public int points(int days) {
        return 1;
    }
}

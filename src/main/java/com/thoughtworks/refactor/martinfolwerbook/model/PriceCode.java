package com.thoughtworks.refactor.martinfolwerbook.model;

public abstract class PriceCode {
    private static final int REGULAR = 0;
    private static final int NEW_RELEASE = 1;
    private static final int CHILDREN = 2;

    static PriceCode of(int priceCodeType) {
        switch (priceCodeType) {
            case REGULAR:
                return new RegularPriceCode();
            case NEW_RELEASE:
                return new NewReleasePriceCode();
            case CHILDREN:
                return new ChildrenPriceCode();
            default:
                return new DefaultPriceCode();
        }
    }

    public abstract double amountFor(int days);

    public int points(int days) {
        return 1;
    }
}

package com.thoughtworks.refactor.martinfolwerbook.model;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;
    private final PriceCode regularPriceCode = new RegularPriceCode();
    private final NewReleasePriceCode newReleasePriceCode = new NewReleasePriceCode();
    private final ChildPriceCode childPriceCode = new ChildPriceCode();

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    // 差异式编程: Programming by Difference
    public double amountFor(int days) {
        switch (priceCode) {
            case REGULAR:
                return regularPriceCode.amountFor(days);
            case NEW_RELEASE:
                return newReleasePriceCode.amountFor(days);
            case CHILDREN:
                return childPriceCode.amountFor(days);
        }
        return (double) 0;
    }

    public int pointsFor(int days) {
        int frequentRenterPoints = 1;
        if ((priceCode == NEW_RELEASE)
                &&
                days > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }
}

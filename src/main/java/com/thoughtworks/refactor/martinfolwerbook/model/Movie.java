package com.thoughtworks.refactor.martinfolwerbook.model;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

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

    public double amountFor(int days) {
        double thisAmount = 0;
        switch (priceCode) {
            case REGULAR:
                thisAmount += 2;
                if (days > 2) {
                    thisAmount += (days - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                thisAmount += days * 3;
                break;
            case CHILDREN:
                thisAmount += 1.5;
                if (days > 3)
                    thisAmount += (days - 3) * 1.5;
                break;
        }
        return thisAmount;
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

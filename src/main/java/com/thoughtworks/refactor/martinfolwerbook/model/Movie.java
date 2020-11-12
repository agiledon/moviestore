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
        switch (priceCode) {
            case REGULAR:
                return amountForRegular(days);
            case NEW_RELEASE:
                return amountForNewRelease(days);
            case CHILDREN:
                return amountForChild(days);
        }
        return (double) 0;
    }

    private double amountForChild(int days) {
        double thisAmount = 1.5;
        if (days > 3)
            thisAmount += (days - 3) * 1.5;
        return thisAmount;
    }

    private double amountForNewRelease(int days) {
        double thisAmount = days * 3;
        return thisAmount;
    }

    private double amountForRegular(int days) {
        double thisAmount = 2;
        if (days > 2) {
            thisAmount += (days - 2) * 1.5;
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

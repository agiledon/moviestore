package com.thoughtworks.refactor.martinfolwerbook.model;

public class Movie {
    private String title;
    private final PriceCode priceCode;

    public Movie(String title, int priceCodeType) {
        this.title = title;
        priceCode = PriceCode.of(priceCodeType);
    }

    public String getTitle() {
        return title;
    }

    // 差异式编程: Programming by Difference
    public double amountFor(int days) {
        return priceCode.amountFor(days);
    }

    public int pointsFor(int days) {
        return priceCode.points(days);
    }
}

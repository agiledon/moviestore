package com.thoughtworks.refactor.martinfolwerbook.model;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;
    private final PriceCode regularPriceCode = new RegularPriceCode();
    private final PriceCode newReleasePriceCode = new NewReleasePriceCode();
    private final PriceCode childPriceCode = new ChildrenPriceCode();

    private String title;
    private int priceCodeType;

    public Movie(String title, int priceCodeType) {
        this.title = title;
        this.priceCodeType = priceCodeType;
    }

    public void setPriceCodeType(int arg) {
        priceCodeType = arg;
    }

    public String getTitle() {
        return title;
    }

    // 差异式编程: Programming by Difference
    public double amountFor(int days) {
        PriceCode priceCode = createPriceCode();
        return priceCode.amountFor(days);
    }

    private PriceCode createPriceCode() {
        PriceCode priceCode;
        switch (priceCodeType) {
            case REGULAR:
                priceCode = new RegularPriceCode();
                break;
            case NEW_RELEASE:
                priceCode = new NewReleasePriceCode();
                break;
            case CHILDREN:
                priceCode = new ChildrenPriceCode();
                break;
            default:
                priceCode = new DefaultPriceCode();
        }
        return priceCode;
    }

    public int pointsFor(int days) {
        PriceCode priceCode = createPriceCode();
        return priceCode.points(days);
    }

}

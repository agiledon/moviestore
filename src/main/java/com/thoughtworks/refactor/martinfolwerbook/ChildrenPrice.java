package com.thoughtworks.refactor.martinfolwerbook;

public class ChildrenPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDREN;
    }
}

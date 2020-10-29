package com.thoughtworks.refactor.martinfolwerbook;

public abstract class CustomerView {
    protected final Customer customer;

    public CustomerView(Customer customer) {
        this.customer = customer;
    }

    public abstract String statement();
}

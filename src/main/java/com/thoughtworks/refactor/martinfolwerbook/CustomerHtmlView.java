package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerHtmlView extends CustomerView {
    public CustomerHtmlView(Customer customer) {
        super(customer);
    }

    @Override
    public String statement() {
        return null;
    }
}

package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerHtmlView extends CustomerView {
    public CustomerHtmlView(Customer customer) {
        super(customer);
    }

    @Override
    protected String statementHeader() {
        return null;
    }

    @Override
    protected String statementFigure(String result, Rental rental) {
        return null;
    }

    @Override
    protected String statementFooter(String result) {
        return null;
    }

}

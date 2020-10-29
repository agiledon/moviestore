package com.thoughtworks.refactor.martinfolwerbook;

public abstract class CustomerView {
    protected final Customer customer;

    public CustomerView(Customer customer) {
        this.customer = customer;
    }

    public final String statement() {
        String result = statementHeader();
        for (Rental rental : customer.getRentals()) {
            result = statementFigure(result, rental);
        }
        result = statementFooter(result);
        return result;
    }

    protected abstract String statementHeader();

    protected abstract String statementFigure(String result, Rental rental);

    protected abstract String statementFooter(String result);
}

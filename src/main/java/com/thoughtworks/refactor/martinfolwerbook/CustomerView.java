package com.thoughtworks.refactor.martinfolwerbook;

public abstract class CustomerView {
    protected final Customer customer;
    protected StringBuffer result = new StringBuffer();

    public CustomerView(Customer customer) {
        this.customer = customer;
    }

    public final String statement() {
        result.append(statementHeader());
        for (Rental rental : customer.getRentals()) {
            result.append(statementFigure(rental));
        }
        result.append(statementFooter());
        return result.toString();
    }

    protected abstract String statementHeader();

    protected abstract String statementFigure(Rental rental);

    protected abstract String statementFooter();
}

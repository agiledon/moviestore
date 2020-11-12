package com.thoughtworks.refactor.martinfolwerbook.view;

import com.thoughtworks.refactor.martinfolwerbook.model.Customer;
import com.thoughtworks.refactor.martinfolwerbook.model.Rental;

public class CustomerHtmlView extends CustomerView {
    public CustomerHtmlView(Customer customer) {
        super(customer);
    }

    @Override
    protected String statementHeader() {
        return null;
    }

    @Override
    protected String statementFigure(Rental rental) {
        return null;
    }

    @Override
    protected String statementFooter() {
        return null;
    }

}

package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerPlainTextView extends CustomerView {

    public CustomerPlainTextView(Customer customer) {
        super(customer);
    }

    @Override
    protected String statementHeader() {
        return String.format("Rental Record for %s\n", customer.getName());
    }

    @Override
    protected String statementFigure(Rental rental) {
        return String.format("\t%s\t%s\n", rental.getMovieTitle(), rental.amountFor());
    }

    @Override
    protected String statementFooter() {
        return String.format("Amount owed is %s\nYou earned %s frequent renter points",
                customer.totalAmount(),
                customer.totalPoints());
    }
}
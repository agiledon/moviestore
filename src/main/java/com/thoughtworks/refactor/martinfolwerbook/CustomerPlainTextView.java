package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerPlainTextView extends CustomerView {

    public CustomerPlainTextView(Customer customer) {
        super(customer);
    }

    @Override
    protected String statementHeader() {
        //header
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    protected String statementFigure(String result, Rental rental) {
        //figure
        result += "\t" + rental.getMovieTitle() + "\t" + rental.amountFor() + "\n";
        return result;
    }

    @Override
    protected String statementFooter(String result) {
        //footer
        result += "Amount owed is " + customer.totalAmount() + "\n";
        result += "You earned " + customer.totalPoints() +
                " frequent renter points";
        return result;
    }
}
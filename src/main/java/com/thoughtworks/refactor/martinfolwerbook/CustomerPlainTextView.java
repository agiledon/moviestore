package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerPlainTextView extends CustomerView {

    public CustomerPlainTextView(Customer customer) {
        super(customer);
    }

    @Override
    public String statement() {
        //header
        String result = "Rental Record for " + customer.getName() + "\n";

        for (Rental rental : customer.getRentals()) {
            //figure
            result += "\t" + rental.getMovieTitle() + "\t" + rental.amountFor() + "\n";
        }

        //footer
        result += "Amount owed is " + customer.totalAmount() + "\n";
        result += "You earned " + customer.totalPoints() +
                " frequent renter points";
        return result;
    }
}
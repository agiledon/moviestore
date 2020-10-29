package com.thoughtworks.refactor.martinfolwerbook;

public class CustomerView {
    private final Customer customer;

    public CustomerView(Customer customer) {
        this.customer = customer;
    }

    public String statement() {
        String result = "Rental Record for " + customer.getName() + "\n";
        for (Rental rental : customer.getRentals()) {
            result += "\t" + rental.getMovieTitle() + "\t" + rental.amountFor() + "\n";
        }
        result += "Amount owed is " + customer.totalAmount() + "\n";
        result += "You earned " + customer.totalPoints() +
                " frequent renter points";
        return result;
    }
}
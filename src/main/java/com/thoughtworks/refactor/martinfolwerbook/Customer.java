package com.thoughtworks.refactor.martinfolwerbook;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + rental.amountFor() + "\n";
        }
        result += "Amount owed is " + totalAmount() + "\n";
        result += "You earned " + totalPoints() +
                " frequent renter points";
        return result;
    }

    private int totalPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.pointsFor();
        }
        return frequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double thisAmount = rental.amountFor();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

}

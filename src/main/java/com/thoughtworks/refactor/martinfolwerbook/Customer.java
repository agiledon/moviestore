package com.thoughtworks.refactor.martinfolwerbook;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private final CustomerView customerView = new CustomerView(this);
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }


    public String statement() {
        return customerView.statement();
    }

    public int totalPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.pointsFor();
        }
        return frequentRenterPoints;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double thisAmount = rental.amountFor();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return this.rentals;
    }
}

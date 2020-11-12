package com.thoughtworks.refactor.martinfolwerbook.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double thisAmount = rental.amountFor();
            totalAmount += thisAmount;
        }
        return totalAmount;
    }

    public int totalPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            frequentRenterPoints += rental.pointsFor();
        }
        return frequentRenterPoints;
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return this.rentals;
    }
}

package com.thoughtworks.refactor.martinfolwerbook;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double amountFor() {
        return movie.amountFor(this.daysRented);
    }

    public int pointsFor() {
        return movie.pointsFor(this.daysRented);
    }

}

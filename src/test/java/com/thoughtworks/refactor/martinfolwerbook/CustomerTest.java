package com.thoughtworks.refactor.martinfolwerbook;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void should_statement_for_regular_movie() {
        Movie regularMovie = new Movie("Brave Heart", 0);
        Rental rental = new Rental(regularMovie, 3);
        Customer customer = new Customer("zhangyi");
        customer.addRental(rental);

        assertThat(customer.statement(), is("Rental Record for zhangyi\n\tBrave Heart\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points"));
    }
}

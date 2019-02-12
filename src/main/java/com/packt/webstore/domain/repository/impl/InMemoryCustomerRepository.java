package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> listOfCusomers = new ArrayList<Customer>();


    public InMemoryCustomerRepository() {
        Customer bob = new Customer("C1234", "Bob Marky", "Apple Street 12");
        bob.setNoOfOrdersMade(1);

        Customer mary = new Customer("C1235", "Mary Lu", "Valley Street 11");
        mary.setNoOfOrdersMade(5);

        Customer alan = new Customer("C1236", "Alan Werky", "Round Street ");
        alan.setNoOfOrdersMade(2);

        listOfCusomers.add(bob);
        listOfCusomers.add(mary);
        listOfCusomers.add(alan);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return listOfCusomers;
    }
}

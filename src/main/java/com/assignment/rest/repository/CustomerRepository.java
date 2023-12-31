package com.assignment.rest.repository;

import com.assignment.rest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmailIdIgnoreCase(String emailId);
    Optional<Customer> findByCustomerNameIgnoreCase(String customerName);
}

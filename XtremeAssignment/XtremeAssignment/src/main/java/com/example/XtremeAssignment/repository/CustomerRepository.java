package com.example.XtremeAssignment.repository;
import com.example.XtremeAssignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE " +
            "(:firstName IS NULL OR c.firstName LIKE :firstName%) AND " +
            "(:lastName IS NULL OR c.lastName LIKE :lastName%)")
    List<Customer> findByFirstNameAndLastName(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName);
}


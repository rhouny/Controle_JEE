package org.sid.servicecustomer.repository;

import org.sid.servicecustomer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

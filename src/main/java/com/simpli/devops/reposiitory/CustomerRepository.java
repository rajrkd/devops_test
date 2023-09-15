package com.simpli.devops.reposiitory;

import com.simpli.devops.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {
    Optional<Customers> findByCustomerId(Long customerId);

    Optional<List<Customers>> findByEmail(String email);

}

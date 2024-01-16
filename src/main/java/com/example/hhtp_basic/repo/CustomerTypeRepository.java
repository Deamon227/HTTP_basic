package com.example.hhtp_basic.repo;

import com.example.hhtp_basic.model.Customer;
import com.example.hhtp_basic.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}

package com.example.hhtp_basic.service.CustomerType;

import com.example.hhtp_basic.model.CustomerType;
import com.example.hhtp_basic.repo.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerTypeService implements ICustomerTypeService{
    @Autowired
    private CustomerTypeRepository customerTypeRepository;
    @Override
    public Iterable<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public Optional<CustomerType> findById(Long id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        customerTypeRepository.deleteById(id);
    }
}

package com.yardox.testWork.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yardox.testWork.dao.CustomerDAO;
import com.yardox.testWork.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static Logger log = LogManager.getLogger(CustomerServiceImpl.class);
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List < Customer > getCustomers() {
        log.info("getCustomers+++++++++++++++++");
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }
}
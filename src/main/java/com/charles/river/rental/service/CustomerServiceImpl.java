package com.charles.river.rental.service;

import com.charles.river.rental.db.CustomerPersister;
import com.charles.river.rental.model.CustomerInfo;

public class CustomerServiceImpl implements CustomerService {

  private CustomerPersister customerServicePersister;

  public CustomerServiceImpl(CustomerPersister customerServicePersister) {
    this.customerServicePersister = customerServicePersister;
  }

  @Override
  public boolean saveCustomerInfo(CustomerInfo customerInfo) {
    return customerServicePersister.saveCustomerInfo(customerInfo);
  }

  @Override
  public CustomerInfo getCustomerInfo(String email) {
    return customerServicePersister.getCustomerInfo(email);
  }
}

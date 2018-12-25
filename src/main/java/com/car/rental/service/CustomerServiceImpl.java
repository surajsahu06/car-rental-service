package com.car.rental.service;

import com.car.rental.db.CustomerPersister;
import com.car.rental.model.CustomerInfo;

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

package com.car.rental.service;

import com.car.rental.model.CustomerInfo;

public interface CustomerService {
  /**
   * Save the customer information to the system;
   *
   * @param customerInfo
   * @return
   */
  boolean saveCustomerInfo(CustomerInfo customerInfo);

  /**
   * Get the customer information by email
   *
   * @param email
   * @return
   */

  CustomerInfo getCustomerInfo(String email);
}

package com.charles.river.rental.service;

import com.charles.river.rental.model.CustomerInfo;

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

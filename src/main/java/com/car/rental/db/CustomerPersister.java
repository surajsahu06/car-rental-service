package com.car.rental.db;

import com.car.rental.model.CustomerInfo;

/**
 * Created by ssahoo on 12/23/18.
 */
public interface CustomerPersister {

  CustomerInfo getCustomerInfo(String email);

  boolean saveCustomerInfo(CustomerInfo customerInfo);
}

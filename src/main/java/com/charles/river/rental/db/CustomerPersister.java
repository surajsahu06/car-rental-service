package com.charles.river.rental.db;

import com.charles.river.rental.model.CustomerInfo;

/**
 * Created by ssahoo on 12/23/18.
 */
public interface CustomerPersister {

  CustomerInfo getCustomerInfo(String email);

  boolean saveCustomerInfo(CustomerInfo customerInfo);
}

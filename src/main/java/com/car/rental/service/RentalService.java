package com.car.rental.service;

import java.util.Date;

public interface RentalService {
  /**
   * rent selected vehicle;
   *
   * @param email
   * @param vehicleId
   * @return
   */
  boolean bookMyCar(String email, Integer vehicleId, Date pickup, Date returnDate);
}

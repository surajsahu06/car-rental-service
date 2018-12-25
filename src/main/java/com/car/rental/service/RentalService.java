package com.car.rental.service;

import java.util.Date;

public interface RentalService {
  /**
   * rent selected vehicle;
   *
   * @param email
   * @param vehicleNo
   * @return
   */
  boolean bookMyCar(String email, int vehicleNo, Date pickup, Date returnDate);
}

package com.charles.river.rental.db;

import java.util.List;

import com.charles.river.rental.model.VehicleBookingInfo;

public interface RentalPersister {
  /**
   * Save the order information details in @RentalInfo Table
   *
   * @param vehicleBookingInfo
   * @param email
   * @return
   */
  boolean saveRentalInfo(VehicleBookingInfo vehicleBookingInfo, String email);

  /**
   * This method will retrieve the booking information of particular vehicle id
   *
   * @param vehicleId
   * @return
   */
  List<VehicleBookingInfo> getbyVehicleId(int vehicleId);
}

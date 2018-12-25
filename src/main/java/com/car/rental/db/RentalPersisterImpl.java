package com.car.rental.db;

import java.util.ArrayList;
import java.util.List;

import com.car.rental.model.VehicleBookingInfo;

public class RentalPersisterImpl implements RentalPersister {

  @Override
  public boolean saveRentalInfo(VehicleBookingInfo vehicleBookingInfo, String email) {
    return true;
  }

  @Override
  public List<VehicleBookingInfo> getbyVehicleId(int vehicleId) {
    List<VehicleBookingInfo> list = new ArrayList<>();
    return list;
  }
}

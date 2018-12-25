package com.charles.river.rental.db;

import java.util.ArrayList;
import java.util.List;

import com.charles.river.rental.model.VehicleBookingInfo;

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

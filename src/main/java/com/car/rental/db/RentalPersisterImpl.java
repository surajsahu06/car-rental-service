package com.car.rental.db;

import java.util.ArrayList;
import java.util.List;

import com.car.rental.model.RentalInfo;
import com.car.rental.model.TransactionInfo;
import com.car.rental.model.VehicleBookingInfo;

public class RentalPersisterImpl implements RentalPersister {

  @Override
  public boolean saveRentalInfo(VehicleBookingInfo vehicleBookingInfo, String email) {
    RentalInfo rentalInfo = new RentalInfo();
    rentalInfo.setEmail(email);
    rentalInfo.setRentalId(1);
    rentalInfo.setTransactionInfo(new TransactionInfo());
    rentalInfo.setVehicleBookingInfo(vehicleBookingInfo);
    // and rental info can be saved to db here;
    return true;
  }

  @Override
  public List<VehicleBookingInfo> getbyVehicleId(int vehicleId) {
    List<VehicleBookingInfo> list = new ArrayList<>();
    return list;
  }
}

package com.car.rental.db;

import java.util.List;

import com.car.rental.model.VehicleType;
import com.car.rental.model.Vehicle;

/**
 * Created by ssahoo on 12/24/18.
 */
public class VehiclePersisterImpl implements VehiclePersister {
  @Override
  public Vehicle getVehicle(int vehicleId) {
    return null;
  }

  @Override
  public List<Vehicle> getAvailableVehicle(String pickupDate, String returnDate) {
    return null;
  }

  @Override
  public List<Vehicle> getAvailableVehicle(VehicleType vehicleType, String pickupDate, String returnDate) {
    return null;
  }

  @Override
  public boolean updateVehicleInfo(Vehicle vehicle) {
    return false;
  }
}

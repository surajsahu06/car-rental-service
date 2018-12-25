package com.charles.river.rental.db;

import java.util.List;

import com.charles.river.rental.model.Vehicle;
import com.charles.river.rental.model.VehicleType;

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

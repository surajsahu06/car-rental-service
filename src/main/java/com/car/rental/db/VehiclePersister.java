package com.car.rental.db;

import java.util.List;

import com.car.rental.model.Vehicle;
import com.car.rental.model.VehicleType;

/**
 * Created by ssahoo on 12/23/18.
 */
public interface VehiclePersister {

  Vehicle getVehicle(int vehicleId);

  List<Vehicle> getAvailableVehicle(String pickupDate, String returnDate);

  List<Vehicle> getAvailableVehicle(VehicleType vehicleType, String pickupDate, String returnDate);

  boolean updateVehicleInfo(Vehicle vehicle);
}

package com.charles.river.rental.db;

import java.util.List;

import com.charles.river.rental.model.Vehicle;
import com.charles.river.rental.model.VehicleType;

/**
 * Created by ssahoo on 12/23/18.
 */
public interface VehiclePersister {

  Vehicle getVehicle(int vehicleId);

  List<Vehicle> getAvailableVehicle(String pickupDate, String returnDate);

  List<Vehicle> getAvailableVehicle(VehicleType vehicleType, String pickupDate, String returnDate);

  boolean updateVehicleInfo(Vehicle vehicle);
}

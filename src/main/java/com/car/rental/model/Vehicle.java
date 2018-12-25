package com.car.rental.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Vehicle {

  private Integer vehicleId;

  private VehicleType vehicleType;

  private String vehicleName;

  public Integer getVehicleId() {
    return vehicleId;
  }

  public Vehicle setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public Vehicle setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
    return this;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public Vehicle setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return Pojomatic.equals(this, o);
  }

  @Override
  public int hashCode() {
    return Pojomatic.hashCode(this);
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}

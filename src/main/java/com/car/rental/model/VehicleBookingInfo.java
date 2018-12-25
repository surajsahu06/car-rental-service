package com.car.rental.model;

import java.util.Date;

import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class VehicleBookingInfo {

  private int vehicleId;

  private Date pickupDate;

  private Date returnDate;

  public Date getReturnDate() {
    return returnDate;
  }

  public VehicleBookingInfo setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
    return this;
  }

  public Date getPickupDate() {
    return pickupDate;
  }

  public VehicleBookingInfo setPickupDate(Date pickupDate) {
    this.pickupDate = pickupDate;
    return this;
  }

  public int getVehicleId() {
    return vehicleId;
  }

  public VehicleBookingInfo setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }
}

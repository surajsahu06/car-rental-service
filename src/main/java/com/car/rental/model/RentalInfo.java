package com.car.rental.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class RentalInfo {

 // this field can be incremental
  private Integer rentalId;

  private String email;

  private VehicleBookingInfo vehicleBookingInfo;

  // field for transaction info, but not using for now;
  private TransactionInfo transactionInfo;

  public Integer getRentalId() {
    return rentalId;
  }

  public void setRentalId(Integer rentalId) {
    this.rentalId = rentalId;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public VehicleBookingInfo getVehicleBookingInfo() {
    return vehicleBookingInfo;
  }
  public void setVehicleBookingInfo(VehicleBookingInfo vehicleBookingInfo) {
    this.vehicleBookingInfo = vehicleBookingInfo;
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

  public TransactionInfo getTransactionInfo() {
    return transactionInfo;
  }

  public RentalInfo setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
    return this;
  }
}

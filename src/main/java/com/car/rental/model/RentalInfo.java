package com.car.rental.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class RentalInfo {

  private Integer rentalId;

  private String email;

  private VehicleBookingInfo vehicle;

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

  public VehicleBookingInfo getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleBookingInfo vehicle) {
    this.vehicle = vehicle;
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

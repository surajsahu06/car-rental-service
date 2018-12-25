package com.car.rental.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.car.rental.db.RentalPersister;
import com.car.rental.model.CustomerInfo;
import com.car.rental.model.VehicleBookingInfo;

public class RentalServiceImpl implements RentalService {

  private static final Logger LOGGER = LoggerFactory.getLogger(RentalServiceImpl.class);

  private CustomerService customerService;

  private RentalPersister rentalPersister;

  private VehicleService vehicleService;

  public RentalServiceImpl(CustomerService customerService, RentalPersister rentalPersister,
    VehicleService vehicleService) {
    this.customerService = customerService;
    this.rentalPersister = rentalPersister;
    this.vehicleService = vehicleService;
  }

  @Override
  public boolean bookMyCar(String email, int vehicleId, Date pickup, Date returnDate) {
    if (email == null) {
      LOGGER.warn("email address is required!");
      return false;
    }
    if (pickup == null) {
      LOGGER.warn("pickup date is required!");
      return false;
    }
    if (returnDate == null) {
      LOGGER.warn("return date is required!");
      return false;
    }
    CustomerInfo customerInfo = customerService.getCustomerInfo(email);
    if (customerInfo == null) {
      LOGGER.info("customer is empty, please register first");
      return false;
    }
    List<VehicleBookingInfo> list = rentalPersister.getbyVehicleId(vehicleId);
    boolean isAvailable = vehicleService.isAvailable(list, pickup, returnDate);
    if (!isAvailable) {
      LOGGER.info("vehicle is not available with the given range");

      return false;
    }
    VehicleBookingInfo vehicleBookingInfo = new VehicleBookingInfo();
    vehicleBookingInfo.setPickupDate(pickup);
    vehicleBookingInfo.setReturnDate(returnDate);
    vehicleBookingInfo.setVehicleId(vehicleId);
    rentalPersister.saveRentalInfo(vehicleBookingInfo, email);
    return true;
  }
}

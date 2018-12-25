package com.car.rental.service;

import java.util.Date;
import java.util.List;

import com.car.rental.model.VehicleBookingInfo;

public interface VehicleService {

  boolean isAvailable(List<VehicleBookingInfo> bookingInfoList, Date pickupDate, Date returnDate);
}

package com.charles.river.rental.service;

import java.util.Date;
import java.util.List;

import com.charles.river.rental.model.VehicleBookingInfo;

public interface VehicleService {

  boolean isAvailable(List<VehicleBookingInfo> bookingInfoList, Date pickupDate, Date returnDate);
}

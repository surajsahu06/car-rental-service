package com.car.rental.service;

import java.util.Date;
import java.util.List;

import com.car.rental.model.VehicleBookingInfo;

public class VehicleServiceImpl implements VehicleService {

  @Override
  public boolean isAvailable(List<VehicleBookingInfo> bookingInfoList, Date pickupDate, Date returnDate) {
    //sort the booking details by pickup date
    if (bookingInfoList.isEmpty()) {
      return true;
    }
    //Collections.sort(bookingInfoList, (v1, v2) -> v1.getPickupDate().compareTo(v2.getPickupDate()));
    for (VehicleBookingInfo info : bookingInfoList) {
      if (pickupDate.after(info.getPickupDate()) && pickupDate.before(info.getReturnDate())) {
        return false;
      }
      if (returnDate.after(info.getPickupDate()) && returnDate.before(info.getReturnDate())) {
        return false;
      }
      if(pickupDate.before(info.getPickupDate()) && returnDate.after(info.getReturnDate())){
        return false;
      }
    }
    return true;
  }
}

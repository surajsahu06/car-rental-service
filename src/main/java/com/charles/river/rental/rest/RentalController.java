package com.charles.river.rental.rest;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charles.river.rental.service.RentalService;

@RestController
public class RentalController {

  private RentalService rentalService;

  public RentalController(RentalService rentalService) {
    this.rentalService = rentalService;
  }

  @PostMapping(path = "/rent")
  public ResponseEntity rentVehicle(String email, int vehicleId, Date pickup, Date returnDate) {
    boolean isBooked = rentalService.bookMyCar(email, vehicleId, pickup, returnDate);
    if (isBooked) {
      return ResponseEntity.ok("Booking has been successful");
    }
    return ResponseEntity.badRequest().build();
  }
}

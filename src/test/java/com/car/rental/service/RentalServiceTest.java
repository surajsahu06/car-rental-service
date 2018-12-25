package com.car.rental.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.car.rental.db.RentalPersister;
import com.car.rental.db.RentalPersisterImpl;
import com.car.rental.model.CustomerInfo;
import com.car.rental.model.VehicleBookingInfo;

public class RentalServiceTest {

  static String email = "riverTest@gmail.com";

  CustomerService customerService;

  RentalPersister rentalPersister;

  VehicleService vehicleService;

  @Test
  public void testBookMycar() {
    customerService = mock(CustomerServiceImpl.class);
    rentalPersister = mock(RentalPersisterImpl.class);
    vehicleService = mock(VehicleServiceImpl.class);
    CustomerInfo customerInfo = new CustomerInfo();
    customerInfo.setEmail(email);
    customerInfo.setFirstName("river");
    customerInfo.setLastName("water");
    customerInfo.setPhone(new Integer(123));
    VehicleBookingInfo info = new VehicleBookingInfo();
    info.setVehicleId(123);
    info.setPickupDate(getDate("01/02/2019"));
    info.setReturnDate(getDate("01/05/2019"));
    when(customerService.getCustomerInfo(email)).thenReturn(customerInfo);
    when(rentalPersister.saveRentalInfo(info, email)).thenReturn(true);

    List<VehicleBookingInfo> list = new ArrayList();

    when(vehicleService.isAvailable(list, getDate("01/02/2019"), getDate("01/05/2019"))).thenReturn(true);
    RentalService rentalService = new RentalServiceImpl(customerService, rentalPersister, vehicleService);
    boolean isBooked = rentalService.bookMyCar(email, 123, getDate("01/02/2019"), getDate("01/05/2019"));
    assertTrue(isBooked);
  }

  @Test
  public void testBookMycar_nullCustomer() {
    customerService = mock(CustomerServiceImpl.class);
    rentalPersister = mock(RentalPersisterImpl.class);
    vehicleService = mock(VehicleServiceImpl.class);
    CustomerInfo customerInfo = new CustomerInfo();
    customerInfo.setEmail(email);
    customerInfo.setFirstName("river");
    customerInfo.setLastName("water");
    customerInfo.setPhone(new Integer(123));
    when(customerService.getCustomerInfo(email)).thenReturn(null);

    List<VehicleBookingInfo> list = new ArrayList();

    when(vehicleService.isAvailable(list, getDate("01/02/2019"), getDate("01/05/2019"))).thenReturn(true);
    RentalService rentalService = new RentalServiceImpl(customerService, rentalPersister, vehicleService);
    boolean isBooked = rentalService.bookMyCar(email, 123, getDate("01/02/2019"), getDate("01/05/2019"));
    assertFalse(isBooked);
    verifyNoMoreInteractions(rentalPersister);
  }

  private Date getDate(String dateString) {
    SimpleDateFormat dateParser = new SimpleDateFormat("MM/dd/yyyy");
    try {
      return dateParser.parse(dateString);
    }
    catch (ParseException e) {
      e.printStackTrace();
    }
    return null;
  }
}

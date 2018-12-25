package com.car.rental.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.car.rental.model.VehicleBookingInfo;

/**
 * Created by ssahoo on 12/24/18.
 */
public class VehicleServiceTest {

  @Test
  public void testIsAvailable() {
    List<VehicleBookingInfo> list = new ArrayList();

    VehicleBookingInfo v1 = new VehicleBookingInfo();
    v1.setVehicleId(123);
    v1.setPickupDate(getDate("12/21/2018"));
    v1.setReturnDate(getDate("12/28/2018"));

    VehicleBookingInfo v2 = new VehicleBookingInfo();
    v2.setVehicleId(123);
    v2.setPickupDate(getDate("01/10/2019"));
    v2.setReturnDate(getDate("01/15/2019"));

    list.add(v1);
    list.add(v2);
    VehicleService vehicleService = new VehicleServiceImpl();
    boolean isAvailable = vehicleService.isAvailable(list, getDate("12/29/2018"), getDate("01/05/2019"));
    assertTrue(isAvailable);
  }

  @Test
  public void testIsNotAvailable() {
    List<VehicleBookingInfo> list = new ArrayList();

    VehicleBookingInfo v1 = new VehicleBookingInfo();
    v1.setVehicleId(123);
    v1.setPickupDate(getDate("12/21/2018"));
    v1.setReturnDate(getDate("12/28/2018"));

    VehicleBookingInfo v2 = new VehicleBookingInfo();
    v2.setVehicleId(123);
    v2.setPickupDate(getDate("01/10/2019"));
    v2.setReturnDate(getDate("01/15/2019"));

    list.add(v1);
    list.add(v2);
    VehicleService vehicleService = new VehicleServiceImpl();
    boolean isAvailable = vehicleService.isAvailable(list, getDate("12/25/2018"), getDate("01/05/2019"));
    assertFalse(isAvailable);
  }

  @Test
  public void testIsNotAvailable2() {
    List<VehicleBookingInfo> list = new ArrayList();

    VehicleBookingInfo v1 = new VehicleBookingInfo();
    v1.setVehicleId(123);
    v1.setPickupDate(getDate("12/21/2018"));
    v1.setReturnDate(getDate("12/28/2018"));

    VehicleBookingInfo v2 = new VehicleBookingInfo();
    v2.setVehicleId(123);
    v2.setPickupDate(getDate("01/10/2019"));
    v2.setReturnDate(getDate("01/15/2019"));

    list.add(v1);
    list.add(v2);
    VehicleService vehicleService = new VehicleServiceImpl();
    boolean isAvailable = vehicleService.isAvailable(list, getDate("12/29/2018"), getDate("01/11/2019"));
    assertFalse(isAvailable);
  }
  /* test if the requested (pickup, return) is before and after one of the booking interval*/
  @Test
  public void testIsNotAvailable3() {
    List<VehicleBookingInfo> list = new ArrayList();

    VehicleBookingInfo v1 = new VehicleBookingInfo();
    v1.setVehicleId(123);
    v1.setPickupDate(getDate("12/21/2018"));
    v1.setReturnDate(getDate("12/28/2018"));

    VehicleBookingInfo v2 = new VehicleBookingInfo();
    v2.setVehicleId(123);
    v2.setPickupDate(getDate("01/10/2019"));
    v2.setReturnDate(getDate("01/15/2019"));

    list.add(v1);
    list.add(v2);
    VehicleService vehicleService = new VehicleServiceImpl();
    boolean isAvailable = vehicleService.isAvailable(list, getDate("12/20/2018"), getDate("01/16/2019"));
    assertFalse(isAvailable);
  }
  @Test
  public void testIsAvailable4() {
    List<VehicleBookingInfo> list = new ArrayList();
    VehicleService vehicleService = new VehicleServiceImpl();
    boolean isAvailable = vehicleService.isAvailable(list, getDate("12/29/2018"), getDate("01/05/2019"));
    assertTrue(isAvailable);
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

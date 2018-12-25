package com.car.rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.car.rental.service.CustomerService;
import com.car.rental.service.RentalServiceImpl;
import com.car.rental.db.CustomerPersister;
import com.car.rental.db.CustomerPersisterImpl;
import com.car.rental.db.RentalPersister;
import com.car.rental.db.RentalPersisterImpl;
import com.car.rental.db.VehiclePersister;
import com.car.rental.db.VehiclePersisterImpl;
import com.car.rental.rest.RentalController;
import com.car.rental.service.CustomerServiceImpl;
import com.car.rental.service.RentalService;
import com.car.rental.service.VehicleService;
import com.car.rental.service.VehicleServiceImpl;

@Configuration
public class CarRentalServiceConfig {

  @Bean
  public CustomerPersister customerPersister() {
    return new CustomerPersisterImpl();
  }

  @Bean
  public VehiclePersister vehiclePersister() {
    return new VehiclePersisterImpl();
  }

  @Bean
  public RentalPersister rentalPersister() {
    return new RentalPersisterImpl();
  }

  @Bean
  public CustomerService customerService() {
    return new CustomerServiceImpl(this.customerPersister());
  }

  @Bean
  public VehicleService vehicleService() {
    return new VehicleServiceImpl();
  }

  @Bean
  public RentalService rentalService() {
    return new RentalServiceImpl(this.customerService(), this.rentalPersister(), this.vehicleService());
  }

  @Bean
  public RentalController rentalController() {
    return new RentalController(this.rentalService());
  }

}

package com.charles.river.rental;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.charles.river.rental.db.CustomerPersister;
import com.charles.river.rental.db.CustomerPersisterImpl;
import com.charles.river.rental.db.RentalPersister;
import com.charles.river.rental.db.RentalPersisterImpl;
import com.charles.river.rental.db.VehiclePersister;
import com.charles.river.rental.db.VehiclePersisterImpl;
import com.charles.river.rental.rest.RentalController;
import com.charles.river.rental.service.CustomerService;
import com.charles.river.rental.service.CustomerServiceImpl;
import com.charles.river.rental.service.RentalService;
import com.charles.river.rental.service.RentalServiceImpl;
import com.charles.river.rental.service.VehicleService;
import com.charles.river.rental.service.VehicleServiceImpl;

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

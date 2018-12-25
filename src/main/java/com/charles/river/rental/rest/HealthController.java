package com.charles.river.rental.rest;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.charles.river.rental.service.HealthCheckService;

@RestController
public class HealthController {

  private final HealthCheckService healthCheckService;

  @Inject
  public HealthController(HealthCheckService healthCheckService) {
    this.healthCheckService = healthCheckService;
  }

  @RequestMapping(value = "/health", method = {RequestMethod.GET,
    RequestMethod.HEAD}, produces = MediaType.TEXT_PLAIN_VALUE)
  public ResponseEntity<?> get() {
    if (!healthCheckService.isHealthy()) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    return ResponseEntity.ok().build();
  }
}
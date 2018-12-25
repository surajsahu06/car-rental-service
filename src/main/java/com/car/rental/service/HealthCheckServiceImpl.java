package com.car.rental.service;

import java.util.concurrent.atomic.AtomicBoolean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {
  private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckServiceImpl.class);

  private AtomicBoolean healthy = new AtomicBoolean(true);

  @Override
  public boolean isHealthy() {
    return healthy.get();
  }

  @Scheduled(initialDelay = 20000, fixedRate = 5000)
  public void checkHealth() {
    healthy.set(true);
    healthy.compareAndSet(false, true);
  }
}

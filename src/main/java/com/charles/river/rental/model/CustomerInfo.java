package com.charles.river.rental.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class CustomerInfo {

  private String firstName;

  private String lastName;

  private String email;

  private Integer phone;

  public String getFirstName() {
    return firstName;
  }

  public CustomerInfo setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public CustomerInfo setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public CustomerInfo setEmail(String email) {
    this.email = email;
    return this;
  }

  public Integer getPhone() {
    return phone;
  }

  public CustomerInfo setPhone(Integer phone) {
    this.phone = phone;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return Pojomatic.equals(this, o);
  }

  @Override
  public int hashCode() {
    return Pojomatic.hashCode(this);
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}

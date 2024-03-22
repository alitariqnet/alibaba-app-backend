package com.AlHassanElectronics.Software.Pojo;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class ShipmentDto {
    @Nonnull
    private Long id;
    @Nonnull
    private LocalDateTime shipmentTime;
    @Nonnull
    private String address;
    @Nonnull
    private String city;
    @Nullable
    private String state;
    @Nonnull
    private String country;
    @Nullable
    private String zipcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(LocalDateTime shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}

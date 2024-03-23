package com.AlHassanElectronics.Software.entity;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nonnull
    @Column(name = "shipment_date")
    private LocalDateTime shipmentTime;
    @Nonnull
    @Column(name = "address")
    private String address;
    @Nonnull
    @Column(name = "city")
    private String city;
    @Nullable
    @Column(name = "state")
    private String state;
    @Nonnull
    @Column(name = "country")
    private String country;
    @Nullable
    @Column(name = "zip_code")
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

package com.AlHassanElectronics.Software.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity")
    private int quantity;
    
}

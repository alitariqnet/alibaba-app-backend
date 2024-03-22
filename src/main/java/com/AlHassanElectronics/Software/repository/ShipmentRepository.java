package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Shipment;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ShipmentRepository extends JpaRepositoryImplementation<Shipment, Long> {
}

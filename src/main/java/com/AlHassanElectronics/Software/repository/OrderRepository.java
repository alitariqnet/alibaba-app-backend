package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Order;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {
}

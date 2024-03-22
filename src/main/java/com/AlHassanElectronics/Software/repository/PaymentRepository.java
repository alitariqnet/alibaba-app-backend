package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Payment;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface PaymentRepository extends JpaRepositoryImplementation<Payment, Long> {
}

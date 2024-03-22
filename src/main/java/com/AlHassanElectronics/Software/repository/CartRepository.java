package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Cart;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CartRepository extends JpaRepositoryImplementation<Cart, Long> {
}

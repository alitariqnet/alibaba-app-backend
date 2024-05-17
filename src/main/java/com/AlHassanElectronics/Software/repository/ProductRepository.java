package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Product;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {
}

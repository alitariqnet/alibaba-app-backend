package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.Item;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ItemRepository extends JpaRepositoryImplementation<Item, Long> {
}

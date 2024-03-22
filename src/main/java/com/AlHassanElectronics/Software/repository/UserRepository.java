package com.AlHassanElectronics.Software.repository;

import com.AlHassanElectronics.Software.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
    List<User> findAll();
    @Cacheable(value = "UserRepository.findByIdAndIsActiveTrue")
    Optional<User> findByIdAndIsActiveTrue(Long id);

    Optional<User> findOne(Specification<User> userSpecification);

    Optional<User> findByUsername(String username);
}

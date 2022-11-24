package com.example.Registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Registration.domain.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}


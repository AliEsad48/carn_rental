package com.lecture.car_rental.repository;

import com.lecture.car_rental.domain.User;
import com.lecture.car_rental.exception.ConflictException;
import com.lecture.car_rental.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username) throws ResourceNotFoundException;

    Boolean existsByUsername(String username) throws ConflictException;

    Boolean existsByEmail(String email) throws ConflictException;

}

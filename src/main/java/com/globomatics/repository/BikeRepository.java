package com.globomatics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomatics.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {
	

}

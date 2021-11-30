package com.globomatics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globomatics.model.Bike;
import com.globomatics.repository.BikeRepository;

@RestController
@RequestMapping("/bikes")
public class BikesController {
	
	@Autowired
	public BikeRepository bikeRepo;
	
	@GetMapping("/get")
	public List<Bike> list(){
//		List<Bike> bikes= new ArrayList<>();
		return bikeRepo.findAll();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Bike bike) {
		bikeRepo.save(bike);
	}
	
	@GetMapping("/get/{id}")
	public Bike getBike(@PathVariable("id") Long id) {
	Bike bike=bikeRepo.findById(id).get();
	return bike;
	
	}
	
}

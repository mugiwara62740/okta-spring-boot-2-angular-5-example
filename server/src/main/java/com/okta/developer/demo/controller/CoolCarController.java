package com.okta.developer.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okta.developer.demo.entities.Car;
import com.okta.developer.demo.service.CarService;

@RestController
class CoolCarController {
	@Autowired
	private CarService carService;


	@GetMapping("/cool-cars")
	public Collection<Car> coolCars() {
		return carService.findAllCars();
	}

	
}
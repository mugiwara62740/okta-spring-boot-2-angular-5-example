package com.okta.developer.demo.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okta.developer.demo.entities.Car;
import com.okta.developer.demo.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository repository;

	public Collection<Car> findAllCars() {
		return repository.findAll().stream().filter(this::isCool).collect(Collectors.toList());
	}

	private boolean isCool(Car car) {
		return !car.getName().equals("AMC Gremlin") && !car.getName().equals("Triumph Stag")
				&& !car.getName().equals("Ford Pinto") && !car.getName().equals("Yugo GV");
	}
}

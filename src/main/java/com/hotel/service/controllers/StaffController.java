package com.hotel.service.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class StaffController {

	@GetMapping
	public ResponseEntity<List<String>> getStaffDetails() {
		List<String> staffList = Arrays.asList("Person1", "Person2", "Person3", "Person4");
		return new ResponseEntity<List<String>>(staffList, HttpStatus.OK);
	}

}

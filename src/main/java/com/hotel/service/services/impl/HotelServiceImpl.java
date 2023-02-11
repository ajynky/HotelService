package com.hotel.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.service.entities.Hotel;
import com.hotel.service.exception.ResourceNotFoundException;
import com.hotel.service.payload.IdGenerator;
import com.hotel.service.repository.HotelRepository;
import com.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		hotel.setId(IdGenerator.generateUniqueId());
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel getHotel(String id) {
		return hotelRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel with not found with Id: " + id));
	}

	@Override
	public List<Hotel> getAllHotel() {
		return hotelRepository.findAll();
	}

}

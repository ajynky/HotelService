package com.hotel.service.services;

import java.util.List;

import com.hotel.service.entities.Hotel;

public interface HotelService {

	public Hotel createHotel(Hotel hotel);

	public Hotel getHotel(String id);

	public List<Hotel> getAllHotel();
}

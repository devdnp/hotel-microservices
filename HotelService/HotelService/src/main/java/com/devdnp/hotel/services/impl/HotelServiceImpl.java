package com.devdnp.hotel.services.impl;

import com.devdnp.hotel.entities.Hotel;
import com.devdnp.hotel.exceptions.ResourceNotFoundException;
import com.devdnp.hotel.repositories.HotelRepo;
import com.devdnp.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel get(String hotelId) {
        return hotelRepo.findById(hotelId)
                .orElseThrow(()->new ResourceNotFoundException("Hotel with given id not found"));
    }
}

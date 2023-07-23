package com.devdnp.hotel.services;

import com.devdnp.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //CREATE
    Hotel create(Hotel hotel);

    //GET All
    List<Hotel> getAll();

    //GET single
    Hotel get(String hotelId);


}

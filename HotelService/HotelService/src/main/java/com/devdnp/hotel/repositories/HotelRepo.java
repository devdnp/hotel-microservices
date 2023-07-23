package com.devdnp.hotel.repositories;

import com.devdnp.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,String> {

}

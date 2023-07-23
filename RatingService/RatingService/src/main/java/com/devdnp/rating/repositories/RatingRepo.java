package com.devdnp.rating.repositories;

import com.devdnp.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepo extends MongoRepository<Rating,String> {

    //Custom FINDER Methods

    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}

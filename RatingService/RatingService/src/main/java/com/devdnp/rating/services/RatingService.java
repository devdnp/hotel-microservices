package com.devdnp.rating.services;

import com.devdnp.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //CREATE
    Rating create(Rating rating);

    //GET All Ratings
    List<Rating> getRatings();

    //GET All by UserId
    List<Rating> getRatingByUserId(String userId);

    //GET All by HotelId
    List<Rating> getRatingByHotelId(String hotelId);

}

package com.rating.service.RatingService.service;

import com.rating.service.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating saveRating(Rating rating);
    List<Rating> getAllRatings();
    List<Rating> getRatingByUser(String userId);

    List<Rating> getRatingByHotel(String hotelId);
}

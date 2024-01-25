package com.rating.service.RatingService.controller;

import com.rating.service.RatingService.entity.Rating;
import com.rating.service.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    RatingService ratingService;

    @PostMapping("/saveRating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.saveRating(rating));
    }

    @GetMapping("/getAllRatings")
    public ResponseEntity<List<Rating>> getAllRatings() {
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

    @GetMapping("/getRatingsByUser")
    public ResponseEntity<List<Rating>> getRatingsByUser(@RequestParam String userId) {
        return ResponseEntity.ok(ratingService.getRatingByUser(userId));
    }

    @GetMapping("/getRatingsByHotel")
    public ResponseEntity<List<Rating>> getRatingsByHotel(@RequestParam String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotel(hotelId));
    }
}

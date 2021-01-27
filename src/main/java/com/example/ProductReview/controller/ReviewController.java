package com.example.ProductReview.controller;

import com.example.ProductReview.model.Review;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @Value("${server.port}")
    private String portNo;

    @GetMapping("/review")
    public ResponseEntity<Review> getReview(){

        return ResponseEntity.ok().body(new Review("It's Ok",portNo));
    }
}

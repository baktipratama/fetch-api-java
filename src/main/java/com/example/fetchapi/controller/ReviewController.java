package com.example.fetchapi.controller;

import com.example.fetchapi.entity.Review;
import com.example.fetchapi.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }

    @RequestMapping(value = "reviews_by_score", method = RequestMethod.GET)
    public List<Review> reviews_by_score(@RequestParam("score") Integer score){
        return reviewService.getReviewsByScore(score);
    }
}

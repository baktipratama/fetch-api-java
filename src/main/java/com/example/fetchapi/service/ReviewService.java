package com.example.fetchapi.service;

import com.example.fetchapi.entity.Review;
import com.example.fetchapi.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsByScore(Integer score){
        return reviewRepository.getReviewsByScore(score);
    }
}

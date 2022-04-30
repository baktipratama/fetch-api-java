package com.example.fetchapi.repository;

import com.example.fetchapi.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

    @Query(nativeQuery = true, value = "select reviewid, title, url, score, pub_year from reviews where score >= :score")
    List<Review> getReviewsByScore(@Param("score") Integer score);
}

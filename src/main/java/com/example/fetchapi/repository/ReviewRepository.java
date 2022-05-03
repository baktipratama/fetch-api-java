package com.example.fetchapi.repository;

import com.example.fetchapi.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, String> {

    @Query(nativeQuery = true, value = "SELECT r.reviewid, r.title, r.url, r.score, (SELECT GROUP_CONCAT(a.artist)) as artists, (SELECT GROUP_CONCAT(g.genre)) as genres, (SELECT GROUP_CONCAT(l.label)) as labels, r.pub_year FROM reviews as r join labels as l on l.reviewid = r.reviewid join artists as a on a.reviewid = r.reviewid join genres as g on g.reviewid = r.reviewid WHERE r.score >= :score GROUP BY r.reviewid LIMIT 10")
    List<Review> getReviewsByScore(@Param("score") Integer score);
}

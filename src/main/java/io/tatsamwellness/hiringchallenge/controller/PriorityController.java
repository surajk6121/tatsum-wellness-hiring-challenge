package io.tatsamwellness.hiringchallenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.tatsamwellness.hiringchallenge.model.Areas;
import io.tatsamwellness.hiringchallenge.model.Ratings;
import io.tatsamwellness.hiringchallenge.repository.AreaRepository;
import io.tatsamwellness.hiringchallenge.repository.RatingsRepository;

@RestController
public class PriorityController {

  private AreaRepository areaRepository;

  private RatingsRepository ratingsRepository;

  public PriorityController(AreaRepository areaRepository, RatingsRepository ratingsRepository) {
    this.areaRepository = areaRepository;
    this.ratingsRepository = ratingsRepository;
  }

  @GetMapping("/areas")
  public Iterable<Areas> getAreas() {

    return this.areaRepository.findAll();
  }

  @PostMapping("/ratings")
  public String addRatings(@RequestBody Ratings ratings) {

    try {
      ratings = ratingsRepository.save(ratings);

      return "Added ratings for userId: " + ratings.getUserid();
    } catch (Exception e) {

      return "Database Validation Error";
    }

  }

  @GetMapping("/ratings")
  public Iterable<Ratings> getRatings() {
    return this.ratingsRepository.findAll();
  }

}

package io.tatsamwellness.hiringchallenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.tatsamwellness.hiringchallenge.model.Ratings;

@Repository
public interface RatingsRepository extends CrudRepository<Ratings, Long> {

}

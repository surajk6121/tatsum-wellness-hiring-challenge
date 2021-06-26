package io.tatsamwellness.hiringchallenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.tatsamwellness.hiringchallenge.model.Areas;

@Repository
public interface AreaRepository extends CrudRepository<Areas, Long> {

}

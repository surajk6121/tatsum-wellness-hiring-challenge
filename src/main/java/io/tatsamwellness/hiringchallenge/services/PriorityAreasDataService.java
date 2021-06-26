package io.tatsamwellness.hiringchallenge.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.tatsamwellness.hiringchallenge.model.Areas;
import io.tatsamwellness.hiringchallenge.repository.AreaRepository;

@Service
public class PriorityAreasDataService {

  @Autowired
  private AreaRepository repo;

  @Value("#{'${initial.areas}'.split(',')}")
  private List<String> areasList;

  @PostConstruct
  public void fetchAreasList() {

    for (String areas : areasList) {
      Areas area = new Areas(areas);
      area = repo.save(area);
    }
  }

}

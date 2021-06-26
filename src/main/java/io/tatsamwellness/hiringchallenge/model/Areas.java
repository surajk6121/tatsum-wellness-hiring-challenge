package io.tatsamwellness.hiringchallenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Areas {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String area;

  public Areas() {
  }

  public Areas(String area) {
    this.area = area;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

}

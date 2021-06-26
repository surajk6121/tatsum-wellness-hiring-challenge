package io.tatsamwellness.hiringchallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Ratings {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(unique = true)
  private int userid;

  @Min(value = 1, message = "Rating should be between 1 to 5")
  @Max(value = 5, message = "Rating should be between 1 to 5")
  private int connectionRating;

  @Min(value = 1, message = "Rating should be between 1 to 5")
  @Max(value = 5, message = "Rating should be between 1 to 5")
  private int relationshipsRating;

  @Min(value = 1, message = "Rating should be between 1 to 5")
  @Max(value = 5, message = "Rating should be between 1 to 5")
  private int careerRating;

  @Min(value = 1, message = "Rating should be between 1 to 5")
  @Max(value = 5, message = "Rating should be between 1 to 5")
  private int wealthRating;

  public Ratings() {
  }

  public Ratings(int connectionRating, int relationshipsRating, int careerRating, int wealthRating) {
    this.connectionRating = connectionRating;
    this.relationshipsRating = relationshipsRating;
    this.careerRating = careerRating;
    this.wealthRating = wealthRating;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }

  public long getConnectionRating() {
    return connectionRating;
  }

  public void setConnectionRating(int connectionRating) {
    this.connectionRating = connectionRating;
  }

  public int getRelationshipsRating() {
    return relationshipsRating;
  }

  public void setRelationshipsRating(int relationshipsRating) {
    this.relationshipsRating = relationshipsRating;
  }

  public int getCareerRating() {
    return careerRating;
  }

  public void setCareerRating(int careerRating) {
    this.careerRating = careerRating;
  }

  public int getWealthRating() {
    return wealthRating;
  }

  public void setWealthRating(int wealthRating) {
    this.wealthRating = wealthRating;
  }

}

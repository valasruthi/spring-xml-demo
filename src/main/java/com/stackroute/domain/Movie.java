package com.stackroute.domain;

public class Movie  {
  @Override
  public String toString() {
    return "Movie{" +
      "actor=" + actor +
      '}';
  }

  private Actor actor;

  public Actor getActor() {
    return actor;
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

}

package com.stackroute.domain;

public class Movie  {
  @Override
  public String toString() {
    return "Movie{" +
      "actor=" + actor +
      ", actor2=" + actor2 +
      ", actor3=" + actor3 +
      '}';
  }

  private Actor actor;


  public Actor getActor2() {
    return actor2;
  }

  public void setActor2(Actor actor2) {
    this.actor2 = actor2;
  }

  public Actor getActor3() {
    return actor3;
  }

  public void setActor3(Actor actor3) {
    this.actor3 = actor3;
  }

  private Actor actor2;
  private Actor actor3;

  public Actor getActor() {
    return actor;
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

}

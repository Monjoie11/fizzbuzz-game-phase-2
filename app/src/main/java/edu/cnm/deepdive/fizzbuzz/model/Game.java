package edu.cnm.deepdive.fizzbuzz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Game implements Serializable {

  private static final long serialVersionUID = -313137155734152281L;
  private final int timielimit;
  private final int maxDigits;
  private final int gameDuration;
  private final List<Round> rounds;

  public Game(int timielimit, int maxDigits, int gameDuration) {
    this.timielimit = timielimit;
    this.maxDigits = maxDigits;
    this.gameDuration = gameDuration;
    rounds = new LinkedList<>();
  }
  public void add(Round round){
    rounds.add(round);
  }

  public int getGameDuration() {
    return gameDuration;
  }

  public List<Round> getRounds() {
    return Collections.unmodifiableList(rounds);
  }

  public int getTimielimit() {
    return timielimit;
  }

  public int getMaxDigits() {
    return maxDigits;
  }
}

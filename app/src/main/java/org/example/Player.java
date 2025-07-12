package org.example;

import java.util.ArrayList;
import java.util.Random;

// import java.util.Random;

public class Player {
  ArrayList<Monster> deck;
  int hp;

  Player() {
    Random random = new Random();
    this.deck = new ArrayList<>();
    this.hp = random.nextInt(5) + 5;
    drawMonsters();
  }

  private void drawMonsters() {
    for (int i = 0; i < 1; i++) {
      this.deck.add(new Monster()); // ← Randomで生成
    }
  }

  public int getHp() {
    return this.hp;
  }

  // デッキ表示用
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Monster m : deck) {
      sb.append(m.toString());
      sb.append("HP[" + this.hp + "]").append("\n");
    }
    return sb.toString();
  }

}

package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーは名前とモンスターデッキ（8体）を持つ
 */
public class Player {
  String name;
  int hp;
  ArrayList<Monster> deck;

  public Player(String name) {
    Random random = new Random();
    this.name = name;
    this.hp = random.nextInt(5) + 5;
    this.deck = new ArrayList<>();
    drawMonsters();
  }

  // デッキにモンスター8体を追加する（ランダム）
  private void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      this.deck.add(new Monster()); // ← Randomで生成
    }
  }

  public ArrayList<Monster> getDeck() {
    return this.deck;
  }

  public String getName() {
    return this.name;
  }

  // デッキ表示用
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:").append(name + " HP[" + this.hp + "]").append("\n");
    for (Monster m : deck) {
      sb.append(m.toString()).append("\n");
    }
    return sb.toString();
  }
}

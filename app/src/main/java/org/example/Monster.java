package org.example;

import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster() {
    Random random = new Random();
    // this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
    if (this.rare < 3) {
      this.name = this.summonMonster(random.nextInt(5));
    } else {
      this.name = this.summonMonster2(random.nextInt(5));
    }
  }

  Monster(String name, int rare) {
    this.name=name;
    this.rare = rare;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  String summonMonster2(int mnumber) {
    String monsters[] = { "キングスライム", "アビスウォーカー", "エンシェントドラゴン", "デスロード", "リヴァイアサン" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]";
  }
}

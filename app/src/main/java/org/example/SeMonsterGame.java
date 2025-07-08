package org.example;

import java.util.HashMap;
import java.util.Map;

public class SeMonsterGame {
  Map<String, Player> map = new HashMap<>();

  void addPlayer(String playerName) {
    Player player = new Player(playerName);
    map.put(playerName, player);
  }

  void draw(String playerName) {
    Player player = map.get(playerName);
  }
}

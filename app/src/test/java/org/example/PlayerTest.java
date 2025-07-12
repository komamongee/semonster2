package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void testPlayerName() {
    Player player = new Player("MUYO");
    assertEquals("MUYO", player.getName());
  }

  @Test
  public void testDeckSize() {
    Player player = new Player("MUYO");
    assertEquals(8, player.getDeck().size());
  }

  @Test
  public void testToStringFormat() {
    Player player = new Player("user");
    player.hp = 7;
    player.deck.clear();
    Monster m1 = new Monster("スライム", 0);
    player.deck.add(m1);
    Monster m2 = new Monster("サハギン", 1);
    player.deck.add(m2);
    Monster m3 = new Monster("ドラゴン", 2);
    player.deck.add(m3);
    Monster m4 = new Monster("デスロード", 3);
    player.deck.add(m4);
    Monster m5 = new Monster("リヴァイアサン", 4);
    player.deck.add(m5);
    Monster m6 = new Monster("ドラゴン", 1);
    player.deck.add(m6);
    Monster m7 = new Monster("ドラゴン", 2);
    player.deck.add(m7);
    Monster m8 = new Monster("キングスライム", 3);
    player.deck.add(m8);

    String expectedString = "Deck:user HP[7]\n" +
        "スライム:レア度[0]\n" +
        "サハギン:レア度[1]\n" +
        "ドラゴン:レア度[2]\n" +
        "デスロード:レア度[3]\n" +
        "リヴァイアサン:レア度[4]\n" +
        "ドラゴン:レア度[1]\n" +
        "ドラゴン:レア度[2]\n" +
        "キングスライム:レア度[3]\n";

    String actualString = player.toString();

    assertEquals(expectedString, actualString);
  }
}

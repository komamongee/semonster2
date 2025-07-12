package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeMonsterGameTest {
  @Test
  public void addPlayerTest() {
    SeMonsterGame classUnderTest = new SeMonsterGame();
    classUnderTest.addPlayer("Test");
    assertEquals("Test", classUnderTest.map.get("Test").name);
  }

  @Test
  public void drawTest() {
    SeMonsterGame classUnderTest = new SeMonsterGame();
    classUnderTest.addPlayer("Test");
    classUnderTest.draw("Test");
    Monster test = classUnderTest.map.get("Test").deck.get(0);
    test.name = "スライム";
    assertEquals("スライム", classUnderTest.map.get("Test").deck.get(0).name);
  }
}

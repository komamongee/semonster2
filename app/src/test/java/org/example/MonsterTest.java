package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {
  @Test
  public void summonMonsterTest() {
    Monster classUnderTest = new Monster();
    assertEquals("スライム", classUnderTest.summonMonster(0));
  }
}

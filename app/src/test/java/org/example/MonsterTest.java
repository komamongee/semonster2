package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void summonMonsterTest() {
    Monster classUnderTest = new Monster();
    assertEquals("スライム", classUnderTest.summonMonster(0));
  }

  @Test
  public void toStringTest() {
    Monster classUnderTest = new Monster();
    assertEquals(classUnderTest.name + ":レア度[" + classUnderTest.rare + "]", classUnderTest.toString());
  }
}

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
  @Test
  public void toStringTest2() {
    Monster classUnderTest = new Monster();
    classUnderTest.rare = 3;
    assertEquals(classUnderTest.name + ":レア度[" + classUnderTest.rare + "]", classUnderTest.toString());
  }
}

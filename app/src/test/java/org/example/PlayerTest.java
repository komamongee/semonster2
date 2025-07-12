package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

  @Test
  public void getHpTest() {
    Player classUnderTest = new Player();
    classUnderTest.hp = 8;
    assertEquals(8, classUnderTest.getHp());
  }

  @Test
  public void ToStringTest() {
    Monster classUnderTest = new Monster();
    Player crassUnderTest = new Player();
    classUnderTest.rare = 3;
    crassUnderTest.hp = 4;
    assertEquals(classUnderTest.name + ":レア度[" + classUnderTest.rare + "]HP[" + crassUnderTest.hp + "]",
        crassUnderTest.toString());
  }
}

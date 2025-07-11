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
        Player player = new Player("ちとせ");
        String output = player.toString();
        assertTrue(output.contains("→"));
        assertTrue(output.contains("レア度["));
    }
}

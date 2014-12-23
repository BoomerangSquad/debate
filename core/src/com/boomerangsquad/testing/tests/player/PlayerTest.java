package com.boomerangsquad.testing.tests.player;

import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by denny on 14-12-22.
 */
@RunWith(GdxTestRunner.class)
public class PlayerTest {

    Player player;
    final String mPlayerName = "Andy";

    @Before
    public void setUp() throws Exception {
        player = new Player(mPlayerName);
    }

    @Test
    public void canWeGetThePlayerName() throws Exception {
        assertEquals(mPlayerName, player.getName());
    }

    @Test
    public void doesSettingThePlayerNameStoreNewName() throws Exception {
        String newName = "Jimmy";
        player.setName(newName);
        assertEquals(newName, player.getName());
    }
}

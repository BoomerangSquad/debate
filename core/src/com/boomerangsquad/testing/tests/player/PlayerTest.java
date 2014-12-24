package com.boomerangsquad.testing.tests.player;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.statuseffect.StatusEffect;
import com.boomerangsquad.testing.GdxTestRunner;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denny on 14-12-22.
 */
@RunWith(GdxTestRunner.class)
public class PlayerTest {

    Player mPlayer;
    final String mPlayerName = "Andy";
    final int mPlayerStartingHealth = 50;

    @Before
    public void setUp() throws Exception {
        mPlayer = new Player(mPlayerName);
    }

    @Test
    public void canWeGetThePlayerName() throws Exception {
        assertEquals(mPlayerName, mPlayer.getName());
    }

    @Test
    public void doesSettingThePlayerNameStoreNewName() throws Exception {
        String newName = "Jimmy";
        mPlayer.setName(newName);
        assertEquals(newName, mPlayer.getName());
    }

    @Test
    public void canWeGetThePlayersCurrentHealth() throws Exception {
        assertEquals(mPlayerStartingHealth, mPlayer.getHealth());
    }

    @Test
    public void canWeManuallySetThePlayersHealth() throws Exception {
        int newHealth = 20;
        mPlayer.setHealth(newHealth);
        assertEquals(newHealth, mPlayer.getHealth());
    }

    @Test
    public void canWeGetTheListOfStatusEffects() throws Exception {
        //List Starts Empty
        assertEquals(0, mPlayer.getStatusEffects().size());
        assertEquals(ArrayList.class.getName(), mPlayer.getStatusEffects().getClass().getName());
    }

    @Test
    public void canWeGetTheDeck() throws Exception {
        assertEquals(ArrayList.class.getName(), mPlayer.getDeck().getClass().getName());
    }

    @Test
    public void canWeGetTheHand() throws Exception {
        assertEquals(ArrayList.class.getName(), mPlayer.getHand().getClass().getName());
    }

    @Test
    public void willDrawingACardWithNoDeckReturnFalse() throws Exception {
        assertFalse(mPlayer.drawCard());
    }
}

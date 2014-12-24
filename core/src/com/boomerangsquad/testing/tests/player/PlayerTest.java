package com.boomerangsquad.testing.tests.player;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.cardlist.Deck;
import com.boomerangsquad.debate.player.cardlist.Hand;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

/**
 * Created by denny on 14-12-22.
 */
@RunWith(GdxTestRunner.class)
public class PlayerTest {

    Player mPlayer;
    Card mTestCard;
    final String mPlayerName = "Andy";
    final int mPlayerStartingHealth = 50;

    @Before
    public void setUp() throws Exception {
        mPlayer = new Player(mPlayerName);
        mTestCard = new Card(mPlayer, "test");
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
        assertEquals(Deck.class.getName(), mPlayer.getDeck().getClass().getName());
    }

    @Test
    public void canWeGetTheHand() throws Exception {
        assertEquals(Hand.class.getName(), mPlayer.getHand().getClass().getName());
    }

    @Test
    public void willDrawingACardWithNoDeckReturnFalse() throws Exception {
        assertFalse(mPlayer.drawCard());
    }

//    @Test
//    public void willDrawingACardAddToHand() throws Exception {
//        mPlayer.getDeck().addCard(mTestCard);
//        mPlayer.drawCard();
//        assertEquals(mTestCard, mPlayer.getHand().getCard(0));
//    }
}

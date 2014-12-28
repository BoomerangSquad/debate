package com.boomerangsquad.testing.tests.player;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.cardlist.Deck;
import com.boomerangsquad.debate.player.cardlist.Hand;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.util.Constants;
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
    Card mTestCard;
    final String mPlayerName = "Andy";
    final int mPlayerStartingHealth = Constants.STARTING_HEALTH;

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

    @Test
    public void willDrawingACardAddToHand() throws Exception {
        mPlayer.getDeck().addCard(mTestCard);
        mPlayer.drawCard();
        assertEquals(mTestCard, mPlayer.getHand().getCard(0));
    }

    @Test
    public void drawingMultipleCardsWithNoDeckRetunsFalses() throws Exception {
        List<Boolean> success = mPlayer.drawCard(3);
        for(int i = 0; i < 3; i++){
            assertFalse(success.get(i));
        }
    }

    @Test
    public void drawingMultipleCardsTakesCardFromDeckToHandWithTrues() throws Exception {

        //Add Cards To Deck
        for(int i = 0; i < 3; i++){
            mPlayer.getDeck().addCard(mTestCard);
        }
        //Make Sure Deck was added to Correct
        assertEquals(3, mPlayer.getDeck().size());
        assertTrue(mPlayer.getHand().isEmpty());

        //Draw Cards
        List<Boolean> success = mPlayer.drawCard(3);

        //Test that Integration Worked
        assertEquals(3, mPlayer.getHand().size());
        for(int i = 0; i < 3; i++){
            assertEquals(mTestCard, mPlayer.getHand().getCard(0));
            assertTrue(success.get(i));
        }
        assertTrue(mPlayer.getDeck().isEmpty());
    }

    @Test
    public void drawingMaxCardsWillSetHandToConstantValue() throws Exception {
        //Add Cards to Deck
        for(int i = 0; i < Constants.FULL_HAND; i++){
            mPlayer.getDeck().addCard(mTestCard);
        }

        assertEquals(0, mPlayer.getHand().size());

        //Draw Cards to Hand
        List<Boolean> success = mPlayer.drawMaxCards();
        assertEquals(Constants.FULL_HAND, mPlayer.getHand().size());
        for(int i = 0; i < success.size(); i++){
            assertTrue(success.get(i));
        }
    }
}

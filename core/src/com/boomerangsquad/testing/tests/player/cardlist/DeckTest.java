package com.boomerangsquad.testing.tests.player.cardlist;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.cardlist.Deck;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by denny on 14-12-24.
 */
@RunWith(GdxTestRunner.class)
public class DeckTest {
    Player mPlayer;
    Card mTestCard, mTestCardTwo;
    Deck mDeck;
    private final String testStringOne = "Test";
    private final String testStringTwo = "TestTwo";

    @Before
    public void setUp(){
        mPlayer = new Player("Bobby");

        mTestCard = new Card(mPlayer, testStringOne);
        mTestCardTwo = new Card(mPlayer, testStringTwo);
        mDeck = new Deck();
    }

    @Test
    public void canWeCheckIfDeckIsEmpty() throws Exception {
        assertTrue(mDeck.isEmpty());
    }

    @Test
    public void canWeAddACardToTheDeck() throws Exception {
        boolean added = mDeck.addCard(mTestCard);
        assertTrue(added);
        assertEquals(mTestCard, mDeck.drawCard());

    }

    @Test
    public void willDrawCardTakeTheTopCard() throws Exception {
        mDeck.addCard(mTestCard);
        mDeck.addCard(mTestCardTwo);
        assertEquals(mTestCard, mDeck.drawCard());
    }

    @Test
    public void willAddingNullToTheDeckReturnFalse() throws Exception {
        boolean added = mDeck.addCard(null);
        assertFalse(added);
    }

    @Test
    public void drawingAnEmptyCardWillReturnNull() throws Exception {
        assertEquals(null, mDeck.drawCard());
    }

    @Test
    public void callingSizeReturnsCurrentSizeOfDeck() throws Exception {
        assertEquals(0, mDeck.size());
        mDeck.addCard(mTestCard);
        assertEquals(1, mDeck.size());
    }

    @Test
    public void drawingARandomCardWillPullCardFromAnywhereInDeck() throws Exception {
        //Note this could fail occasionally, statistically improbable
        mDeck.addCard(mTestCard);
        for(int i = 0; i < 1000; i++){
            mDeck.addCard(mTestCardTwo);
        }
        assertEquals(mTestCardTwo, mDeck.drawRandomCard());
    }

    @Test
    public void drawingARandomCardWithNoDeckWillReturnNull() throws Exception {
        assertEquals(null, mDeck.drawRandomCard());
    }

    @Test
    public void shuffleDeckWillMoveCardOffFirstElement() throws Exception {
        mDeck.addCard(mTestCard);
        for(int i = 0; i < 1000; i++){
            mDeck.addCard(mTestCardTwo);
        }

        mDeck.shuffleDeck();
        assertEquals(mTestCardTwo, mDeck.drawCard());
    }

    @Test
    public void getCardAtPositionWillReturnThatCardFromDeck() throws Exception {
        mDeck.addCard(mTestCard);
        mDeck.addCard(mTestCardTwo);
        assertEquals(mTestCardTwo, mDeck.getCard(1));
    }

    @Test
    public void getCardWithNoCardsInDeckReturnsNull() throws Exception {
        assertEquals(null, mDeck.getCard(0));
    }
}

package com.boomerangsquad.testing.tests.player.cardlist;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.player.cardlist.CardList;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
/**
 * Created by denny on 14-12-24.
 */
@RunWith(GdxTestRunner.class)
public class CardListTest {
    CardList mTestList;
    Player mPlayer;
    Card mTestCardOne, mTestCardTwo;

    @Before
    public void setUp() throws Exception {
        mTestList = new CardList();
        mPlayer = new Player("Andy");
        mTestCardOne = new Card(mPlayer, "testcardone");
        mTestCardTwo = new Card(mPlayer, "testcardtwo");
    }

    @Test
    public void addingACardPlacedCardInCardList() throws Exception{
        boolean added = mTestList.addCard(mTestCardOne);
        assertTrue(added);
        assertEquals(mTestCardOne, mTestList.getCard(0));
    }

    @Test
    public void addingACardWithPositonAddsTheCardToThatPosition() throws Exception{
        mTestList.addCard(mTestCardOne);
        mTestList.addCard(mTestCardOne);
        boolean added = mTestList.addCard(mTestCardTwo, 1);
        assertTrue(added);
        assertEquals(mTestCardTwo, mTestList.getCard(1));
    }

    @Test
    public void addingACardInPositionWhileListIsFullReturnsFalse() throws Exception{
        mTestList.setFull(0);
        boolean added = mTestList.addCard(mTestCardOne, 0);
        assertFalse(added);
    }

    @Test
    public void addingACardInPositonWhileCardIsNullReturnsFalse() throws Exception {
        boolean added = mTestList.addCard(null, 0);
        assertFalse(added);
    }

    @Test
    public void addingACardWithAPositionLowerThen0WillReturnFalse() throws Exception{
        boolean added = mTestList.addCard(mTestCardOne, -1);
        assertFalse(added);
    }

    @Test
    public void addingACardWithAPositionHigherThenSizeOfListWillReturnFalse() throws Exception {
        boolean added = mTestList.addCard(mTestCardOne, 1);
        assertFalse(added);
    }

    @Test
    public void getCardReturnsTheCardAtDesiredPosition() throws Exception {
        mTestList.addCard(mTestCardOne);
        mTestList.addCard(mTestCardTwo);
        assertEquals(mTestCardOne, mTestList.getCard(0));
        assertEquals(mTestCardTwo, mTestList.getCard(1));
    }

    @Test
    public void settingFullWillChangeTheFullAmount() throws Exception {
        assertEquals(100, mTestList.getFull());
        mTestList.setFull(10);
        assertEquals(10, mTestList.getFull());
    }

    @Test
    public void addingACardWhenListIsFullReturnsFalse() throws Exception {
        mTestList.setFull(0);
        boolean added = mTestList.addCard(mTestCardTwo);
        assertFalse(added);
    }

    @Test
    public void addingANullIntoListWillReturnFalse() throws Exception {
        boolean added = mTestList.addCard((Card)null);
        assertFalse(added);
    }

    @Test
    public void gettingACardThatDoesntExistReturnsNull() throws Exception {
        mTestList.addCard(mTestCardOne);
        assertEquals(null, mTestList.getCard(2));
    }

    @Test
    public void isEmptyWillBeTrueIfListIsEmpty() throws Exception {
        assertEquals(true, mTestList.isEmpty());
    }

    @Test
    public void isEmptyWillBeFalseIfListIsNotEmpty() throws Exception {
        mTestList.addCard(mTestCardOne);
        assertFalse(mTestList.isEmpty());
    }

    @Test
    public void isFullWillBeFalseIfTheListDoesNotReachFULLVariable() throws Exception {
        mTestList.setFull(100);
        assertFalse(mTestList.isFull());
    }

    @Test
    public void isFullWillBeTrueIfTheListReachesFULLVariable() throws Exception {
        mTestList.setFull(1);
        mTestList.addCard(mTestCardTwo);
        assertTrue(mTestList.isFull());
    }

    @Test
    public void sizeReturnsTheCurrentSizeOfTheList() throws Exception {
        assertEquals(0, mTestList.size());
        mTestList.addCard(mTestCardTwo);
        assertEquals(1, mTestList.size());
    }

    @Test
    public void removeCardReturnsTheCardFromList() throws Exception {
        mTestList.addCard(mTestCardOne);
        mTestList.addCard(mTestCardTwo);
        assertEquals(2, mTestList.size());
        assertEquals(mTestCardTwo, mTestList.removeCard(1));
        assertEquals(1, mTestList.size());
    }

    @Test
    public void removingACardThatDoesntExistReturnsNull() throws Exception {
        mTestList.addCard(mTestCardOne);
        assertEquals(null, mTestList.removeCard(3));
    }
}

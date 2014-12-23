package com.boomerangsquad.testing.tests.card;

/**
 * Created by denny on 14-12-22.
 */
import static org.junit.Assert.*;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class CardTest {
    Card mTestCard;
    final String mPlayerName = "Andy";
    final Player mInitalPlayer = new Player(mPlayerName);
    final String mText = "Argue";

    @Before
    public void setUp() throws Exception {
        mTestCard = new Card(mInitalPlayer, mText);
    }

    @Test
    public void doesOwnerReturnAPlayerObject() throws Exception {
        assertEquals(mPlayerName, mTestCard.getOwner().getName());
        assertEquals(Player.class.getName(), mTestCard.getOwner().getClass().getName());
        assertEquals(mInitalPlayer, mTestCard.getOwner());
    }

    public void doesSettingOwnerChangePlayerObject() throws Exception {
        Player newPlayer = new Player("Jimmy");
        mTestCard.setOwner(newPlayer);
        assertEquals(newPlayer, mTestCard.getOwner());
    }

    @Test
    public void doesGetTextReturnTextPassed() throws Exception {
        assertEquals(mText, mTestCard.getText());
    }

    @Test
    public void doesSettingTheTestChangeText() throws Exception {
        String newText = "New Text";
        mTestCard.setText(newText);
        assertEquals(newText, mTestCard.getText());
    }


}

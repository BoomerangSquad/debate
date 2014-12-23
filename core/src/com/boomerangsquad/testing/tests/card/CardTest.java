package com.boomerangsquad.testing.tests.card;

/**
 * Created by denny on 14-12-22.
 */
import static org.junit.Assert.*;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.game.WorldController;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class CardTest {
    Card testCard;

    @Before
    public void setUp() throws Exception {
        testCard = new Card(new Player("Andy"), "Argue");

    }

    @Test
    public void doesOwnerReturnAPlayerObject() throws Exception {
        assertEquals("Andy", testCard.getOwner().getName());
        assertEquals("com.boomerangsquad.debate.player.Player", testCard.getOwner().getClass().getName());

    }
}

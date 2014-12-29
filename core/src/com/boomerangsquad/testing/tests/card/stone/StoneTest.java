package com.boomerangsquad.testing.tests.card.stone;
import com.boomerangsquad.debate.card.stone.Color;
import com.boomerangsquad.debate.card.stone.Stone;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by denny on 14-12-28.
 */
@RunWith(GdxTestRunner.class)
public class StoneTest {
   Player mPlayer;
   String mText;
   Stone mStone;

    @Before
    public void setUp() throws Exception {
        mPlayer = new Player("Andy");
        mText = "Player";
        mStone = new Stone(mPlayer, mText);
    }

    @Test
    public void getDefaultColorIsNone() throws Exception {
        assertEquals(Color.NONE, mStone.getColor());
    }

    public void settingColorWillChangeTheColorProperty() throws Exception {
        mStone.setColor(Color.BLUE);
        assertEquals(Color.BLUE, mStone.getColor());
    }
}

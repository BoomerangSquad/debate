package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denny on 14-12-23.
 */
public class Hand extends CardList {

    private List<Card> mHand;

    public Hand() {
        super();
        FULL = Constants.FULL_HAND;
    }

}

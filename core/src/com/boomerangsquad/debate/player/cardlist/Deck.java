package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by denny on 14-12-23.
 */
public class Deck extends CardList{

    public Deck(){
        super();
    }

    public boolean addCardInRandomPosition(Card card){
        Random random = new Random();
        mCardList.add(random.nextInt(mCardList.size()), card);
        return true;
    }

    public Card drawCard(){
        if(!isEmpty()){
            return mCardList.remove(0);
        }
        return null;
    }

    public Card drawRandomCard(){
        if(!isEmpty()){
            Random random = new Random();
            return mCardList.remove(random.nextInt(mCardList.size()));
        }
        return null;
    }

    public void shuffleDeck() {
        long seed = System.nanoTime();
        Collections.shuffle(mCardList);
    }
}

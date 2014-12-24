package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

/**
 * Created by denny on 14-12-24.
 */
public interface CardListInterface {
    public boolean addCard(Card card);
    public boolean isFull();
    public Card getCard(int position);
    public boolean isEmpty();
    public int size();
    public Card removeCard(int position);
    public int findCardByName(String name);
    public int[] findCardsByName(String name);
}

package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

/**
 * Created by denny on 14-12-24.
 */
public interface CardListInterface {
    public boolean addCard(Card card);
    public boolean addCard(Card card, int position);
    public boolean isFull();
    public void setFull(int number);
    public int getFull();
    public Card getCard(int position);
    public boolean isEmpty();
    public int size();
    public Card removeCard(int position);
    public int findCardByName(String name);
    public int[] findCardsByName(String name);
}

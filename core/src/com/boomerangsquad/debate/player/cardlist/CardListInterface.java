package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

import java.util.List;

/**
 * Created by denny on 14-12-24.
 */
public interface CardListInterface {
    public boolean addCard(Card card);
    public boolean addCard(Card card, int position);
    public List<Boolean> addCard(List<Card> cards);
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

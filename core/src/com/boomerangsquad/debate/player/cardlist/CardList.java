package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denny on 14-12-24.
 */
public class CardList implements CardListInterface {
    protected List<Card> mCardList;
    protected int FULL;

    public CardList() {
        mCardList = new ArrayList<Card>();
        FULL = 100;
    }

    @Override
    public void setFull(int number){
        FULL = number;
    }

    @Override
    public int getFull(){
        return FULL;
    }

    @Override
    public boolean addCard(Card card){
       if(!isFull() && card != null){
            mCardList.add(card);
           return true;
       }
        return false;
    }

    @Override
    public boolean isFull(){
        return mCardList.size() >= FULL;
    }

    @Override
    public Card getCard(int position) {
        if(mCardList.size()-1 >= position){
            return mCardList.get(position);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return mCardList.isEmpty();
    }

    @Override
    public int size() {
        return mCardList.size();
    }

    @Override
    public Card removeCard(int position) {
        if(mCardList.size()-1 >= position){
            return mCardList.remove(position);
        }
        return null;
    }

    @Override
    public int findCardByName(String name) {
        return 0;
    }

    @Override
    public int[] findCardsByName(String name) {
        return new int[0];
    }
}

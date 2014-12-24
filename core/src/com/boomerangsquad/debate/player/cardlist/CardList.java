package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Card List contains an arraylist of Cards. These lists have some basic
 * methods. It is intended that this class be extended.
 *
 * Created by denny on 14-12-24.
 */
public class CardList implements CardListInterface {
    protected List<Card> mCardList;
    protected int FULL;

    /**
     * Constructor
     */
    public CardList() {
        mCardList = new ArrayList<Card>(); //Create new Arrayist
        FULL = 100; //Set Default Full Size
    }

    /**
     * Set full Variable. This is the max amount of cards allowed in list.
     *
     * @param number New FULL value
     */
    @Override
    public void setFull(int number){
        FULL = number;
    }

    /**
     * Get Full Value
     * @return FULL, Max amount of Cards allowed in list
     */
    @Override
    public int getFull(){
        return FULL;
    }

    /**
     * Add a Card to the CardList. If the Card is null or the list is full
     * return false. If successful, return true
     *
     * @param card Card to add to List
     * @return Was Insertion Successful
     */
    @Override
    public boolean addCard(Card card){
       if(!isFull() && card != null){
            mCardList.add(card);
           return true;
       }
        return false;
    }

    /**
     * Add a Card to the CardList at the specified position. If the card is null, the list is full,
     * or the position is outside of the array, return false. If Successful, return true
     *
     * @param card Card to add to the List
     * @param position Position of the list to add the card at
     * @return Card was entered successfuly.
     */
    @Override
    public boolean addCard(Card card, int position){
        if(!isFull() && card != null && position < size() && position > -1){
            mCardList.add(position, card);
            return true;
        }
        return false;
    }

    /**
     * If the List is the same, or larger, then the FULL variable, the list
     * is full.
     *
     * @return Is the List larger or the same as the Full Variable
     */
    @Override
    public boolean isFull(){
        return mCardList.size() >= FULL;
    }

    /**
     * Return the Card residing at the position in the array (Starting at 0).
     * If their is no card in the desired position, return null.
     *
     * @param position Position to get card from Array (Starts at 0)
     * @return Either the Card Found, or Null.
     */
    @Override
    public Card getCard(int position) {
        //Does this position in the array exist?
        if(mCardList.size()-1 >= position){
            return mCardList.get(position);
        }
        return null;
    }

    /**
     * Is the List Empty? Uses the ArrayList isEmpty Function
     *
     * @return Is the List Empty
     */
    @Override
    public boolean isEmpty() {
        return mCardList.isEmpty();
    }

    /**
     * How many elements are currently in the ArrayList. Uses the ArrayList
     * Size method.
     *
     * @return Size of the arrayList
     */
    @Override
    public int size() {
        return mCardList.size();
    }

    /**
     * Get and Remove the Card from the desired position in the arraylist. Starts at 0.
     * If there is no card there, return null.
     *
     * @param position Position to check for card (Starts at 0)
     * @return Found Card or null
     */
    @Override
    public Card removeCard(int position) {
        //Does the position in the array exist?
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

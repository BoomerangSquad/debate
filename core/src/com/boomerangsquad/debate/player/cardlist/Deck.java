package com.boomerangsquad.debate.player.cardlist;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.util.Constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * A Deck is a Card List, with defined rules needed for a Deck. Rules might include a max
 * amount of cards, and specialized methods that pertain to each players Deck.
 *
 * Created by denny on 14-12-23.
 */
public class Deck extends CardList{

    /**
     * Constructor
     */
    public Deck(){
        super();
        setFull(Constants.DECK_SIZE);
    }

    /**
     * Add Card to Random Position in the Deck. If successful, return true, else false.
     *
     * @param card Card to be added to the Deck
     * @return True if successful, false if not.
     */
    public boolean addCardInRandomPosition(Card card){
        Random random = new Random();
        return addCard(card, random.nextInt(size() + 1));
    }

    /**
     * Draw the First Card of The Deck. This will remove the card from the deck and return
     * the removed card. If there is no card, null is returned.
     *
     * @return First Card of the Deck or Null.
     */
    public Card drawCard(){
        return removeCard(0);
    }

    public List<Card> drawCard(int number){
        List<Card> drawnCards = new ArrayList<Card>();
        for(int i = 0; i < number; i++){
            drawnCards.add(drawCard());
        }

        return drawnCards;
    }

    /**
     * Draw a random card from the deck. This will remove the card from the deck and return
     * the removed card. If there is no card, null is returned.
     *
     * @return Random card in the deck, or null
     */
    public Card drawRandomCard(){
        Random random = new Random();
        return removeCard(random.nextInt(mCardList.size() + 1));
    }

    /**
     * Shuffle the Deck.
     */
    public void shuffleDeck() {
        Collections.shuffle(mCardList);
    }
}

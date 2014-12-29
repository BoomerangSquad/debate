package com.boomerangsquad.debate.player;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.player.cardlist.Deck;
import com.boomerangsquad.debate.player.cardlist.Hand;
import com.boomerangsquad.debate.statuseffect.StatusEffect;
import com.boomerangsquad.debate.util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Player Information. Contains the players name, health, and the status
 * effects current on the player. Also contains the players Deck and Hand.
 *
 * Created by denny on 14-12-22.
 */
public class Player {
    private String mName;
    private int mHealth;
    private List<StatusEffect> mStatusEffects;
    private Hand mHand;
    private Deck mDeck;

    /**
     * Constructor
     *
     * @param name Name of the Player
     */
    public Player(String name) {
        mName = name;
        mHealth = Constants.STARTING_HEALTH;
        mDeck = new Deck();
        mHand = new Hand();
        mStatusEffects = new ArrayList<StatusEffect>();
    }

    /**
     * Return the Players Current Name
     *
     * @return Players Name
     */
    public String getName() {
        return mName;
    }

    /**
     * Set the players Current Name
     *
     * @param name Name for the player
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Return the Players Current Health.
     *
     * @return Players Current Health
     */
    public int getHealth() {
        return mHealth;
    }

    /**
     * Set the Players Current Health
     *
     * @param health Health to Set for Player
     */
    public int setHealth(int health) {
        if(health < 0){
            mHealth = 0;
        }else{
            mHealth = health;
        }

        return mHealth;
    }

    public List<StatusEffect> getStatusEffects() {
        return mStatusEffects;
    }

    /**
     * Return the Players Current Hand.
     *
     * @return Players Current Hand.
     */
    public Hand getHand() {
        return mHand;
    }

    /**
     * Return the Players Current Deck
     *
     * @return Players Current Deck
     */
    public Deck getDeck() {
        return mDeck;
    }

    /**
     * Damage the Players Health with the amount of damage passed.
     *
     * @param damageAmount Health to be reduced from health
     * @return The new health of the player
     */
    public int removeHealth(int damageAmount){
        return setHealth(getHealth() - damageAmount);
    }

    /**
     * Draw a Card from the Players deck, and place the drawn
     * card into the players hand.
     *
     * @return Was the draw successful.
     */
    public boolean drawCard() {
        return mHand.addCard(mDeck.drawCard());
    }

    /**
     * Draw a desired Number of Cards from the Players deck, and the place
     * the drawn cards into the player Hand.
     *
     * @param number Number of Cards to Draw
     * @return List of success and failures.
     */
    public List<Boolean> drawCard(int number) {
       return mHand.addCard(mDeck.drawCard(number));
    }

    /**
     * Draw the number of Cards needed to fill the players Hand, according
     * to the Constants Full_hand. Return a Boolean of Successes.
     *
     * @return List of Success and Failures
     */
    public List<Boolean> drawMaxCards() {
        int missingCards = Constants.FULL_HAND - mHand.size();
        return drawCard(missingCards);
    }


}

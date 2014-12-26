package com.boomerangsquad.debate.card;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.player.Player;

/**
 * Card's are used by players for both stone placement and ability play. They
 * are the base of all Actions in the game.
 *
 * Created by denny on 14-12-21.
 */
public class Card {
    private Player mOwner; //Player that Owns this Card
    private String mText; //Text Display on Card

    /**
     * Constructor
     * @param owner Player that owns this Card
     * @param text //Text Display on Card
     */
    public Card(Player owner, String text){
        this.mOwner = owner;
        this.mText = text;
    }

    /**
     * Get Owner (Player that owns this Card)
     * @return Return current Player Owner of Card
     */
    public Player getOwner() {
        return mOwner;
    }

    /**
     * SetOwner
     * @param owner New Player to set as Owner
     */
    public void setOwner(Player owner) {
        this.mOwner = owner;
    }

    /**
     * Get Text display for Card
     * @return Text displayed for Card
     */
    public String getText() {
        return mText;
    }

    /**
     * Set Text
     * @param text String to set the Text as in Card
     */
    public void setText(String text) {
        this.mText = text;
    }
}

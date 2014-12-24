package com.boomerangsquad.debate.player;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.player.cardlist.Deck;
import com.boomerangsquad.debate.player.cardlist.Hand;
import com.boomerangsquad.debate.statuseffect.StatusEffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denny on 14-12-22.
 */
public class Player {
    private String mName;
    private int mHealth;
    private Sprite mSprite;
    private List<StatusEffect> mStatusEffects;
    private Hand mHand;
    private Deck mDeck;

    public Player(String name) {
        mName = name;
        mHealth = 50;
        mHand = new Hand();
        mDeck = new Deck();
        mStatusEffects = new ArrayList<StatusEffect>();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getHealth() {
        return mHealth;
    }

    public void setHealth(int health) {
        mHealth = health;
    }

    public Sprite getSprite() {
        return mSprite;
    }

    public List<StatusEffect> getStatusEffects() {
        return mStatusEffects;
    }

    public Hand getHand() {
        return mHand;
    }

    public Deck getDeck() {
        return mDeck;
    }

    public boolean drawCard() {
        return mHand.addCard(mDeck.drawCard());
    }


}

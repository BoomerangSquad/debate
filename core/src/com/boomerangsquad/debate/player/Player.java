package com.boomerangsquad.debate.player;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.statuseffect.StatusEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by denny on 14-12-22.
 */
public class Player {
    private String mName;
    private int mHealth;
    private Sprite mSprite;
    private List<StatusEffect> mStatusEffects;
    private List<Card> mHand;
    private List<Card> mDeck;

    public Player(String name) {
        mName = name;
        mHealth = 50;
        mHand = new ArrayList<Card>();
        mDeck = new ArrayList<Card>();
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

    public List<Card> getHand() {
        return mHand;
    }

    public List<Card> getDeck() {
        return mDeck;
    }

    public boolean drawCard() {
        if(!mDeck.isEmpty()){
            Random random = new Random();
            int position = random.nextInt(mDeck.size());
            mHand.add(mDeck.remove(position));
            return true;
        }
        return false;
    }


}

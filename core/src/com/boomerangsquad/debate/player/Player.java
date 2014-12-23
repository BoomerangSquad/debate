package com.boomerangsquad.debate.player;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.statuseffect.StatusEffect;

import java.util.List;
import java.util.Random;

/**
 * Created by denny on 14-12-22.
 */
public class Player {
    private String mName;
    private int mHealth;
    private String mText;
    private List<StatusEffect> mStatusEffects;
    private List<Card> mHand;
    private List<Card> mDeck;

    public Player(String name) {
        this.mName = name;
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

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
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

    public void drawCard() {
        Random random = new Random();
        int position = random.nextInt(mDeck.size());
        mHand.add(mDeck.remove(position));
    }


}

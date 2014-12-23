package com.boomerangsquad.debate.card;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.boomerangsquad.debate.player.Player;

/**
 * Created by denny on 14-12-21.
 */
public class Card {
    private Player owner;
    private Sprite sprite;
    private String text;

    public Card(Player owner, String text){
        this.owner = owner;
        this.text = text;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

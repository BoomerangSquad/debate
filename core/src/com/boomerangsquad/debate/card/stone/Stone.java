package com.boomerangsquad.debate.card.stone;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.Player;

/**
 * Stone placement for numbers on the board. Each stone has a Number and
 * a color. The stone will be placed on the board for the corresponding
 * number, and the stones color is dictated by the decided Color Enum.
 *
 * Created by denny on 14-12-21.
 */
public class Stone extends Card {

    private Color color;

    /**
     * Constructor
     *
     * @param owner Owner of the Stone
     * @param text Text to Display for Stone
     */
    public Stone(Player owner, String text) {
        super(owner, text);
        color = Color.NONE;
    }

    /**
     * Return the Color, according to the Enum.
     * @return Color Enum of Card
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the Current Color of the Stone, using the Color Enum.
     *
     * @param color Enum Color to set for Stone.
     */
    public void setColor(Color color) {
        this.color = color;
    }
}

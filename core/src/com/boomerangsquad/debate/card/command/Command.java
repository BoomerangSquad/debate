package com.boomerangsquad.debate.card.command;

import com.boomerangsquad.debate.card.Card;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.util.CommandConstants;

/**
 * Created by denny on 14-12-21.
 */
public class Command extends Card {

    private int mCost; //Cost to Place Command In Deck
    private String mDescription; //Description for Command

    /**
     * Constructor
     * @param owner Player thats owns this Command
     * @param text Text To Display for Command (Name)
     */
    public Command(Player owner, String text) {
        super(owner, text);
        mCost = CommandConstants.DEFAULT_COMMAND_COST;
        mDescription = CommandConstants.DEFAULT_COMMAND_DESCRIPTION;
    }

    /**
     * Return the Cost of Command
     * @return Cost of Command
     */
    public int getCost() {
        return mCost;
    }

    /**
     * Set the Cost of the Command
     * @param cost New Cost of Command
     */
    public void setCost(int cost) {
        this.mCost = cost;
    }

    /**
     * Get Description of Command
     * @return Description of the Command
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Set the Description of the Command
     * @param description New Description of Command
     */
    public void setDescription(String description) {
        this.mDescription = description;
    }
}

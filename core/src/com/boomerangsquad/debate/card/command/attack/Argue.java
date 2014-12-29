package com.boomerangsquad.debate.card.command.attack;

import com.boomerangsquad.debate.card.command.Command;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.util.CommandConstants;

/**
 * Created by denny on 14-12-21.
 */
public class Argue extends Command implements Attack {
    public Argue(Player owner, String text) {
        super(owner, text);
        setCost(CommandConstants.ARGUE_COST);
        setDescription(CommandConstants.ARGUE_DESCRIPTION);
    }

    @Override
    public boolean action() {
        getOwner();
        return false;
    }
}

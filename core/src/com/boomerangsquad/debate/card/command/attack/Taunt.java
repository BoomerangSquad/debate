package com.boomerangsquad.debate.card.command.attack;

import com.boomerangsquad.debate.card.command.Command;
import com.boomerangsquad.debate.player.Player;

/**
 * Created by denny on 14-12-22.
 */
public class Taunt extends Command implements Attack {
    public Taunt(Player owner, String text) {
        super(owner, text);
    }

    @Override
    public boolean action() {
        return false;
    }
}

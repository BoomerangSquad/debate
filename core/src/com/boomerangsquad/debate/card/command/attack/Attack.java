package com.boomerangsquad.debate.card.command.attack;

import com.boomerangsquad.debate.card.command.Command;
import com.boomerangsquad.debate.player.Player;

/**
 * Created by denny on 14-12-22.
 */
public class Attack extends Command {
    public Attack(Player owner, String text) {
        super(owner, text);
    }
}

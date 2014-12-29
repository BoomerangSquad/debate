package com.boomerangsquad.debate.game;

import com.boomerangsquad.debate.player.Player;

/**
 * Public Game Variables and Methods.
 *
 * Created by denny on 14-12-28.
 */
public class Game {

    public static Player mPlayerOne;
    public static Player mPlayerTwo;

    public Player getOtherPlayer(Player player){
        if(player.equals(mPlayerOne)){
            return mPlayerTwo;
        }
        return mPlayerOne;
    }
}

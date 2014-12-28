package com.boomerangsquad.testing.tests.card.command;

import com.boomerangsquad.debate.card.command.Command;
import com.boomerangsquad.debate.player.Player;
import com.boomerangsquad.debate.util.CommandConstants;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by denny on 14-12-28.
 */
@RunWith(GdxTestRunner.class)
public class CommandTest {
    Player mPlayer;
    String text;
    Command mCommand;

    @Before
    public void setUp() throws Exception {
        mPlayer = new Player("Andy");
        text = "Command";
        mCommand = new Command(mPlayer, text);
    }

    @Test
    public void creatingCommandAddsAppropriateOwnerAndText() throws Exception {
        assertEquals(mPlayer, mCommand.getOwner());
        assertEquals(text, mCommand.getText());
    }

    @Test
    public void getCostReturnsTheDefaultCost() throws Exception {
        assertEquals(CommandConstants.DEFAULT_COMMAND_COST, mCommand.getCost());
    }

    @Test
    public void getCostReturnsTheDefaultDescription() throws Exception {
        assertEquals(CommandConstants.DEFAULT_COMMAND_DESCRIPTION, mCommand.getDescription());
    }

    @Test
    public void settingCostChangesCostToNewValue() throws Exception {
        mCommand.setCost(10);
        assertEquals(10, mCommand.getCost());
    }

    @Test
    public void settingDescriptionChangesToNewValue() throws Exception {
        mCommand.setDescription("Test");
        assertEquals("Test", mCommand.getDescription());
    }
}

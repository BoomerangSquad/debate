package com.boomerangsquad.testing.tests;

import static org.junit.Assert.*;

import com.boomerangsquad.debate.game.WorldController;
import com.boomerangsquad.testing.GdxTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class WorkingTests {

    @Test
    public void test() {
        WorldController wc = new WorldController();
        assertTrue(wc.iTrue());
    }



}

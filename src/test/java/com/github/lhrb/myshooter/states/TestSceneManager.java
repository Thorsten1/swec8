package com.github.lhrb.myshooter.states;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

public class TestSceneManager {

    SceneManager testSm ;

    @Before
    public void setUp() {
        testSm = mock(SceneManager.class);
    }

    @After
    public void tearDown() {
        testSm = null;
    }

    @Test
    public void testSetStateValid() {
        testSm.setState("GameSingle");
        assertTrue(testSm.getState() instanceof GameSingle);
    }

    @Test
    public void testSetStateInvalid() {
        testSm.setState("NoState");
        assertTrue(testSm.getState() instanceof MainMenu);
    }

}

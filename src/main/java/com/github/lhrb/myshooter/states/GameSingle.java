package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

/**
 * @author Christoph Waninger
 * @version 0.1
 * This is our GameSingle in our StateMachine
 * Here we define whatever has to be done in the Singleplayer, especially the rendering
 *
 */
public class GameSingle implements State {
    /**
     * Uses the Interface function to render our Singleplayer
     */
    @Override
    public void stateRender(){
        GL11.glColor3f(0f, 1.0f, 1.0f);
        GL11.glRectf(0,0,650,480);
    }
    /**
     * Uses the Interface function to render our startPoint for the Singleplayer
     */
    @Override
    public void stateEnter(){
        // Nothing to be done so far
    }

    /**
     * Uses the Interface function to render our exitPoint for the Singleplayer
     */
    @Override
    public void stateExit(){
        // Nothing to be done so far
    }
}

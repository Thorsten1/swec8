package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

/**
 * @author Thorsten Rösler, Christoph Waninger
 * @version 0.1
 * This is our Highscore table in our StateMachine
 * Here we define whatever has to be done for the Highscore visualization
 *
 */
public class Highscore implements State {
    /**
     * Uses the Interface function to render our Highscore table
     */
    @Override
    public void stateRender(){
        GL11.glColor3f(0f, 0f, 1.0f);
        GL11.glRectf(0,0,650,480);
    }
    /**
     * Uses the Interface function to render our startPoint for the Highscore
     */
    @Override
    public void stateEnter(){
        // Nothing to be done so far
    }

    /**
     * Uses the Interface function to render our exitPoint for the Highscore
     */
    @Override
    public void stateExit(){
        // Nothing to be done so far
    }
}

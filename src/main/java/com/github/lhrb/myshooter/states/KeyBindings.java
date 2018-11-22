package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

/**
 * @author Thorsten Rösler, Christoph Waninger
 * @version 0.1
 * This is our KeyBindings in our StateMachine
 * Here we define the Key Binding overview
 *
 */
public class KeyBindings implements State {
    /**
     * Uses the Interface function to render our Singleplayer
     */
    @Override
    public void stateRender(){
        GL11.glColor3f(0f, 1.0f, 0f);
        GL11.glRectf(0,0,650,480);
    }
    /**
     * Uses the Interface function to render the Overview
     */
    @Override
    public void stateEnter(){
        // Nothing to be done so far
    }

    /**
     * Uses the Interface function to render our exitPoint for the Key Bindings
     */
    @Override
    public void stateExit(){
        // Nothing to be done so far
    }
}

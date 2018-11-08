package com.github.lhrb.myshooter.states;

import org.lwjgl.opengl.GL11;

/**
 * @author Christoph Waninger
 * @version 0.1
 * This is our MainMenu in our StateMachine
 * Here we define whatever has to be done in the MainMenu, especially the rendering
 *
 */
public class MainMenu implements State {
    /**
     * Uses the Interface function to render our Main Menu
     */
    @Override
    public void stateRender(){
        GL11.glColor3f(1.0f, 0f, 0f);
        GL11.glRectf(0,0,650,480);
    }

    /**
     * Uses the Interface function to render our startPoint for the Main Menu
     */
    @Override
    public void stateEnter(){
        // Nothing to be done so far, maybe not even needed
    }

    /**
     * Uses the Interface function to render our exitPoint for the Main Menu
     */
    @Override
    public void stateExit(){
        // Nothing to be done so far, maybe not even needed
    }
}

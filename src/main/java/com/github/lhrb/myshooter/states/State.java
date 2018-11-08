package com.github.lhrb.myshooter.states;

/**
 * @author Christoph Waninger
 * @version 0.1
 * This is our Interface for our StateMachine
 * We have defined all different state functions in here, that can be called from SceneManager
 *
 */
public interface State {
    public void stateRender();
    public void stateEnter();
    public void stateExit();
}

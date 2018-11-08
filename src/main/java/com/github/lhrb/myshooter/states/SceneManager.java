package com.github.lhrb.myshooter.states;

import java.util.HashMap;

/**
 * @author Christoph Waninger
 * @version 0.1
 * This class manages our states in the Game
 *
 * It initializes all states that are available and is used to access the Interface
 * to render depending on current state
 */
public class SceneManager {

    HashMap<String,State> gameStates = new HashMap<String, State>();
    private State current;

    /**
     * Default constructor adding all states to HashMap and defining the startstate
     */
    public SceneManager() {
        gameStates.put("MainMenu", new MainMenu());
        gameStates.put("GameSingle", new GameSingle());
        gameStates.put("PauseMenu", new PauseMenu());
        current = gameStates.get("MainMenu");
    }

    /**
     * Sets the current state to another
     * @param newState the new State as State String for the HashMap Key
     */
    public void setState(String newState){
        if (newState != null && gameStates.containsKey(newState)){
            current = gameStates.get(newState);
        }
    }

    /**
     * Returns the current state
     * @return the actual state which is running
     */
    public State getState() {
        return current;
    }

    /**
     * Renders the current state we got from our HashMap
     * It calls the Method from the Interface depending on our object Type
     */
    public void stateRender() {
        current.stateRender();
    }

    /**
     * Renders the start of our current state we got from our HashMap
     * It calls the Method from the Interface depending on our object Type
     */
    public void stateEnter() {
        current.stateEnter();
    }

    /**
     * Renders the end of our current state we got from our HashMap
     * It calls the Method from the Interface depending on our object Type
     */
    public void stateExit() {
        current.stateExit();
    }

}
